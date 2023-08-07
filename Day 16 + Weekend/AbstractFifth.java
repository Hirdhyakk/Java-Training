abstract class Animals
{
    abstract void cats();
    abstract void dogs();
}

class Cats extends Animals
{
    void cats()
    {
        System.out.println("Cats meow");
    }
    void dogs(){}
}

class Dogs extends Animals
{
    void cats(){}
    void dogs()
    {
        System.out.println("Dogs bark");
    }
}

class AbstractFifth
{
    public static void main(String[] args)
    {
        Cats ob1 = new Cats();
        ob1.cats();

        System.out.println();

        Dogs ob2 = new Dogs();
        ob2.dogs();
    }
}