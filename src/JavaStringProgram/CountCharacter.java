package JavaStringProgram;

public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = " Ranjan kumar prasad";
		int count =0;
		int str1 = str.length();
		
		System.out.println("Total number of characters in a string: " +str1);
		
	//	Count earch character expect space
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i) !=' ')
			count ++;
		}
		
		System.out.println("Total number of characters in a string : " + count);

	}

}
