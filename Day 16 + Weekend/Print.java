class Parent
{
    static void printName()
    {
        System.out.println("Parent");
    }
}

class Child extends Parent
{
    static void printName()
    {
        System.out.println("Child");
    }
}

class Print
{
    public static void main(String args[])
    {
        Parent ob1 = new Parent();
        ob1.printName();

        System.out.println();

        Child ob2 = new Child();
        ob2.printName();

        System.out.println();

        Parent ob3 = new Child();
        ob3.printName();
    }
}