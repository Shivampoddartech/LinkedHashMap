package map;

import java.util.HashMap;

public class Demo {
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "Shivam");
		hm.put("Ravi", 80000);
		hm.put(450000, hm);
		hm.put("Seema", "Salary");
		System.out.println(hm);
		System.out.println("----------");
		
		System.out.println(hm.get(10));
		System.out.println(hm.get("Ravi"));
		System.out.println(hm.get("salary"));
		System.out.println("-------");
		System.out.println(hm.remove(10));
		System.out.println(hm);
	}
}
