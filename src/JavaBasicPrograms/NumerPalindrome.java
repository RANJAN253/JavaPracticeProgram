package JavaBasicPrograms;

public class NumerPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0,temp,rev;
		int n=454;
		temp=n;
		
		while(n>0)
		{
			rev = n%10;  //getting remainder
			sum = (sum*10)+rev;
			n=n/10;
		}
		
		if(temp==sum)
		{
			System.out.println(n + " is palindrome number");
		}
		else
		{
			System.out.println(n+" is not palindrome umber");
		}
		

	}

}
