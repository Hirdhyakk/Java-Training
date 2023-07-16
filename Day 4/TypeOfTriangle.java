import java.util.Scanner;

class TypeOfTriangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		double side1, side2, side3;
		System.out.print("Enter all the 3 Sides : ");
		side1 = sc.nextDouble();
		side2 = sc.nextDouble();
		side3 = sc.nextDouble();
		
	//	Equilatoral
		if(side1 == side2 && side2 == side3)
		{
			System.out.println("Given Triangle is Equilatoral");
		}
		else
		{
		//	Isosceles
			if(side1 == side2 || side1 == side3 || side2 == side3)
				System.out.println("Given Triangle is Isosceles");
		//	Scalene
			else
				System.out.println("Given Triangle is Scalene");
		//	Right Angled
			if( (side1*side1 == side2*side2 + side3*side3) || (side2*side2 == side1*side1 + side3*side3) || (side3*side3 == side1*side1 + side2*side2) )
				System.out.print("Given Triangle is Right Angled");
		}
		sc.close();
	}
}