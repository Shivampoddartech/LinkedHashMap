package map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Person {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(5000, "Books");
		tm.put(15000, "Bags");
		tm.put(50000, "Shoes");
		tm.put(2500, "EarBuds");

		System.out.println(tm);
		
		  Collection<String> values = tm.values();

	        for (String value : values) {
	            System.out.println(value);
	        }

		Set<Integer> s = tm.keySet();

		for (Integer key : s) {
			System.out.println(key + " " + tm.get(key));
		}
	}
}
