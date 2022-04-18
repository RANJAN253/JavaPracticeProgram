package CollectionProgramInJava;

import java.util.HashSet;

public class HashSetDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> evenNumber = new HashSet<Integer>();
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		evenNumber.add(8);
		
		System.out.println(evenNumber);
		
		
		HashSet<Integer>number = new HashSet<Integer>();
		
		number.addAll(evenNumber);  // [2,4,6,8]
		number.add(10);
		
		System.out.println("New HashSet : " +number); //[2,4,6,8,10]
		
		//removeAll() method
		
		number.removeAll(evenNumber);
		System.out.println(number); // 10
		
		

	}

}
