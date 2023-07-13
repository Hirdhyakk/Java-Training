import java.util.Scanner;

class AreaOfCircle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int radius;
		double area;
		System.out.print("Enter Radius : ");
		radius = sc.nextInt();
		area = 3.14 * radius * radius;
		System.out.print("Area : " + area);
	}
}