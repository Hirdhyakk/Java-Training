abstract class Bank
{
    abstract void getBalance();
}

class BankA extends Bank
{
    int money = 100;
    void getBalance()
    {
        System.out.println("Balance in BankA : $" + money);
    }
}

class BankB extends Bank
{
    int money = 150;
    void getBalance()
    {
        System.out.println("Balance in BankB : $" + money);
    }
}

class BankC extends Bank
{
    int money = 200;
    void getBalance()
    {
        System.out.println("Balance in BankC : $" + money);
    }
}

class AbstractSecond
{
    public static void main(String[] args)
    {
        BankA ob1 = new BankA();
        ob1.getBalance();

        System.out.println();

        BankB ob2 = new BankB();
        ob2.getBalance();

        System.out.println();

        BankC ob3 = new BankC();
        ob3.getBalance();
    }
}
