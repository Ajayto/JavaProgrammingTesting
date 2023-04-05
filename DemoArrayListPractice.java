package DemoArrayList;

import java.util.ArrayList;

public class DemoArrayListPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList<>();
		al.add(10);
		al.add(10);
		al.add("Tom");
		al.add("Sam");
		al.add("Tom");
		al.add(20.3f);
		al.add(1, 5.24f);
		System.out.println(al.contains("Tom"));
		System.out.println(al);
		
		ArrayList al1=new ArrayList<>();
		al1.add(20);
		al1.add("Sam");
		System.out.println(al1);
		
		
		System.out.println(al.containsAll(al1));

		//System.out.println(al.addAll(al1));
	//	System.out.println(al.indexOf("Tom"));
		//System.out.println(al1.addAll(al));
		//al.remove(1);
		//al.remove(Integer.valueOf(10));
	//	al.removeAll(al1);
		
		

	}

}
