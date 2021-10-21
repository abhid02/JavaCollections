package collectiondemos;
import java.util.HashSet;

public class HashSetDemo2 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> evennumber=new HashSet<Integer>();
		evennumber.add(2);
		evennumber.add(4);
		evennumber.add(6);
		
		System.out.println("HashSet:"+evennumber); //[2, 4, 6]
		
		//addAll()
		HashSet<Integer> numbers=new HashSet<Integer>();
		numbers.addAll(evennumber);
		numbers.add(10);
		
		System.out.println("New HashSet:"+numbers); //[2, 4, 6, 10]
		
		//removeAll()
		numbers.removeAll(evennumber);
		System.out.println(numbers); //10
		
	}

}
