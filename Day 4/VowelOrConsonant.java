import java.util.Scanner;

class VowelOrConsonant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Character : ");
		char ch = sc.nextLine().charAt(0);
		if( (ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') )
		{
			System.out.print("Vowel");
		}
		else
		{
			System.out.print("Consonant");
		}
	}
}