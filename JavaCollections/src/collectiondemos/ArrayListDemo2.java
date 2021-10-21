package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 

{
	public static void main(String[] args) 
	{
		ArrayList al=new ArrayList();
		
		al.add("X");
		al.add("Y");
		al.add("Z");
		al.add("A");
		al.add("B");
		al.add("C");
		
		ArrayList al_dup=new ArrayList();
		
		al_dup.addAll(al);
		System.out.println("After adding all elements "+al_dup); //[X, Y, Z, A, B, C]
		
		al_dup.removeAll(al);
		System.out.println("After removing all elements "+al_dup); //[]
		
		//sort elements from ArrayList 
		System.out.println("elements in the ArrayList"+al);//X, Y, Z, A, B, C
		
		Collections.sort(al);// sort elements in Ascending order
		System.out.println("elements in the ArrayList after sorting"+al);//A, B, C, X, Y, Z
		
		Collections.sort(al,Collections.reverseOrder());// sort elements in Descending order
		System.out.println("elements in the ArrayList after sorting in reverseorder"+al);//Z, Y, X, C, B, A
		
		//shuffling-Collections.shuffle()
		
		Collections.shuffle(al);// shuffling random order
		System.out.println("elements in the ArrayList after shuffling"+al);//A, X, C, Z, B, Y
	}

}
