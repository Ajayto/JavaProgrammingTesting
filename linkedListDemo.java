package DemoArrayList;

import java.util.LinkedList;

public class linkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList ll=new LinkedList<>();
ll.add(10);
ll.add("Tom");
ll.add(1, 25);
ll.add("Tom");
ll.add(10.25f);
ll.add(null);
ll.add('c');
ll.add(true);
System.out.println(ll);

ll.add(5, "ILU");
ll.addFirst("Sam");
ll.addLast("Ram");
System.out.println(ll.contains("ILU"));
System.out.println(ll.getLast());
System.out.println(ll.peek());
System.out.println(ll.poll());
System.out.println(ll.pop());
System.out.println(ll.pollLast());
System.out.println("ll new = "+ll);

}
	

}
