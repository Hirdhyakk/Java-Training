import java.util.Scanner;

class CheckCharacter
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.nextLine().charAt(0);
		int ascii = (int) ch;
		if(ascii >= 65 && ascii <= 90)
		{
			System.out.print("Capital Letter");
		}
		else if(ascii >= 97 && ascii <=122)
		{
			System.out.print("Small Case Letter");
		}
		else if(ascii >= 48 && ascii <=57)
		{
			System.out.print("Digit");

		}
		else if( (ascii >= 0 && ascii <=47) || (ascii >= 58 && ascii<= 64) || (ascii >= 91 && ascii <= 96) || (ascii >= 123 && ascii <=127) )
		{
			System.out.print("Special Symbol");
		}
		else
		{
			System.out.print("Could Not Tell");
		}
	}
}