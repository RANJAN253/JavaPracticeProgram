package JavaConversionProgram;

public class ConvertStringToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String str = "2000";
		  String str1 = "Hello";  //  output NumberFormatException
		
		//int i =  Integer.parseInt(str);
		  Integer i = Integer.valueOf(str1);
		
		System.out.println(i);//2000
		System.out.println(str1+2000); // 20002000
		System.out.println(i+2000);// 4000

	}

}
