abstract class superclass
{
    abstract void a_method();
    void normal_method()
    {
        System.out.println("This is a Normal Method of Abstract Class");
    }
}

class subclass extends superclass
{
    void a_method()
    {
        System.out.println("This is an Abstract Method");
    }
}

class AbstractFourth
{
    public static void main(String[] args)
    {
        subclass obj = new subclass();
        obj.a_method();
        obj.normal_method();
    }
}