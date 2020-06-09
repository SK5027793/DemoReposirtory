package StringPrograms;

public class StringManipulation {

	public static void main(String[] args) 
	{
		String s = "    The rains have started here selenium    ";
		
		String ss = "The rains have started here selenium";
				
		System.out.println("Length of string: "+s.length());
		
		String demo= "This is demo";
		System.out.println(demo.replace("is", "was"));
		System.out.println(demo.replaceFirst("is", "was"));
		System.out.println(demo.replaceAll("is", "was"));
		System.out.println(demo.replaceAll("is(.)", "was"));
		System.out.println(demo.replaceAll("is(.*)", "was"));
		System.out.println(demo.contains("demo"));
		System.out.println(demo.startsWith("This"));
		System.out.println(demo.endsWith("demo"));
		System.out.println(demo.toLowerCase());
		System.out.println(demo.toUpperCase());
		
		
		System.out.println(s.charAt(8));
		
		System.out.println(s.indexOf('s'));//First occurrence of s
		
		System.out.println(s.indexOf('s', s.indexOf('s')+1));//Second occurrence of s
		
		System.out.println(s.indexOf('s', s.indexOf('s', s.indexOf('s')+1)+1));//Third occurrence of s
	
		System.out.println(s.indexOf("have"));
		
		System.out.println(s.indexOf("swati"));//not available in string returns -1
		
		System.out.println(s.equals(ss));
		
		System.out.println(s.equalsIgnoreCase("THE Rains have Started herE Selenium"));
		
		System.out.println(s.substring(0, 9));
		
		System.out.println(s.subSequence(0,  9));
		
		System.out.println(s.trim());// remove before and after spaces
		
		System.out.println(s.replace(" ", ""));
		
		String date = "01/02/2020"; //print 01-02-2020
		System.out.println(date.replace("/", "-"));
		
		String welcome= "HEllo_world_test_selenium";// split
		String newWelcome[] = welcome.split("_");
		
		for(int i=0; i<newWelcome.length; i++)
		{
			System.out.println(newWelcome[i]);
		}
		
		String k= "Joshi";
		System.out.println(s+" "+k);
		System.out.println(s+10);
		System.out.println(s+10+20);
		System.out.println(10+20+s);
		System.out.println(s+20/10);
		//System.out.println(s+10-5);
		System.out.println(String.join(" ", s, k));
		System.out.println(String.join("/", "10", "05", "2020"));
	}

}
