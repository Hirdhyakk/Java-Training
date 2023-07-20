import java.util.Scanner;

class RemoveExcessBlanks
{
	static void excessBlanks(String s)
	{
		int length = s.length();
		String str = "";
		int indexStart=0, indexEnd=0;
		for(int i=0; i<length; i++)
		{
			if(s.charAt(i)==' ' && i>0)
			{
				indexEnd = i;
				if(indexStart<indexEnd)
					str = str + s.substring(indexStart, indexEnd) + " ";
				indexStart = i+1;
			}
		}
		str = str + s.substring(indexStart, length);
		System.out.println("Required Output : " + str);
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String s1 = sc.nextLine();
		s1 = s1.trim();
		String s2 = "";
		int length = s1.length();
		int counter = 0;
		for(int i=0; i<length; i++)
		{
			if(counter==1 && s1.charAt(i)==' ');
			else if(s1.charAt(i)==' ')
			{
				s2 = s2 + (s1.charAt(i));
				counter = 1;
			}
			else
			{
				s2 = s2 + (s1.charAt(i));
				counter = 0;
			}
		}
		System.out.println("Required Output : " + s2);
		excessBlanks(s1);
	}
}