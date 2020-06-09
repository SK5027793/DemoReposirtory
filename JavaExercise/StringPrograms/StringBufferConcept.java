package StringPrograms;

public class StringBufferConcept {

	public static void main(String[] args) 
	{
		StringBuffer sb = new StringBuffer("selenium");
		System.out.println(sb.capacity());
		System.out.println(sb.append(" using Java new value"));
		System.out.println(sb.capacity());//50= (old value *2)+2
		System.out.println(sb.length());
		
		
		
	}

}
