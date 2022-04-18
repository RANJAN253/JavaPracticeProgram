package CollectionProgramInJava;

import java.util.ArrayList;

public class ArrayListPrograme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<String> al = new ArrayList<String>() ;
		al.add("Java");
		al.add("Python");
		al.add("C#");
		al.add(".NET");
		al.add("Cucumber");
		
		System.out.println("Array List Name : " + al);
		
		//get the element from the arraylist 
		System.out.println("Element at Index 3:  " + al.get(3));
		
		//change the element of the array list
		al.set(2, "C++");
		System.out.println("Modified ArrayList : " + al);
		
		//Remove the element from index 2;
		String str = al.remove(2);
		System.out.println("Updated ArrayList : "+ al);
		System.out.println("Removed Element: " + str);
		
		

	}

}
