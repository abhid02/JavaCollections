package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) 
	
	{
		//Declare LinkedList This allow us to store Heterogeneous Data
		//LinkedList l=new LinkedList();
		
		//To store homogeneous data
		//LinkedList<Integer> l=new LinkedList<Integer>();
		//LinkedList<String> l=new LinkedList<String>();
		
		LinkedList l=new LinkedList();
		
		l.add(100);
		l.add("welcome");
		l.add(15.5);
		l.add('A');
		l.add(true);
		l.add(null); //LinkedList Allow to store null value
		
		System.out.println("Original List"+l);
		
//find size (there is no default size like ArrayList as elements in form of nodes)
		System.out.println("Size of LinkedList:"+l.size());
		
//remove element by passing Index
		l.remove(3);// 3 is index number of element
		System.out.println("After removing New List is:"+l);
		// Insertion order preserved

//remove element by passing value
		//l.remove('A');//java.lang.IndexOutOfBoundsException:

// Insert/adding element in the middle of Linked List
		l.add(3, "Java");
		System.out.println("After inserting element new list is:"+l);

// retrieving value/object/element
		System.out.println("Retrieving value/object/element: "+l.get(3));

// Replace/change value with new value l.set(index number, new value) 	
		l.set(5, "X");
		System.out.println("After changing the value list is: "+l);

// To find element present in LinkedList or not
//contains()
		System.out.println(l.contains("Java"));//true
		System.out.println(l.contains("Python"));//false

// LinkedList is Empty or not
//isEmpty()
		System.out.println(l.isEmpty());//false

// To read all data from Linked List

//1. Using for loop
		
		/*for(int i=0;i<l.size();i++)
		{
		  System.out.print(l.get(i)+" ");	
		}*/

//2. Using for each loop
		
		/*for(Object e:l)
		{
			 System.out.print(e+" ");
		}*/

//3. Using iterator method
		
		Iterator it=l.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next()+" ");
		}
		
        
	}

}
