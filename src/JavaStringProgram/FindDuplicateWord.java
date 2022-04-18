package JavaStringProgram;

public class FindDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Ranjan kumar Ranjan kumar Prasad ranjan kumar Prasad ranjan Kumar Prasad Sandeep rajeev sandeep";
		int count;
		 
		str = str.toLowerCase();
		
		String words[] = str.split(" ");
		
		System.out.println("Duplicate words in a given string: ");
		
		for( int i=0; i<words.length; i++)
		{
			count = 1;
			for(int j=i+1; j<words.length; j++)
			{
				if(words[i].equals(words[j]))
				{
					count++;
					words[j]="0";
				}
			}
			
		
		if(count>1 && words[i]!="0")
		{
			System.out.print(words[i]);
		}
		System.out.print(" ");
		}
	}
}