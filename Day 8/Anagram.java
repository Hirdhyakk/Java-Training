import java.util.Scanner;

class Anagram
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s1, s2;
		System.out.print("Enter String 1 : ");
		s1 = sc.nextLine();
		System.out.print("Enter String 2 : ");
		s2 = sc.nextLine();
		int l1 = s1.length();
		int l2 = s2.length();
		if(l1!=l2)
		{
			System.out.println("Strings are NOT Anagram");
		}
		else
		{
			int i,j;
			for(i=0; i<l1; i++)
			{
				for(j=0; j<l2; j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						break;
					}
				}
				if(j==l2)
				{
					System.out.println("Strings are NOT Anagram");
					return;
				}
			}
			System.out.println("Strings are Anagram");
		}
	}
}