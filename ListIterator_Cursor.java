package Cursors_Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIterator_Cursor {

	public static void main(String[] args) {
		ArrayList a= new ArrayList();
		a.add(10);
		a.add("Rajan");
		a.add(22.33);
		a.add('M');
		System.out.println(a);
		
		ListIterator it= a.listIterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		

	}

}
