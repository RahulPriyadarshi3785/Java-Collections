package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetTest {

	private static void hashSetmethods() {
		Set<Integer> s = new HashSet<>();
		System.out.println(s.add(5));
		System.out.println(s.add(5));
		System.out.println(s);
		List<Integer> l=Arrays.asList(3,6,1,6,2);
		s.addAll(l);
		List<Integer> al = new ArrayList<>(l);
		al.add(10);
		System.out.println(s);
		System.out.println(new HashSet<>(l));
		System.out.println(s.contains(6));
		System.out.println(s.containsAll(l));
		System.out.println(s.containsAll(al));
		System.out.println(s.size());
		System.out.println(s.isEmpty());
		System.out.println(s.remove(1));
		System.out.println(s);
	}

	public static void main(String[] args) {
//		hashSetmethods();
//		linkedHashSetmethods();
		treeSetMethods();
	}

	private static void treeSetMethods() {
		TreeSet<Integer> s = new TreeSet<>(Collections.reverseOrder());
		System.out.println(s.add(5)); //true
		System.out.println(s.add(5)); //false
		System.out.println(s); // [5]
		List<Integer> l=Arrays.asList(3,6,1,6,2);
		s.addAll(l);
		List<Integer> al = new ArrayList<>(l);
		al.add(10);
		System.out.println(s); //[6,5,3,2,1]
		// maintains sorted order
		System.out.println(new TreeSet<>(l));//[6,3,2,1]
		System.out.println(s.contains(16));//false
		System.out.println(s.containsAll(l));//true
		System.out.println(s.containsAll(al));//false
		System.out.println(s.size());//5
		System.out.println(s.remove(1));//true
		System.out.println(s);//[6,5,3,2]
		System.out.println(s.ceiling(4)); //log(n) -> >=4 
		System.out.println(s.higher(5)); //log(n) -> >5
		System.out.println(s.floor(4)); //log(n) -> <=4
		System.out.println(s.lower(5)); //log(n) -> <5
		System.out.println(s.last()); //O(1) 
		System.out.println(s.first()); //O(1) 
		System.out.println(s.pollFirst()); //O(1) 
		System.out.println(s);//[5,3,2]
		System.out.println(s.pollLast()); //O(1) 
		System.out.println(s);//[5,3]
		s.clear();
		System.out.println(s.isEmpty());//true
	}

	private static void linkedHashSetmethods() {
		Set<Integer> s = new LinkedHashSet<Integer>();
		System.out.println(s.add(5)); //true
		System.out.println(s.add(5)); //false
		System.out.println(s); // [5]
		List<Integer> l=Arrays.asList(3,6,1,6,2);
		s.addAll(l);
		List<Integer> al = new ArrayList<>(l);
		al.add(10);
		System.out.println(s); //[5,3,6,1,2]
		// maintains insertion order
		System.out.println(new LinkedHashSet<>(l));//[3,6,1,2]
		System.out.println(s.contains(16));//false
		System.out.println(s.containsAll(l));//true
		System.out.println(s.containsAll(al));//false
		System.out.println(s.size());//5
		System.out.println(s.remove(1));//true
		System.out.println(s);//[5,3,6,2]
		s.clear();
		System.out.println(s.isEmpty());//true
	}

}
