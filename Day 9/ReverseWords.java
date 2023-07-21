import java.util.Scanner;

class ReverseWords
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		String s = "";
		int index1 = str.indexOf(' ');
		int index2 = str.lastIndexOf(' ');
		s = s + str.substring(index2, str.length()) + str.substring(index1, index2+1) + str.substring(0, index1);
		System.out.println("Required Output : " + s);
	}
}

//   India is Great