package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysMethod {

	public static void arraysMethod() {
		int[] ai = new int[3];
		int[] bi = new int[] {3,1,2};
		char[] testArray = new char[26];
		for(char i='a'; i<'z'; i++)
				testArray[i-'a']=i;
		for(int i: bi) {
			System.out.print(i);
		}
		// 312
		System.out.println();
		for(Integer i: ai)
			System.out.print(i);
		// 000
		System.out.println();
		System.out.println(Arrays.toString(testArray));
		//[a, b, c, ..., z]
		System.out.println(Arrays.asList(ai));
		/*Note
		 * List<char> is not allowed (so Arrays.asList cannot return List<char>). 
		 * Instead Arrays.asList interprets its input as a single object and 
		 * returns a list with that single element.*/
		int[][] t2 = new int[2][3];
		t2[0][0]=1;
		t2[0][1]=2;
		t2[0][2]=3;
		t2[1][0]=4;
		t2[1][1]=5;
		t2[1][2]=6;
		for(int i=0; i<t2.length/*2*/; i++) {
			for(int j=0; j<t2[i].length/*3*/; j++) {
				System.out.print(t2[i][j] + ", ");
			}
			System.out.println();
		}
		// 1, 2, 3, 
		// 4, 5, 6,
		int[][] anonymous = {{1,2,3,4}, {5,6,7,8,9,10}};
		for(int[] i: anonymous)
			for(int j: i)
				System.out.print(j + ", ");
		System.out.println();
//		1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 
		System.out.println(Arrays.deepToString(anonymous));
//		[[1, 2, 3, 4], [5, 6, 7, 8, 9, 10]]
		System.out.println(Arrays.asList(1,2,3,4,5));
		// List -> [1,2,3,4,5]
		System.out.println(Arrays.binarySearch(testArray, 'y'));
		//24
		System.out.println(Arrays.binarySearch(testArray, 0, 20, 'y'));
		//-21
		printsArray(Arrays.copyOf(testArray, 5));
		// [a,b,c,d,e]
		printsArray(Arrays.copyOf(bi, 5));
		// [3,1,2,0,0]
		printsArray(Arrays.copyOfRange(testArray, 1, 5));
		// [b,c,d,e]
		Arrays.sort(bi);
		printsArray(bi);
		// [1,2,3]
		int[] ci = new int[] {1,2,3};
		System.out.println(Arrays.equals(bi, ci));
		// true
	}
	
	private static void printsArray(char[] a) {
		System.out.println(Arrays.toString(a));
	}
	
	private static void printsArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		arraysMethod();
	}

}
