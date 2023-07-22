import java.util.Scanner;

class DeleteNegativeElement
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of Array : ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int conversions = 0;
		int count = n;
		for(int i=0; i<n; i++)
		{
			if(a[i]<0 && conversions<n)
			{
				if(i==n-1)
					a[i]=0;
				else
					for(int j=i; j<n-1; j++)
					{
						a[j] = a[j+1];
					}
				conversions++;
				if(i!=n-1)
					i--;
				count--;
			}
		}
		System.out.print("Required Array : ");
		for(int i=0; i<count; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}