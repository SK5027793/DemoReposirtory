import java.util.Scanner;

public class StringFunction
{
	public static void main(String[]args)
	{	
		System.out.println("===========Reverse string===========");
		System.out.println("Enter a string:");
		Scanner sc = new Scanner(System.in);
		String scr= sc.nextLine();
		
		System.out.println("Entered string is "+scr);
		char chars[] = scr.toCharArray();
		
		for(int i=(scr.length()-1); i>=0; i--)
		{
			System.out.print(chars[i]);
		}
		
		String[] token = scr.split("");
		
		for(int i=token.length-1; i>-0;i--)
		{
			System.out.print(token[i]);
		}
		
		System.out.println();
		
		System.out.println("===========Count length of string===========");
		System.out.println("Enter a string:");
		Scanner stc = new Scanner(System.in);
		String str = stc.nextLine();
		str = str+'\0';
		char strarr[] = str.toCharArray();
		int count;
		for( count=0; strarr[count]!='\0'; count++)
		{   
			System.out.println(strarr[count]);
			
		}
		
		System.out.println("Length of string is "+count);
	}
}