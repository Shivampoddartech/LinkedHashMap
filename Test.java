package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap();
		hm.put("RedChief", 3000);
		hm.put("Rebook", 12000);
		hm.put("Adidas", 13000);
		hm.put("Bata", 1000);

		System.out.println(hm);
		Set <String> s = hm.keySet();
		for(String obj : s) {
			System.out.println(obj + " "+ hm.getOrDefault("Bata", 1000));
		}

		System.out.println("---------");
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(4500, "Java");
		lhm.put(7500, "Sql");
		lhm.put(1500, "Html");
		lhm.put(1200, "css");
		lhm.put(500, "JavaScript");
		
		System.out.println(lhm);
		Set<Integer> s1 = lhm.keySet();
		
		for (Object obj : s1) {
			System.out.println(obj + " " + lhm.get(obj));
		}
	}
}
