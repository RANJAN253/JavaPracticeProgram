package JavaStringProgram;

public class FindDupicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Great responsibility";
		
		int count;
		char string[] = str.toCharArray();		
		System.out.println("Duplicate characters in a given string : ");
		
		for( int i=0; i<str.length(); i++)
		{
			count = 1;
			for(int j = i+1; j<str.length(); j++)
			{
				if(string[i]==string[j] && string[i]!= ' ')
				{
					count++;
					string[j] = '0';
				}
			}
			
			if(count>1 && string[i]!='0')
			System.out.print(string[i]);
		}
	}
}