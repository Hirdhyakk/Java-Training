import java.util.Scanner;

class CountVowelConsonant
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		str = str.toLowerCase();
		
		int countVowel=0, countConsonant=0;
		int length = str.length();
		
		for(int i=0; i<length; i++)
		{
			char ch = str.charAt(i);
			int ascii = (int) ch;
			if( ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
			{
				countVowel++;
			}
			else if(ch>=97 && ch<=122)
			{
				countConsonant++;
			}
		}
		System.out.println("Total Vowels : " + countVowel);
		System.out.println("Total Consonants : " + countConsonant);
	}
}