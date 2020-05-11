import java.util.Scanner;

public class Demo1 
{

	public static void main(String[] args) 
	{
		 
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Value 1");
		int num1 = in.nextInt();
		System.out.println("Enter Value 2");
		int num2=in.nextInt();
		int sum=num1+num2;
		System.out.println("Addition of 2 number" + " = " + sum);
		

	}

}
