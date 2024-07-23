package Cursors_Collections;

import java.util.HashSet;
import java.util.Iterator;

public class Iterator_Cursor {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		h.add(10);
		h.add("Rajan");
		h.add(22.33);
		h.add('M');
		System.out.println(h);
		
		Iterator it= h.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		

	}

}
