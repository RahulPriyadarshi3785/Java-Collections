package streams;
import java.util.*;
public class Solution {
    public int countInversions(ArrayList<Integer> a) {
        if(a.size()<=1) return 0;
        int res=mergesort(a, 0, a.size()-1);
        // System.out.println(a);
        return res;
    }
    
    private int mergesort(ArrayList<Integer> a, int s, int e) {
        int count=0;
        if(s<e) {
            int m=(e+s)/2;
            count+=mergesort(a, s, m);
            count+=mergesort(a, m+1, e);
            count+=merge(a, s, m, e);
        }
        return count;
    }
    
    private int merge(ArrayList<Integer> a, int s, int m, int e) {
        // System.out.println(s+":"+m+":"+e);
        // Left subarray
        List<Integer> left= new ArrayList<>();
        for(int i=s; i<=m; i++)	left.add(a.get(i));
        // Right subarray
        List<Integer> right= new ArrayList<>();
        for(int i=m+1; i<=e; i++)	right.add(a.get(i));
        System.out.println(left+ " "+ right);
        int i=0, j=0, k=s, swaps=0;
        while(i<left.size() && j<right.size())
            if(left.get(i)<right.get(j)) a.set(k++, left.get(i++));
            else {
                swaps+=((m+1)-(s+i));
                a.set(k++, right.get(j++));
            }
        System.out.println(swaps);
        while(i<left.size()) {
        	a.set(k++, left.get(i++));
        }
        while(j<right.size())   a.set(k++, right.get(j++));
        return swaps;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>(
				Arrays.asList( 84, 2, 37, 3, 67, 82, 19, 97, 91, 63,
						27, 6, 13, 90, 63, 89, 100, 60, 47, 96, 54, 
						26, 64, 50, 71, 16, 6, 40, 84, 93, 67,
						85, 16, 22, 60));
//		ArrayList<Integer> al = new ArrayList<>(
//				Arrays.asList( 84, 2));
		int[] a = new int[al.size()];
		for(int i=0; i<al.size(); i++)	a[i]=al.get(i);
		System.out.println(new Solution().countInversions(al));
		System.out.println("---------------------------");
		System.out.println(new Solution().countInversions(a));
	}

	public int countInversions(int[] a) {
        return mergeSortAndCount(a, 0, a.length-1);
    }
    
    // Function to count the number of inversions
    // during the merge process
    private int mergeAndCount(int[] arr, int l,
                                     int m, int r)
    {
 
        // Left subarray
        int[] left = Arrays.copyOfRange(arr, l, m + 1);
 
        // Right subarray
        int[] right = Arrays.copyOfRange(arr, m + 1, r + 1);
 
        int i = 0, j = 0, k = l, swaps = 0;
        System.out.println(Arrays.toString(left)+ " "+ Arrays.toString(right));
 
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];
            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }
        System.out.println(swaps);
        while (i < left.length)
            arr[k++] = left[i++];
        while (j < right.length)
            arr[k++] = right[j++];
        return swaps;
    }
 
    // Merge sort function
    private int mergeSortAndCount(int[] arr, int l,
                                         int r)
    {
 
        // Keeps track of the inversion count at a
        // particular node of the recursion tree
        int count = 0;
 
        if (l < r) {
            int m = (l + r) / 2;
 
            // Total inversion count = left subarray count
            // + right subarray count + merge count
 
            // Left subarray count
            count += mergeSortAndCount(arr, l, m);
 
            // Right subarray count
            count += mergeSortAndCount(arr, m + 1, r);
 
            // Merge count
            count += mergeAndCount(arr, l, m, r);
        }
 
        return count;
    }
}
