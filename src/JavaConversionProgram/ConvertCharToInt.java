package JavaConversionProgram;

public class ConvertCharToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	char c='a';
		char c2='2';
		
		 int a= c;
		 int b = c2;
		 
		 System.out.println(a);   //97
		 System.out.println(b);  //43 */
		
		
		char c='1';
		int a =Character.getNumericValue(c);

		System.out.println(a);
	}

}
