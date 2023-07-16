import java.util.Scanner;

class ProfitOrLose
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int costPrice, sellingPrice, difference;
		System.out.print("Enter Cost Price : ");
		costPrice = sc.nextInt();
		System.out.print("Enter Selling Price : ");
		sellingPrice = sc.nextInt();
		if(costPrice > sellingPrice)
		{
			difference = costPrice - sellingPrice;
			System.out.print("Lose of " + difference);
		}
		else
		{
			difference = sellingPrice - costPrice;
			System.out.print("Profit of " + difference);
		}
		sc.close();
	}
}