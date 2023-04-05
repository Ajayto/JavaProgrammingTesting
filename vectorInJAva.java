package DemoArrayList;

import java.util.ArrayList;
import java.util.Vector;

public class vectorInJAva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList al=new ArrayList<>();
al.add(100);
al.add("Tom");
al.add(200);
al.add(300);
		System.out.println("al  =  "+al);
		
		Vector v=new Vector<>();
v.addElement(10);
v.addElement("Sam");
v.addElement('c');
v.addElement(20.35f);
v.addElement(20.35f);
v.addElement(null);
v.addElement(true);

v.add(2,20 );
v.addAll(3, al);
v.remove(2);
for(Object obj:v) {
System.out.println(obj);
}
/*System.out.println("vl  = " +v);
System.out.println(v.containsAll(al));


System.out.println(v.removeAll(al));
System.out.println("vl  = " +v);
*/
	}

}
