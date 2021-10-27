package collectiondemos;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashTableDemo
{
	/*
	 * HashTable
	 * Capacity is 11
	 * Load factor 0.75
	 * keys are unique and null are not allowed
	 * Values can be duplicated null are not allowed
	 * Insertion order not preserved
	 */

	public static void main(String[] args) 
	{
		
		//Hashtable t=new Hashtable();
		
		//Hashtable t=new(Intial Capacity); //Create Hashtable object with some capacity
		
		//Hashtable t=new Hashtable(Intial Capacity,Fill ratio/Load Factor);
		
		Hashtable<Integer,String> t=new Hashtable<Integer,String>();
		
		t.put(101, "John");
		t.put(102, "David");
		t.put(103, "Smith");
		t.put(104, "John");
		//t.put(null, "X");
		//t.put(101, null);
		
		System.out.println(t);//{104=John, 103=Smith, 102=David, 101=John}
		
		System.out.println(t.get(103));//Smith
		
		t.remove(103);
		System.out.println(t);//{104=John, 102=David, 101=John}
		
		System.out.println(t.containsKey(102));//true
		System.out.println(t.containsKey(105));//false
		
		System.out.println(t.containsValue("David"));//true
		System.out.println(t.containsValue("Y"));//false
		
		System.out.println(t.isEmpty());//false
		
		System.out.println(t.keySet());//[104, 102, 101] return as Set object
		System.out.println(t.values());//[John, David, John] return as Collection
		
		/*for(int k:t.keySet())
		{
			System.out.println(k+" "+t.get(k));//104 John 102 David101 John
		}*/
		
//Entry Specific Methods
		
		for(Map.Entry entry:t.entrySet())
		{
			System.out.println(entry.getKey()+"  "+entry.getValue());//104 John 102 David 101 John
		}

//Using iterator method
		
		Set s=t.entrySet();
		
		Iterator itr=s.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry=(Entry) itr.next();
			
			System.out.println(entry.getKey()+"  "+entry.getValue());
			//104 John 102 David 101 John
		}
		
	}

}
