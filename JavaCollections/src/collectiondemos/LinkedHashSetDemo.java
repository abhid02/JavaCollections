package collectiondemos;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) 
	
	{
		//LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		
		//HashSet lset=new HashSet();
//HashSet:-Insertion order not preserved and duplicates not allowed
		
		LinkedHashSet lset=new LinkedHashSet();
//LinkedHashSet:- Insertion order preserved and duplicates not allowed

		lset.add(100);
		lset.add(200);
		lset.add(300);
		lset.add(400);
		lset.add(500);
		
		System.out.println(lset);

// whatever methods available in HashSet are also available in LinkedHashSet
		
	}

}
