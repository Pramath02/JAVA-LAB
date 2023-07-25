package is122;

import java.util.Scanner;

public class squaremat {

	public static void main(String[] args) {
		/*TO ACCEPT VALUE N AND CALCULATE THE TOTAL NO. OF ALL POSSIBLE
		 SQUARES IN SQUARE MATRIX */
		
		//SUM OF SQUARES OF N NUMBERS
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of square matrix");
		int n =sc.nextInt();
		int sum=0;
		int n1=n;
		if(n<1)
		{
			System.out.println("No square matrices");
			System.exit(0);
		}
			
		while(n!=0)
		{
			sum+=n*n;
			n--;
		}
		System.out.print("Total no. of all possible square matrices in " + n1 + "*" +n1+ " "
				+ "is = "+ sum);
	}

}
