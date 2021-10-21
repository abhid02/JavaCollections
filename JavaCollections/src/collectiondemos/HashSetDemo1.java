package collectiondemos;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) 
	{
	
// diiferent syntax of HashSet
	
	//HashSet hs=new HashSet();// default capacity is 16 and Load Factor 0.75
	
	//HashSet hs=new HashSet(100); // initial capacity 100
		
	// configuring HashSet with new capacity and load factor
	//HashSet hs=new HashSet(100,(float)0.90);// initial capacity 100 with load factor 0.90
	
	//HashSet<Integer> hs=new HashSet<Integer>();//storing homogenous data
	
		HashSet hs=new HashSet();
		
//add elements into HashSet
		
		hs.add(100);
		//hs.add(100);//duplicate are not allowed
		hs.add("Welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(null);// null also allowed
		
		System.out.println(hs);//[null, A, 100, 16.4, Welcome]//insertion order not preserved
		
// remove element from HashSet
		
		hs.remove(16.4); //value not index
		System.out.println("After removing element "+hs);//[null, A, 100, Welcome]

// no specific get and set method in HashSet

//check particular element present or not in HashSet
		
		System.out.println(hs.contains("Welcome"));//true
		System.out.println(hs.contains("xyz"));//false

//checks HashSet is empty or not

		System.out.println(hs.isEmpty());//false

// to read all elements from HashSet

		//1. for..each loop
		/*for(Object e:hs)
		{
		System.out.println(e);	
		}*/
		
		//2.iterator() method
		
		Iterator it=hs.iterator();
		
		while(it.hasNext())
		{
		 System.out.println(it.next());	
		}
	
	
	

	}

}
