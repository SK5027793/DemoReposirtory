package StringPrograms;

public class repeatedWord {

	public static void main(String[] args) 
	{
		String str= "My dog is black black is my dog black dog is mine";
		String lowerstr = str.toLowerCase();
		String ar[] = lowerstr.split(" ");
		
		for(int i=0; i<lowerstr.length(); i++)
		{
			int count=0;
			for(int j=i+1; j<=lowerstr.length()-1; j++)
			{
				if(ar[i]==ar[j])
				{
					count++;
				}
			}
			if(count>1)
			{
				System.out.println(ar[i]);
			
			}
		}
	}

}
