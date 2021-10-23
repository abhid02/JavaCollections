package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 
{

	public static void main(String[] args) 
	{
		
		LinkedList l=new LinkedList();
		
		l.add("X");
		l.add("Y");
		l.add("Z");
		l.add("A");
		l.add("B");
		l.add("C");
		
		LinkedList new_l=new LinkedList();

// Adding all data from l to new_l
		
		new_l.addAll(l);
		
		System.out.println(new_l);
		
//Removing all data from l to new_l
		
		new_l.removeAll(l);
		
		System.out.println(new_l);
		
//sort elements in LinkedList
		//Collections.sort(collection)
		
		System.out.println("Before sorting"+l);
		Collections.sort(l);
		System.out.println("After sorting"+l);
		
//sort elements in LinkedList in reverse order
		
		Collections.sort(l, Collections.reverseOrder());
		System.out.println("After Reverse order"+l);
		
//Shuffling elements in LinkedList
		
		Collections.shuffle(l);
		System.out.println("After Shuffling"+l);

	}

}
