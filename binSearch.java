package IS117;
import java.util.*;
public class binSearch {

	public static void main(String[] args) {
		// Implement Binary Search by passing array input

		Scanner scanner = new Scanner((System.in));
		System.out.println("Enter the size of array : ");
		int n=scanner.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		
		System.out.println("Enter item to search : ");
		int item=scanner.nextInt();
		
		binser(arr, n, item);
		
	}
	
	public static void binser(int arr[],int length, int item)
	{
		int min=0;
		int max=length;
		int k=0;
		
		while(k==0)
		{

			int mid=min+((max-min)/2);
		if(mid==item)
		{
			System.out.println("Item found at : " +mid);
			k=1;
		}
		
		else if(item<arr[mid])
		{
			max=mid-1;
		}
		
		else if(item>arr[mid])
		{
			min=mid+1;
		}
		
		else {
			
				System.out.println("Item not found");
			
		}
		}
	}

}
