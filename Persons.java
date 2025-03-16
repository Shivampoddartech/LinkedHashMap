package map;

import java.util.*;

public class Persons {
	public static void main(String[] args) {
		/*
		 * LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		 * lhm.put(1000, "Shoes"); lhm.put(2000, "Redchief"); lhm.put(3000, "Puma");
		 * lhm.put(4000, "Adidas"); lhm.put(100, "Reebok"); System.out.println(lhm);
		 * 
		 * 
		 * Set <Integer> s1 = lhm.keySet(); for (Integer key : s1) {
		 * System.out.println(key + " "+ lhm.get(key)); } }
		 */
		/*
		 * HashMap<Integer, String> hm = new HashMap<Integer, String>(); hm.put(1000,
		 * "t-shirt"); hm.put(2000, "Jeans"); hm.put(5000, "Shoes"); hm.put(100,
		 * "Belt"); System.out.println(hm);
		 * 
		 * Set <Integer> s = hm.keySet(); for( Integer key : s) { System.out.println(key
		 * + " " + hm.get(key)); }
		 */
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(200, "biskuit");
		tm.put(500, "Cofee");
		tm.put(2000, "Pizza");
		tm.put(400, "BrownSugar");
		System.out.println(tm);
		
		Set < Integer> s1 =  tm.keySet();
		for( Integer integer : s1) {
			System.out.println(integer + " " +tm.get(integer));
		}
		

	}
}