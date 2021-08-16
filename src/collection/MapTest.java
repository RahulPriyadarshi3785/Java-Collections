package collection;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapTest {

	private static void mapTest() {
		//Map.of makes an unmodifiable map
		Map<Integer, String> m = Map.of(2,"Shilpa", 
				   3, "Shipu", 
				   4, "Shipam",
				   5, "Shipu", 
				   6, "Shipu", 
				   7, "Shipam",
				   8, "Shipu", 
				   9, "Shipu", 
				   10, "Shipam",
				   1, "Shipu");
		//Max 10 key, value pairs
		System.out.println(m);
		m = Map.copyOf(m);
		System.out.println(m);
	}
	
	private static void hashMapTest() {
		Map<String, Integer> m = Map.of("Shilpa", 5, 
				   "Shipu", 3,
				   "Shipam",4, 
				    "Shipu2", 5,
				    "Shipu3", 6,
				    "Shipam2", 7,
				    "Shipu1", 8,
				    "Shipu4", 9,
				    "Shipam3", 10,
				    "Shipu5", 1);
		//Max 10 key, value pairs
		//new Hashmap() makes an modifiable map
		HashMap<String, Integer> hm = new HashMap<>(m);
		//random order
		System.out.println(hm);//sare values
		hm = new HashMap<>();
		System.out.println(hm.put("pricess ki duniya", 13));// null
		System.out.println(hm.put("zoo ki duniya", 13));//pricess ki duniya
		System.out.println(hm.put(null, 88));//null
		hm.putAll(m);
		System.out.println(hm.containsKey(13));//true
		System.out.println(hm.containsKey(15));//false
		System.out.println(hm.equals(new HashMap<>(hm)));//true
		//values check krta hai
		System.out.println(hm.isEmpty());//false
		System.out.println((new HashMap<>()).isEmpty());//true
		System.out.println(hm.get(13));//zoo ki duniya
		System.out.println(hm.getOrDefault("76", 76));//twenty
		System.out.println(hm.size());//12
		System.out.println(hm.keySet());//keys
		System.out.println(hm.containsValue("cake ki duniya"));//true
		System.out.println(hm.values());//sare values
		System.out.println(hm.remove(1));//Shipu
		System.out.println(hm.remove(99));//null
		for(String k : hm.keySet())
			System.out.print(k + " ");
		System.out.println();
		for(Integer v : hm.values())
			System.out.print(v + " ");
		System.out.println();
		for(Map.Entry<String, Integer> e : hm.entrySet())
			System.out.print(e.getKey() + " -> " + e.getValue()+ ", ");
		System.out.println();
		hm.clear();
		System.out.println(hm.size());//0
	}

	private static void linkedHashMapTest() {
		LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<>();
		System.out.println(lhm.put(2, 3));//null
		System.out.println(lhm.put(2, 3));//3
		System.out.println(lhm.put(-2, -3));//null
		System.out.println(lhm.keySet());//2 -2
		System.out.println(lhm.values());//3 -3
		System.out.println(lhm);//
		for(Map.Entry<Integer, Integer> e : lhm.entrySet())
			System.out.println(e.getKey() + ":" + e.getValue());
	}
	
	public static void main(String[] args) {
//		hashMapTest();
		linkedHashMapTest();
//		mapTest();
	}

}
