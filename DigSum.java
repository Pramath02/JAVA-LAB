package digSum;
import java.util.*;

public class DigSum {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Two digit Number :");
		int num=sc.nextInt();
		int sum=num;
		
		if(num>=10)
		{
			while(sum>=10)
			{
			sum= (sum/10) + (sum%10);
			System.out.println(sum);
			}
			System.out.println("sum = "+sum);
		}
		else
			System.out.println("Enter a valid two digit number.");
		
		
	}
}
