package JavaBasicPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Prime Number is a number that is greather than 1 divided by 1 or itself only. 0 and 1 is not prime number 
		//the 2 is the only even prime Number.class :- 2,3,5,7,11,13,17 etc.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the any number: ");
		int num = sc.nextInt();
		int flag=0;
		//int num=9;
		int sum = num/2;
		if(num==0 || num==1)
		{
			System.out.println(num +" is not Prime Number");
		}
		else
		{
			for(int i=2; i<=sum; i++)
			{
				if(num%i==0)
				{
					System.out.println(num+" is not prime Number");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(num+" is Prime Number");
			}
		}
		

	}

}
