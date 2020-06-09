package StringPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) 
	{	
		//Method-I
		String s= "This is demo class";
		String sr= s.replaceAll(" ", "");
		System.out.println(sr);
		
		//Method-II
		char c[]=s.toCharArray();
		
		StringBuffer sb = new StringBuffer(); 
		
		for(int i=0; i<c.length; i++)
		{
			if((c[i]!=' ') && (c[i]!='\t'))
			{
				sb = sb.append(c[i]);
			}
		}
		
		String newString = sb.toString();
		System.out.println(newString);
	}

}
