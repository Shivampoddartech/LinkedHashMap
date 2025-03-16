package map;

import java.util.Set;
import java.util.TreeMap;

public class Fruits {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Apple",250 );
		tm.put("Banana", 50);
		tm.put("Mango",150 );
		tm.put("Orange", 500);
		System.out.println(tm);
		Set <String > s1 =tm.keySet();
		for ( String key : s1) {
			System.out.println(key + " " + tm.get(key));
	}

	
	}
}
