package digSum;

public class pyramid {

	public static void main(String[] args) {
		int i,j,k,l;
		
		for(i=1;i<=5;i++)
		{
			for(j=5;j>=1;j--)
			{
				if(j<=i)
				System.out.print(j);
				else
					System.out.print(" ");
			}
			
			for(k=2;k<=5;k++)
			{
				if(k<=i)
				System.out.print(k);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
