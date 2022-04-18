package CollectionProgramInJava;
import java.util.HashMap;
public class HashMapDemo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<String,Integer>m = new HashMap<String,Integer>();
		HashMap m = new HashMap();
		m.put(101, "Ranjan");
		m.put(102, "Sandeep");
		m.put(103, "Sunny");
		m.put(104, "Rajeev");
		m.put(105, "Prerna");
		m.put(106, "Shivani");
		m.put(102, "Mritunjay");
		
		System.out.println(m); //{101=Ranjan, 102=Mritunjay, 103=Sunny, 104=Rajeev, 105=Prerna, 106=Shivani, 107=Sunny}
		m.remove(102);
		System.out.println(m);  //{101=Ranjan, 103=Sunny, 104=Rajeev, 105=Prerna, 106=Shivani, 107=Sunny}
		
		System.out.println(m.containsKey(101)); // true
		System.out.println(m.containsKey(108));  // false
		System.out.println(m.containsValue("Ranjan")); // true
		System.out.println(m.isEmpty()); // false
		System.out.println(m.keySet()); // return all the keys  as set   [101, 103, 104, 105, 106, 107]
		System.out.println(m.entrySet());  // return Set
		
		for(Object i:m.keySet()){
			System.out.println(i);
		}
		
		System.out.println(m.values()); // return all the values as collection [Ranjan, Sunny, Rajeev, Prerna, Shivani, Sunny]
		for(Object i:m.values()){
			System.out.println(i);
		}

	}

}
