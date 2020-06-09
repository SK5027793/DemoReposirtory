
public class AdjacentLettersReversed 
{

	public static void main(String[] args) 
	{
		String s= "New York";
		char a[]= s.toCharArray();
		char temp;
		int i, j;
		for( i=0; i<a.length; i=j)
		{
			for(j=i+1; j<i+2; j++)
			{
				temp = a[i];
				a[i]= a[j];
				a[j]=temp;
				System.out.print(a[i]);
				System.out.print(a[j]);
			}
			
		}
		
	}

}
