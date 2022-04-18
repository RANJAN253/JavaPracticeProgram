package JavaBasicPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		// Fibonacci Series no 0,1,1,2,3,5,8,13,21
		// TODO Auto-generated method stub
		
		
		
		// Fibonacci Series without using recursion.
		
		int n1=0, n2=1, count=10;
		System.out.println(n1+ " " +n2);//print 0 to 1
		
		for(int i=2; i<count; i++)
		{
			int n3 = n1+n2;
			System.out.println(" " +n3);
			n1=n2;
			n2=n3;
			
		}
		

	}

}
