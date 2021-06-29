package Collection_Examples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Ex2 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Pachora");
		al.add("Nagpur");
		al.add(null);
		
		al.add("Pune");
		al.add(null);
		al.add("Nashik");
		al.add("Jalgaon");
		
		System.out.println(al);
		System.out.println(al.indexOf("Pachora"));
		System.out.println("Element at index 1 is "+al.get(1));
		System.out.println("Does list contains Talegaon "+al.contains("Talegaon"));
		System.out.println("Is arraylist empty - "+al.isEmpty());
		System.out.println("size of arraylist is "+al.size());
		System.out.println(al);
		
		
		//to iterate arraylist using Iterator
		Iterator<String> it=al.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
	}
	
	
}
