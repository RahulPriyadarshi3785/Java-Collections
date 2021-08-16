package streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamUsages {

	public static void streamUsages() {
		String[] arr = new String[]{"a", "b", "c"};
		Stream<String> stream = Arrays.stream(arr);
		stream.forEach(System.out::print);
		System.out.println();
		stream = Stream.of("a", "b", "c");
		stream.forEach(x -> System.out.print(x));
		System.out.println();
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(arr));
		list.addAll(Arrays.asList("1", "a", "2", "b", "24", "89"));
		list.stream()
			.forEach(System.out::print);
		System.out.println();
		list.parallelStream() // doesnot maintain order but speed increases
			.forEach(System.out::print);
		System.out.println();
		System.out.println(list.parallelStream()
							   .distinct()
							   .count());
		System.out.println(list.parallelStream()
			.anyMatch(x -> x.contains("2")));
		System.out.println(
				list.parallelStream()
				.anyMatch(a -> a.equals("2")));
		
		list.add("One");
		list.add("OneAndOnly");
		list.add("Derek");
		list.add("Change");
		list.add("factory");
		list.add("justBefore");
		list.add("Italy");
		list.add("Italy");
		list.add("Thursday");
		list.add("");
		list.add("");
		list.parallelStream()
			.filter(x -> x.contains("d") || x.contains("D"))
			.forEach(System.out::print);
		System.out.println();
		list.stream()
		.filter(x -> {	boolean isDigit=true;
						for(int i=0; (i<x.length()) && isDigit; i++)
							isDigit=isDigit && Character.isDigit(x.charAt(i));
						return isDigit;
					 })
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		list.stream()
		.filter(x -> {	try {Integer.parseInt(x);} catch(Exception e) {return false;}
						return true;
					 })
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		List<Integer> intuInt = list.stream()
		.filter(x -> {	try {Integer.parseInt(x);} catch(Exception e) {return false;}
						return true;
					 })
		.map(Integer::parseInt)
		.collect(Collectors.toList())
		.parallelStream()
		.filter(xa ->xa%2 == 0)
		.collect(Collectors.toList());
		System.out.println(intuInt);
		System.out.println(intuInt.size());
		intuInt = list.stream()
		.filter(x -> {	try {Integer.parseInt(x);} 
						catch(Exception e) {return false;}
						String lastDigit = Character.toString(x.charAt(x.length()-1)); 
						return (Integer.parseInt(lastDigit)&1)==0;
					 }) // 0 1 10 11 100 101 110 111 1000 1001
		.map(x -> Integer.parseInt(x)+100)
		.collect(Collectors.toList());
		PrintStream o = System.out;
		o.println(intuInt);
		o.println(intuInt.size());
		o.println(list);
		List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
		int sum = intList.parallelStream().reduce(1,(a,b) -> a*b);
		IntStream.range(1, 10+1).forEach(o::print);
		o.println();
		o.println(sum);
		IntStream.iterate(2, n -> n+2)
				.limit(10)
				.forEach(x -> o.print(x + ", "));
		o.println();
		Arrays.asList("adcd", "bbcd", "cxcd")
		.stream()
		.skip(1)//Skips first n items from list 
		.map(x -> x.substring(1, 3))
		.collect(Collectors.toList())
		.forEach(x -> o.print(x + ", "));
		o.println();
		o.println(Arrays.asList("adcd", "bbcd", "cxcd")
		.stream()
		.collect(Collectors.joining(", ")));
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		 
		List<List<Integer>> ll = Arrays.asList(list1, list2, list3);
		o.println(ll.stream()
		.flatMap(x -> x.stream()) // unwraps a stream
		.collect(Collectors.toList()) // makes a list from stream
		.stream()
		.map(x -> x.toString())
		.collect(Collectors.joining(", ")));
		// joining works only on string
		o.println(ll.stream()
		.flatMap(x -> x.stream())
		.map(x -> x.toString())
		.collect(Collectors.joining(", ")));
		// joining works only on string
		Random r = new Random();
		r.ints(10, 1, 15)
		.forEach(x -> o.print(x + ", "));
		o.println();
		r.ints(10, 0, 26)
		.forEach(x -> o.print((char)('a' + x) + ", "));
		o.println();
		o.println(intList);
		o.println(intList.stream().max((x, y) -> Integer.compare(x, y)).get());
		o.println(intList.stream().min((x, y) -> x.compareTo(y)).get());
	}

	public static void main(String[] args) {
		streamUsages();
	}

}
