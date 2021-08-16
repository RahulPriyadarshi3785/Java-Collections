package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Collections class -> Utility methods for Collection
 * Collection Interface
 */


public class CollectionsTest {

	private static void collectionMethods() {
		List<Integer> num = new ArrayList(Arrays.asList(3,6,3,9,1,6,232,2,55,35,5));
		Collections.addAll(num, 12, 34, 556, 73, 1, 23, 26);
		System.out.println("addAll" + num);
		Collections.sort(num, 
				(a, b) -> Integer.compare(a, b));
		System.out.println("sort using compare" + num);
		Collections.sort(num, 
				(a, b) -> b-a);
		System.out.println("Dec. sort using compare" + num);
		Collections.sort(num);
		System.out.println("sort" + num);
	}
	
	public static void main(String[] args) {
		CollectionsTest.collectionMethods();
	}

}
