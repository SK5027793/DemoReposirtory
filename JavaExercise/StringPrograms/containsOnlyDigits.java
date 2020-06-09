package StringPrograms;

public class containsOnlyDigits {

	public static void main(String[] args) 
	{
		String str = "985625hghj";
		if(str.matches("[0-9]+") && str.length()>2)
		{
			System.out.println("String has only digits");
		}
		else
		{
			System.out.println("String has s");
		}
		
	}

}
