package collectiondemos;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {
	
	/*
	 * Insertion order preserved
	 * duplicates are allowed
	 * Heterogeneous data allowed
	 */

	public static void main(String[] args) 
	{
		
		LinkedList q1=new LinkedList();
		
//Adding elements using add() or offer()
				
				q1.add("A");
				q1.add("B");
				q1.add("C");
				q1.offer("100"); //allowed
				q1.add("C");
				
				System.out.println(q1);
//Get Head element element() or peek()
				
				//System.out.println(q1.element()); //A
				//System.out.println(q1.peek()); // A
				
				/*
				 * Difference between element() or peek()
				 * If Queue is empty
				 * 1. Then element() will throw Exception
				 * 2. Then peek() will return null
				 */
				
				//System.out.println(q1.element()); //java.util.NoSuchElementException
				//System.out.println(q1.peek()); //null
				
//Return and Remove element from Queue using remove() poll()
				
				//System.out.println(q1.remove()); //A
				//System.out.println(q1);//[B, C, C]
				
				//System.out.println(q1.poll());//A
				//System.out.println(q1);//[B, C, C]

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
				
				/*Iterator itr=q1.iterator();
				
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}*/
				
//2.Using for each loop
				
				/*for(Object e:q1)
				{
					System.out.println(e);
				}*/
	}

}
