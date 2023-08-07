import java.util.Scanner;

abstract class Account
{
    String custName, accountNumber, typeOfAccount;
    double money;
    void setDetails(String name, String accNumber, String accountType)
    {
        custName = name; accountNumber = accNumber; typeOfAccount = accountType;
        money = 10000;
    }
    abstract void deposit(int amount);
    abstract void display();
    abstract void withdrawal(int amount);
}

class CurrentAccount extends Account
{
    Scanner sc = new Scanner(System.in);
    int minAmount = 5000;
    int penalty = 1000;
    void deposit(int amount)
    {
        money = money + amount;
    }
    void display()
    {
        System.out.println("Name : " + custName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type: " + typeOfAccount);
        System.out.println("Balance : " + money);
    }
    void withdrawal(int amount)
    {
        if(amount > money)
        {
            System.out.println("Not Enough Money.");
            return;
        }
        if(money-amount < minAmount)
        {
            System.out.println("Amount in Bank will become less than Minimum Amount.");
            System.out.println("Enter 1 to Withdraw.");
            int choice = sc.nextInt();
                if(choice == 1)
                {
                    System.out.println("Amount Debit Successfully.");
                    money = money - amount;
                }
                else
                {
                    System.out.println("Transaction Stopped.");
                }
        }
        else
        {
            System.out.println("Amount Debit Successfully.");
            money = money - amount;
        }
        if(money < minAmount)
        {
            money = money - penalty;
        }
    }
}

class SavingAccount extends Account
{
    Scanner sc = new Scanner(System.in);
    int minAmount = 1000;
    int penalty = 500;
    void deposit(int amount)
    {
        money = money + amount;
    }
    void display()
    {
        System.out.println("Name : " + custName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Type: " + typeOfAccount);
        System.out.println("Balance : " + money);
    }
    void withdrawal(int amount)
    {
        if(amount > money)
        {
            System.out.println("Not Enough Money.");
            return;
        }
        if(money-amount < minAmount)
        {
            System.out.println("Amount in Bank will become less than Minimum Amount.");
            System.out.println("Enter 1 to Withdraw.");
            int choice = sc.nextInt();
                if(choice == 1)
                {
                    System.out.println("Amount Debit Successfully.");
                    money = money - amount;
                }
                else
                {
                    System.out.println("Transaction Stopped.");
                }
        }
        else
        {
            System.out.println("Amount Debit Successfully.");
            money = money - amount;
        }
        if(money < minAmount)
        {
            money = money - penalty;
        }
    }
}

class Banks
{
    static Scanner sc = new Scanner(System.in);
    static void choices(Account obj)
    {
        boolean repeate = true;
        while(repeate)
        {
            System.out.println();
            System.out.println("AVAILABLE CHOICES : ");

            System.out.println("\t1 for Deposit");
            System.out.println("\t2 for Withdrawal");
            System.out.println("\t3 for Display Balance");
            System.out.println("\t4 for Exit");

            System.out.println();
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            int amount;

            switch(choice)
            {
                case 1:
                    System.out.println("Enter the Amount : ");
                    amount = sc.nextInt();
                    obj.deposit(amount);
                break;

                case 2:
                    System.out.println("Enter the Amount : ");
                    amount = sc.nextInt();
                    obj.withdrawal(amount);
                break;

                case 3:
                    obj.display();
                break;

                case 4:
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }

    public static void main(String[] args)
    {        
        while(true)
        {
            System.out.println("Type of Account : ");
            System.out.println("\t1 for Current");
            System.out.println("\t2 for Saving");
            System.out.println("\t3 for Exit");
            System.out.println();
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            if(choice == 1)
            {
                CurrentAccount ob1 = new CurrentAccount();
                ob1.setDetails("Ram", "123456789", "Current");
                choices(ob1);
            }
            else if(choice == 2)
            {
                SavingAccount ob1 = new SavingAccount();
                ob1.setDetails("Ram", "123456789", "Saving");
                choices(ob1);
            }
            else if(choice == 3)
            {
                System.out.println("Successfully Closed.");
                return;
            }
            else
            {
                System.out.println("Invalid Choice.");
            }            
        }
    }
}