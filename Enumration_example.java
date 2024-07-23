package Cursors_Collections;

import java.util.Enumeration;
import java.util.Vector;

public class Enumration_example {

	public static void main(String[] args) {
		Vector v= new Vector();
		v.add(10);
		v.add("Rajan");
		v.add(22.33);
		v.add('M');
		System.out.println(v);
		
		
		Enumeration e= v.elements();
		while(e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
			
		}
		

	}

}
