import java.util.Scanner;

class DeleteVowels
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		String s = "";
		
		int length = str.length();
		
		for(int i=0; i<length; i++)
		{
			char ch = str.charAt(i);
			if( ch=='A' || ch=='a' || ch=='E' || ch=='e' || ch=='I' || ch=='i' || ch=='O' || ch=='o' || ch=='U' || ch=='u' );
			
			else
			{
				s = s + ch + "";
			}
		}
		
		System.out.println("Required String : " + s);
	}
}