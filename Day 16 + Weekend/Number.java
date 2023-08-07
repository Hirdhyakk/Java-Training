class Parent
{
    int i;
    Parent(int x)
    {
        i = x;
    }
    void printNum()
    {
        System.out.println("Value of i : " + i);
    }
}

class Child extends Parent
{
    int j;
    Child(int a, int b)
    {
        super(a);
        j = b;
    }
    void printNum()
    {
        System.out.println("Value of j : " + j);
    }
}

class Number
{
    public static void main(String[] args)
    {
        Child obj = new Child(10, 20);
        obj.printNum();
    }
}