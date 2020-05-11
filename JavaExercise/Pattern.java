import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) 
	{
	 for (int i=5;i>0;i--)
	 {
		 for(int j=0;j<=i;j++)
		 {
			 System.out.print(i);
			 
		 }
		 System.out.println(" ");
	 }
	System.out.println("==============Palindrome============");
	System.out.println("Enter a number");
	Scanner scan= new Scanner(System.in);
	int num= scan.nextInt();
	
	int temp= num;
	int sum=0; int mod;
	
	while(num>0)
	{
		mod= num%10;
		sum=(sum*10)+mod;
		num=num/10;
	}
	if(sum==temp)
	{
		System.out.println("Palindrome");
	}
	else {System.out.println("Normal number");}
	  
	System.out.println("================Factorial==============");
	int digit=6; int fact=1;
	
	for(int i=1; i<=digit; i++)
	{
		fact= (fact*i);
	}
	System.out.println(fact);
	
	System.out.println("================Armstrong==============");
	int number= 153; int tem=number; int c=0; 
	while(number>0)
	{
		int a= number%10;
		c=c+(a*a*a);
		number=number/10;
	}
	if(tem==c)
	{System.out.println("Armstrong");} else {System.out.println("Normal number");}
	
	System.out.println("=============Largest number=============");
	int array [] = {10, 85, 65, 4, 98, 34}; int total=6; int t=0;
	for(int i=0; i<total; i++) 
	{
		for(int j=i+1; j<total; j++)
		{
			if (array[i]<array[j])
			{
				t =array[i];
				array[i]=array[j];
				array[j]=t;
			}
		}
	}System.out.println(array[total-2]);
	}
}
