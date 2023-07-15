import java.util.Scanner;

class LeapYear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.print("Enter Year : ");
		year = sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					System.out.print("Leap Year");
				}
				else
				{
					System.out.print("Not a Leap Year");
				}
			}
			else
			{
				System.out.print("Leap Year");
			}
		}
		else
		{
			System.out.print("Not a Leap Year");
		}
		sc.close();
	}
}