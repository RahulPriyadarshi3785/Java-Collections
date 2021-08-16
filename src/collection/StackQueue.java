package collection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	private void stack() {
		Stack<Integer> s = new Stack<>();
	}

	private void queue() {
		Queue<Integer> q = new LinkedList<>();
	}

	private static void priorityQueue() {//heap
		Queue<Integer> maxHeap = new PriorityQueue<>(10, (i,j)->j-i);//descending
		maxHeap.add(8);//bad pragramming practice
		// 8
		maxHeap.addAll(Arrays.asList(3,9,5,7,2));// 9 8 7 5 3 2
		maxHeap.offer(18);//good pragramming practice
		// 18 9 8 7 5 3 2
		System.out.println(maxHeap.contains(18));//true
		maxHeap.removeAll(Arrays.asList(9,5,7,2));
		//18 8 3
		maxHeap.remove(new Integer(3));
		//18 8
		System.out.println(maxHeap.poll());// 18
		System.out.println(maxHeap.peek());// 8
		System.out.println(maxHeap);// 8
		System.out.println(maxHeap.size());//1
		System.out.println(maxHeap.isEmpty());//false
		maxHeap.clear();
	}
	
	public static void main(String[] args) {
		priorityQueue();
	}

}
