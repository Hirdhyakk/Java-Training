import java.util.Scanner;

class LargestElementInArray
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of Array : ");
		int n= sc.nextInt();
		int a[] = new int[n];
		System.out.print("Enter Elements : ");
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int largest = Integer.MIN_VALUE;
		for(int item : a)
		{
			if(largest < item)
			{
				largest = item;
			}
		}
		System.out.print("Largest Number : " + largest);
	}
}