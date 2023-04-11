package DemoArrayList;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap tm=new TreeMap<>();
tm.put(101, "Sudha");
tm.put(102, "Rani");
tm.put(104, "Raj");
tm.put(100, "Sudha");
tm.put(107, "abc");
NavigableMap nm=tm.descendingMap();
System.out.println(tm);
//System.out.println(tm.descendingMap());
System.out.println(nm);
	}

}
