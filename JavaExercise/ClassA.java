//We have 2 different classes Class A and Class B , and we have created multiple objects of Class A in Class B. Find the count of object created for Class A in Class B.
//instance of 
public class ClassA 
{ static int i=0;
	ClassA()
	{
		i++;
	}
	
	public static void main(String[] args) 
	{
	
		ClassB cb= new ClassB();
		System.out.println("ClassA is Initialized "+ i+ " times in ClassB");
		
	}

}



