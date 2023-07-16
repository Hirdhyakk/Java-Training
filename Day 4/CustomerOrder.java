import java.util.Scanner;

class CustomerOrder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Credit Score (1 for OK and 0 for Not OK) : ");
		int creditScore = sc.nextInt();
		
		if(creditScore==0)
			System.out.print("Send Intimation That Credit Score is Not Good");
		
		else
		{
			System.out.print("Enter Order Quantity : ");
			int orderQuantity = sc.nextInt();
			System.out.print("Enter Available Stock : ");
			int stock = sc.nextInt();
			
			if(stock >= orderQuantity)
			{
				System.out.print("Supply the Order");
			}
			else
			{
				System.out.print("Supply Available Stock and Intimate the Custormer on whick Balance will be Shipped");
			}
		}
		sc.close();
	}
}