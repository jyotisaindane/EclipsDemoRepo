package Collection_Examples;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex3 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("First");
		al.add("Second");
		al.add("Third");
		System.out.println("Before Actual arraylist " + al);

		List<String> list = new ArrayList<String>();
		list.add("One");
		list.add("Two");
		al.addAll(list);
		System.out.println("After copy arraylist " + al);
		/*
		 * al.clear(); System.out.println("After clear arraylist is " + al);
		 */

	}
}
