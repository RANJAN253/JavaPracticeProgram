package JavaConversionProgram;

public class ConvertIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String.valueOf()
		//Integer.toString()
		
		int i = 200;
		//String str= String.valueOf(i);
		String str = Integer.toString(i);
		
		System.out.println(str);
		System.out.println(i+100); // 300
		System.out.println(str+200);

	}

}
