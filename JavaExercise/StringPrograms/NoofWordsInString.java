package StringPrograms;

public class NoofWordsInString {

	public static void main(String[] args) 
	{  
		String s= "I am a good girl";
		int count =0;
		char c[]= new char[s.length()];
		
		for(int i=0; i<s.length();i++)
			
		{
			c[i] = s.charAt(i);
			if(((i>0) && (c[i]!=' ') && (c[i]-1==' ')) || ((c[0]!=' ') && (i==0)))
 				{
 						count++;
 				}
		}
		System.out.println("There are total "+count+" words in string");
	}

}
