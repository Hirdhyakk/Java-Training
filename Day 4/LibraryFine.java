import java.util.Scanner;

class LibraryFine
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the Number of Days : ");
		int days = sc.nextInt();
		
		if(days > 30)
		{
			System.out.print("Membership is Cancelled");
		}
		else
		{
			double fine= 0;
			if(days > 5)
			{
				fine = fine + 5*0.5;
				days = days - 5;
			}
			else
			{
				fine = fine + days*0.5;
				days = 0;
			}
			if(days > 5)
			{
				fine = fine + 5*1;
				days = days - 5;
			}
			else
			{
				fine = fine + days*1;
				days = 0;
			}
			fine = fine + days*5;
			System.out.print("Fine : " + fine);
		}
	}
}