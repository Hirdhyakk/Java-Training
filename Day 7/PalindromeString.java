import java.util.Scanner;

class PalindromeString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter the String : ");
		String s = sc.nextLine();
		int start = 0;
		int end = s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
			{
				System.out.println("String is NOT Palindrome");
				return;
			}
			start++;
			end--;
		}
		System.out.println("String is Palindrome");
	}
}