package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListTest {

	private static void arrayList() {
		List<Integer> al = new ArrayList<>(Arrays.asList(3,6,3,9,1,6,232,2,55,35,5));
		al.add(560);
		al.add(1, 234);
		List<Integer> am =  Arrays.asList(120,24,57,25,97);
		al.addAll(am);
		al.addAll(1, Arrays.asList(1,2,3));
		List<Integer> t = new ArrayList<>(al);
		t.clear();
		Boolean b = al.contains(120);
		Boolean c = al.containsAll(t);
		Boolean a = al.equals(new ArrayList<>(al));
		al.forEach(x->System.out.print(x+" "));
		System.out.println();
		System.out.println(al.get(al.size()-1));
		System.out.println(al instanceof java.util.ArrayList);
		System.out.println(al.indexOf(6));
		System.out.println(al.isEmpty());
		System.out.println(al.lastIndexOf(6));
		System.out.println(al.remove(6));
		System.out.println(al);
		System.out.println(al.removeAll(am));
		System.out.println(al);
		al.removeIf(x->x%2==0);
		System.out.println(al);
		al.set(0, 500);
		System.out.println(al);
		System.out.println(Arrays.toString(al.toArray()));
		System.out.println(al.subList(3, 7));
		Collections.sort(al);
		System.out.println(al);
		for(int i:al)	System.out.print(i+" ");
		System.out.println();
		for(int i:al)
			System.out.print(i + " ");
		System.out.println();
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()) {	
			System.out.print(li.next() + " ");
		}
		System.out.println();
		Iterator<Integer> i = al.iterator();
		while(i.hasNext())	System.out.print(i.next() + " ");
	}
	
	private static List<Integer> removeEvenElements(List<Integer> list) {
//		list.removeIf(x ->(x&1)==0);
		ListIterator<Integer> liter = list.listIterator();
		while(liter.hasNext()) {
			if((liter.next()&1)==0) {
				liter.previous();
				liter.remove();
			}
		}
		return list;
	} 
	
	private static void sorting(List<Integer> a) {
//		a.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer i, Integer j) {
//				// 3, 2 ->  1 or +ve
//				// 2, 3 -> -1 or -ve
//				// 4, 4 ->  0
//				return j-i;
////				return Integer.compare(j, i);
//			}
//			
//		});
		a.sort((i,j) -> i-j);
//		a.sort((i, j) -> Integer.compare(j, i));
	}
	
	public static void main(String[] args) {	
//		arrayList();
		List<Integer> l = new ArrayList<>(
				Arrays.asList(120,24,57,25,97));
//		sorting(l);
//		System.out.println(l);
		
		linkedList();
	}

	private static void linkedList() {
		LinkedList<Integer> ll = new LinkedList<>(Arrays.asList(3,6,3,9));
		/* 
		 * These methods are available only for LinkedList reference type
		 * */ 
		ll.addFirst(13);
		ll.addLast(4);//similar to add method
		
		for(Iterator<Integer> it=ll.descendingIterator(); it.hasNext(); )
			System.out.print(it.next() + ", ");
		System.out.println();
		ll.offer(500);//updates in end
		ll.offerFirst(100);//updates in start
		ll.offerLast(10000);//updates in end
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
	}

}
