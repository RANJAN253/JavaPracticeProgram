package CollectionProgramInJava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(3);
		l.add(6);
		l.add(8);
		
		System.out.println("List :" + l);
		
		Set<Integer> l1 = new HashSet<Integer>();
		l1.add(5);
		l1.add(3);
		l1.add(3);
		l1.add(6);
		l1.add(8);
		
		System.out.println("Set  :" + l1);

	}

}
