class BankClass
{
    void getBalance()
    {}
}

class BankA extends BankClass
{
    int money = 1000;
    void getBalance()
    {
        System.out.println(money);
    }
}

class BankB extends BankClass
{
    int money = 1500;
    void getBalance()
    {
        System.out.println(money);
    }
}

class BankC extends BankClass
{
    int money = 2000;
    void getBalance()
    {
        System.out.println(money);
    }
}

class Balance
{
    public static void main(String[] args)
    {
        BankA ob1 = new BankA();
        System.out.print("Balance in Bank A : ");
        ob1.getBalance();

        System.out.println();

        BankB ob2 = new BankB();
        System.out.print("Balance in Bank B : ");
        ob2.getBalance();

        System.out.println();

        BankC ob3 = new BankC();
        System.out.print("Balance in Bank C : ");
        ob3.getBalance();
    }
}