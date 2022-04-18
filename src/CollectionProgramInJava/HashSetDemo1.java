package CollectionProgramInJava;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs = new HashSet(); // default capacity 16 and  load factor 0.75
		//HashSet hs = new HashSet(100); // initial capacity 100
		//HashSet hs = new HashSet(100, (float)0.99); // initial capacity 100
		//HashSet <Integer> hs = new HashSet<Integer>();
		
		//Add object/element inot HashSet
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		
		System.out.println(hs);  //[ null,A, 100, 16.4, welcome, true]
		//remove
		
		hs.remove(16.4); // value
		System.out.println("After Removing element : " + hs);  // [null, A, 100, welcome, true]
		
		//contains
		System.out.println(hs.contains("welcome"));//true
		System.out.println(hs.contains("TRUE")); // false
		
		//isEmpy
		System.out.println(hs.isEmpty());  // False
		
		//Read object/element HashSet using for.....each loop
		
		for(Object e:hs)
		{
			System.out.println(" Each Loop : "+e);
		}
		
		// Iterator
		Iterator it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println("Iterator : "+ it.next());
		}

	}

}
