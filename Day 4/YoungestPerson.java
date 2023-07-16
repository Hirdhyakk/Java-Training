import java.util.Scanner;

class YoungestPerson
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Age of Ram : ");
		int ram = sc.nextInt();
		System.out.print("Enter Age of Shyam : ");
		int shyam = sc.nextInt();
		System.out.print("Enter Age of Ajay : ");
		int ajay = sc.nextInt();
		
		if(ram < shyam)
		{
			if(ram < ajay)
			{
				System.out.print("Ram is Youngest");
			}
			else
			{
				System.out.print("Ajay is Youngest");
			}
		}
		else
		{
			if(shyam < ajay)
			{
				System.out.print("Shyam is Youngest");
			}
			else
			{
				System.out.print("Ajay is Youngest");
			}
		}
	}
}