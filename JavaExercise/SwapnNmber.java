import java.util.Scanner;
public class SwapnNmber 
{

	public static void main(String[] args) 
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Before Swapping");
		System.out.println("Enter Value i");
		int i = sc.nextInt();
		System.out.println("Enter Value j");
		int j = sc.nextInt();
		//Swap the value
		i = j;
		int temp = i;
		j = temp;
		System.out.println("After Swapping");
		System.out.println("The Value of i" + i);
		System.out.println("The Value of j" + j);
		System.out.println("The Value of temp" + temp);
		
		}

}
