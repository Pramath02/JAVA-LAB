package is122;
import java.util.* ;
class transpose {

	void func() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter row size");
		int r = sc.nextInt();
		System.out.println("enter column size");
		int c = sc.nextInt();
		int m[][]= new int[r][c];
		int i,j;
		System.out.println("enter the elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				m[i][j]=sc.nextInt();
			}
		}
		int[][] transpose= new int[c][r];
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				transpose[j][i]=m[i][j];
			}
		}
		System.out.println("printing matrix");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				{
				System.out.print(m[i][j] +" ");
				}
			System.out.println();
		}
		System.out.println("printing transpose");
		for(i=0;i<c;i++)
		{
			for(j=0;j<r;j++)
				{
				System.out.print(transpose[i][j] +" ");
				}
			System.out.println();
		}
		System.out.println();
			
	}

}

class evenodd extends transpose{
	void func() {
		Scanner obj = new Scanner(System.in);
		System.out.println("enter size of array");
		int m,i,e=0,o=0;
		m=obj.nextInt();
		int []a=new int[m];
		int []even=new int[m];
		int []odd=new int[m];
		System.out.println("enter array elements: ");
		for(i=0;i<m;i++)
			a[i]=obj.nextInt();
		for(i=0;i<m;i++)
		{
			if(a[i]%2==0)
			{
				even[e]=a[i];
				e++;
			}
			else
			{
				odd[o]=a[i];
				o++;
			}
		}
		System.out.println("even array elements ");
		for(i=0;i<e;i++)
			System.out.println(even[i]);
		System.out.println();
		
		System.out.println("odd array elements ");
		for(i=0;i<o;i++)
			System.out.println(odd[i]);
		System.out.println();
		
	}
	
} 

public class transevenodd{
	public static void main(String args[]) {
		transpose a= new transpose();
		transpose b= new evenodd();
		a.func();
		b.func();
	}
	
}
























