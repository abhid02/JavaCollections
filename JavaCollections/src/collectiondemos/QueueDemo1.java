package collectiondemos;

import java.util.Iterator;
import java.util.PriorityQueue;


public class QueueDemo1 {
	
	/*
	 * Insertion order preserved
	 * duplicates are allowed
	 * Heterogeneous data not allowed only Homogeneous data
	 */

	public static void main(String[] args) 
	{
		PriorityQueue q=new PriorityQueue();
		
//Adding elements using add() or offer()
		
		q.add("A");
		q.add("B");
		q.add("C");
		q.add("C");
		//q.offer(100);// not allowed
		
		System.out.println(q);// [A, A, A, C]
		
//Get Head element element() or peek()
		
		//System.out.println(q.element()); //A
		//System.out.println(q.peek()); // A
		
		/*
		 * Difference between element() or peek()
		 * If Queue is empty
		 * 1. Then element() will throw Exception
		 * 2. Then peek() will return null
		 */
		
		/*System.out.println(q.element()); //java.util.NoSuchElementException
		System.out.println(q.peek()); //null*/
		
//Return and Remove element from Queue using remove() poll()
		
		//System.out.println(q.remove()); //A
		//System.out.println(q);//[B, C, C]
		
		//System.out.println(q.poll());
		//System.out.println(q);
		
		/*
		 * Difference between remove() & poll()
		 * If Queue is empty
		 * 1. Then remove() will throw Exception
		 * 2. Then poll() will return null
		 */
		
		//System.out.println(q.remove());//java.util.NoSuchElementException
		//System.out.println(q.poll()); //null
		
//Read all elements from Queue
		
//1. Using iterator()
		
		/*Iterator itr=q.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
		
//2.Using for each loop
		
		/*for(Object e:q)
		{
			System.out.println(e);
		}*/

	}

}
