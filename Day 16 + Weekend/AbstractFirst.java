abstract class Parent
{
    abstract void message();
}

class SubclassFirst extends Parent
{
    void message()
    {
        System.out.println("This is First Subclass");
    }
}

class SubclassSecond extends Parent
{
    void message()
    {
        System.out.println("This is Second Subclass");
    }
}

class AbstractFirst
{
    public static void main(String[] args)
    {
        SubclassFirst ob1 = new SubclassFirst();
        ob1.message();

        System.out.println();

        SubclassSecond ob2 = new SubclassSecond();
        ob2.message();
    }
}