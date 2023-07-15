import java.util.Scanner;

class money
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int amount;
		System.out.print("Enter the Amount : ");
		amount = sc.nextInt();
		int hundredNotes, fiftyNotes, twentyNotes, tenNotes, fiveNotes, leftOver;
		
		hundredNotes = amount / 100;
		amount = amount - (hundredNotes*100); //amount = amount % 100;
		
		fiftyNotes = amount / 50;
		amount = amount - (fiftyNotes*50);
		
		twentyNotes = amount / 20;
		amount = amount - (twentyNotes*20);
		
		tenNotes = amount / 10;
		amount = amount - (tenNotes*10);
		
		fiveNotes = amount / 5;
		amount = amount - (fiftyNotes*5);
		
		System.out.println("100 Notes : " + hundredNotes);
		System.out.println("50 Notes : " + fiftyNotes);
		System.out.println("20 Notes : " + twentyNotes);
		System.out.println("10 Notes : " + tenNotes);
		System.out.println("5 Notes : " + fiveNotes);
		
	}
}