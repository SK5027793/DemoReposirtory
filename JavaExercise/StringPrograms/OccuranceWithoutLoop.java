package StringPrograms;

public class OccuranceWithoutLoop {

	public static void main(String[] args) 
	{   int count=0;
		String s= "Java again and again and again";
		int totalLength =s.length();
		System.out.println(totalLength);
		
		int repeatedLength = (s.replace("a", "").length());
		System.out.println(repeatedLength);
		
		count= totalLength-repeatedLength;
		System.out.println("Word again is repeated "+count+ " times");
	}

}
