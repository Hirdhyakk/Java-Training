import java.util.Scanner;

class ConvertString
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		String s2 = "";
		s2 = s2 + s1.charAt(0);
		s2 = s2 + ". ";
		int length = s1.length();
		int count = 0;
		for(int i=0; i<length; i++)
		{
			if(count==2)
			{
				s2 = s2 + s1.charAt(i);
			}
			else if(s1.charAt(i)==' ' && i<length-2)
			{
				count++;
				if(count!=2)
					s2 = s2 + s1.charAt(i+1) + ". ";
			}
		}
		System.out.println("Required Output : " + s2);
	}
}