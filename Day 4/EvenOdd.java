import java.util.Scanner;

class EvenOdd
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		if(number%2==0)
		{
			System.out.print("Number is Even");
		}
		else
		{
			System.out.print("Number is Odd");
		}
	}
}