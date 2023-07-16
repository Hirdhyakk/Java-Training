import java.util.Scanner;

class Triangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double angle1, angle2, angle3;
		System.out.print("Enter The Angles : ");
		angle1 = sc.nextDouble();
		angle2 = sc.nextDouble();
		angle3 = sc.nextDouble();
		double sum = angle1 + angle2 + angle3;
		if(sum == 180)
		{
			System.out.print("It is a Triangle");
		}
		else
		{
			System.out.print("It is not a Triangle");
		}
	}
}