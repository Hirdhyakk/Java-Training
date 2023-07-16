import java.util.Scanner;

class Absolute
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		System.out.print("Absolute Number is : ");
		if(number<0)
		{
			number = number * -1;
			System.out.print(number);
		}
		else
		{
			System.out.print(number);
		}
	}
}