package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 
{
	public static void main(String[] args) 
	{
		
//Specific Methods we have for LinkedList
		
		LinkedList l=new LinkedList();
		
		l.add("dog");
		l.add("dog");
		l.add("cat");
		l.add("horse");
		
		System.out.println(l);

// Adding Element @ first position
		
		l.addFirst("Tiger");
		
// Adding Element @ last position
		
		l.addLast("Elephant");
		
		System.out.println(l);
		
//Retrieving first element
		
		System.out.println(l.getFirst());
		
//Retrieving first element
		
		System.out.println(l.getLast());
		
//Removing first and last element
		
		l.removeFirst();
		l.removeLast();
		
		System.out.println("After removing first & last element:"+l);
	}
}
