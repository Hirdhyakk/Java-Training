import java.util.Scanner;

class Account
{
	String customerName, accountNumber, typeOfAccount;
	double balance;
//	Account()
//	{
//		customerName = "unknown";
//		accountNumber = "111111111111";
//		typeOfAccount = "not known";
//		balance = 0;
//	}
	Account(String name, String number, String type)
	{
		customerName = name;
		accountNumber = number;
		typeOfAccount = type;
		if(typeOfAccount=="Saving" || typeOfAccount=="saving")
			balance = 5000;
		else
			balance = 10000;
	}
	void deposit(int amount)
	{
		balance = balance + amount;
	}
	void display()
	{
		System.out.println("Name : " + customerName);
		System.out.println("Account Number : " + accountNumber);
		System.out.println("Account Type : " + typeOfAccount);
		System.out.println("Balance : " + balance);
	}
	void withdrawal(int amount)
	{
		if(amount <= balance)
		{
			if( (amount <= 25000 && (typeOfAccount=="Saving" || typeOfAccount=="saving")) || (amount <= 50000 && (typeOfAccount=="Current" || typeOfAccount=="current")) )
			{
				System.out.println("Request is Processed, Please collect the Money");
				balance = balance - amount;
				if(balance<5000 && (typeOfAccount=="saving" || typeOfAccount=="Saving"))
				{
					System.out.println("Account Balance below Minimum Balance, Penalty of 100Rs is imposed");
					balance = balance - 100;
				}
				else if(balance<10000 && (typeOfAccount=="current" || typeOfAccount=="Current"))
				{
					System.out.println("Account Balance below Minimum Balance, Penalty of 500Rs is imposed");
					balance = balance - 500;
				}
			}
			else
			{
				System.out.println("Limit Exceeded");
			}
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Account obj = new Account("Ram", "123456789", "Saving");
		while(true)
		{
			System.out.println("\n\t-----------------------------------------");
			System.out.println("\t|\t0 for Exit");
			System.out.println("\t|\t1 for Depositing Money");
			System.out.println("\t|\t2 for Displaying the Balance");
			System.out.println("\t|\t3 for Withdrawal");
			System.out.println("\t-----------------------------------------\n");
			
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			int amount;
			System.out.println();
			
			System.out.println("------------------------------");
			switch(choice)
			{
				case 0:
					System.out.println("Account Successfully signed out");
					System.out.println("------------------------------");
					return;
				case 1:
					System.out.print("Enter Amount to Deposit : ");
					amount = sc.nextInt();
					obj.deposit(amount);
					break;
				case 2:
					obj.display();
					break;
				case 3:
					System.out.print("Enter Amount to Withdraw : ");
					amount = sc.nextInt();
					obj.withdrawal(amount);
					break;
				default:
					System.out.println("Invalid Input");
					break;
			}
			System.out.println("------------------------------");
		}
	}
}