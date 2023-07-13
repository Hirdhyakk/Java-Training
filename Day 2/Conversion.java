import java.util.Scanner;

class Conversion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int kilometer, meter, centimeter;
		System.out.print("Enter Kilometers : ");
		kilometer = sc.nextInt();
		meter = kilometer * 1000;
		centimeter = meter * 100;
		System.out.println("Meter : " + meter);
		System.out.println("Centimeter : " + centimeter);
	}
}