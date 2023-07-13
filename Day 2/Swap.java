import java.util.Scanner;

class Swap
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int num1, num2, temp;
		System.out.print("Enter num1 : ");
		num1 = sc.nextInt();
		System.out.print("Enter num2 : ");
		num2 = sc.nextInt();
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println();
		System.out.println("Value of num1 : " + num1);
		System.out.print("Value of num2 : " + num2);
	}
}