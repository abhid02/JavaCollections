package collectiondemos;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		//Declare ArrayList
		
		//ArrayList al=new ArrayList();//store heterogenous data
		
		//ArrayList<Integer> al=new ArrayList<Integer>(); // store homogenous data
		
		//ArrayList<String> al=new ArrayList<String>(); 
		
		//ArrayList class Derived From List Interface
		
		//List al=new ArrayList(); //reference variable with interface and object of class
	
		ArrayList al=new ArrayList();
		
		//adding new elements to ArrayList, it will add element @ end
		//add(object)
		
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		
		//printing elements from ArrayList
		
		System.out.println("Adding new elements in ArrayList "+al); //[100, Welcome, 15.5, A, true]

		// Find how many elements are stored in ArrayList
		
		System.out.println("Size of ArrayList "+al.size());  //5
		
		// Remove some elements from ArrayList
		// We can pass direct value of element or index number of that element
		
		al.remove(1); // here 1 is index number of element in ArrayLsit
		//al.remove(" Welcome"); //Welcome is element of ArrayList
		
		System.out.println("After removing element from Arraylist "+al);//[100, 15.5, A, true]
		
		// Insert new element somewhere in middle of ArrayList
		
		//add(index,object)
		
		al.add(2, "python");
		System.out.println("After Insertion of new element in ArrayList "+al);//100, 15.5, python, A, true
		
		//Retrive  specific elemnent
		
		System.out.println(al.get(2));//python, here 2 is index of element/object
		
		//Change / Replace Element 
		
		al.set(2, "C#");// 2 is index of element to be replaced & C# is element added
		System.out.println("After replacing with new element"+al);//100, 15.5, C#, A, true
		
		//search element in ArrayList-returns true or false
		System.out.println(al.contains("C#"));//true
		System.out.println(al.contains("C++")); //false
		
		
		//checking ArrayList empty or not- returns true or false
		System.out.println(al.isEmpty());//false
		
		// How to read data from ArrayList with different approach
		
		//1. For loop
		
		/*System.out.println("Reading elements using for loop");
		
		for(int i=0; i<=al.size(); i++)
		{
			
			System.out.println(al.get(i));
		}*/
		
		//2. For..each loop
		
		/*System.out.println("Reading elements using for..each loop");
		for(Object e:al)
		{
			System.out.println(e);
		}*/
		
		//3.iterato()
		
		System.out.println("Reading elements using iterator method");
		
		Iterator it=al.iterator();// iterator method read each element from ArrayList & store that in 'it'
		
		while(it.hasNext()) //loop will check elements we capture from ArrayList in 'it'
			
			//hasNext() return true if iterator having element otherwise false
		{
			System.out.println(it.next());// we have to extract element if while condition returns true and print-->move to next element
		}
		
		
	}

}
