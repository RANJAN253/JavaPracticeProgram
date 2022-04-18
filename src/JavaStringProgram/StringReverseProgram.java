package JavaStringProgram;

public class StringReverseProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Ranjan kumar";
		
		String reveredStr = "";
		for(int i=str.length()-1; i>=0; i--)
		{
			reveredStr = reveredStr + str.charAt(i);
			//System.out.print(str.charAt(i));
		}
		
		System.out.println("Original string : " + str);
		
		System.out.println("Reverse of giving string : " +reveredStr);
		

	}

}
