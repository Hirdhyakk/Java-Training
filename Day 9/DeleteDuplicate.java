import java.util.Scanner;

class DeleteDuplicate
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.nextLine();
		String s1 = "";
		String s = "";
		
		int length = str.length();
		
		for(int i=0; i<length; i++)
		{
			char ch = str.charAt(i);
			Boolean check = false;
			if(ch==' ')
			{
				s = s + ch + "";
			}
			else
			{
				for(int j=0; j<s1.length(); j++)
				{
					if(ch==s1.charAt(j))
					{
						check = true;
						break;
					}
				}
				if(check);
				else
				{
					s1 = s1 + ch + "";
					s = s + ch + "";
				}
			}
		}
		System.out.println("Required String : " + s);
	}
}