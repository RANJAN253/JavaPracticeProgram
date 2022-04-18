package JavaNumberProgram;

public class SumNaturalNumber {
	
	public static int sumOfNaturalNumber(int n)
	{
		int sum =0;
		
		for(int i=1; i<=n; i++)
		sum = sum+i;
		return sum;
		
	}

	
	public static void main(String [] args)
	{
		int n = 50;
		
		System.out.println("Sum to Natural Number: " + sumOfNaturalNumber(n));
	}

}
