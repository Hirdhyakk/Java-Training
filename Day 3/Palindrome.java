import java.util.Scanner;

class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int number, reverse=0, currValue=0, check;
		System.out.print("Enter the Number : ");
		number = sc.nextInt();
		check = number;
		while(number>0)
		{
			currValue = number % 10;
			reverse = (reverse*10) + currValue;
			number = number / 10;
		}
		if(check == reverse)
		{
			System.out.print("Number is Palindrome");
		}
		else
		{
			System.out.print("Number is Not Palindrome");
		}
		sc.close();
	}
}