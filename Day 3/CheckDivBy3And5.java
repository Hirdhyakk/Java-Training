import java.util.Scanner;

class CheckDivBy3And5
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int number;
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		if(number%3==0)
		{
			if(number%5==0)
			{
				System.out.print("Number is Divisible by Both 3 and 5");
			}
			else
			{
				System.out.print("Number is only Divisible by 3");
			}
		}
		else if(number%5==0)
		{
			System.out.print("Number is only divisible by 5");
		}
		sc.close();
	}
}