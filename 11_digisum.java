package is122;
import java.util.*;
public class digisum {
	
	public static void dsum(int num) {
		int sum=0;
		while(num>0||sum>9)
		{
			if(num==0)
			{
				num=sum;
				sum=0;
			}
			sum+=num%10;
			num/=10;
		}
		System.out.print("Sum of digits: "+sum);
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		dsum(n);
	}

}
