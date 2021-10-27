package collectiondemos;
import java.util.*;
import java.util.Map.Entry;

public class HashMapDemo 
{

	public static void main(String[] args) 
	{
		//HashMap m=new HashMap(); //Heterogeneous Data
		
		HashMap <Integer,String> m=new HashMap <Integer,String>(); //Homogeneous data
		
		m.put(101, "john"); //adding key,value pair
		m.put(102, "david");
		m.put(103, "scott");
		m.put(104, "mary");
		m.put(105, "tye");
		
// key duplicates are not allowed but we can duplicate value in HashMap
		
		m.put(103,"X");//old value replace with new value
		m.put(106, "david");
		
		System.out.println(m);
		
// Get value from HashMap by passing key
		
		System.out.println(m.get(106));// .get() return value of particular key
		
// remove pair 
		
		m.remove(106); // remove pair(key,value) from HashMap
		System.out.println(m);

// particular key or value present in HashMap or not
		
		System.out.println(m.containsKey(101));//returns true or false
		System.out.println(m.containsKey(106));
		System.out.println(m.containsValue("mary"));
		System.out.println(m.containsValue("Y"));

// check HashMap Empty or not
		System.out.println(m.isEmpty());//returns true or false

//Retrieve only key from HashMap
		System.out.println(m.keySet()); //return all keys as Set
		//Set not allow duplicates
		
		for(Object i:m.keySet())
		{
			System.out.println(i);//read individual value from HashMap
		}
		
// Retrieve only value from HashMap
		
		System.out.println(m.values()); //return all keys as Collection
		//Collection allow duplicates
		
		for(Object i:m.values())
		{
			System.out.println(i);//read individual value from HashMap
		}
		
// Retrieving key and value side by side
		
		for(Object i:m.keySet())
		{
			System.out.println(i+" "+m.get(i));
		}

// Retrieving all entries~(key,value) from HashMap
		
		System.out.println(m.entrySet());//returns all entries as Set
		
/*
 * Entry(Interface) Methods
 */
		
// Retrieving all entries~(key,value) from HashMap
		
		System.out.println(m.entrySet());//returns all entries as Set
		
		for (Map.Entry entry:m.entrySet())
		{
		 System.out.println(entry.getKey()+"    "+entry.getValue()); 
		}
		
/*
 * iterator method
 */
		Set s=m.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
		}
		
	}

}
