/*

Use of super Keyword : 

3. During Constructor
    Pass parameter to constructor of parent from constructor of child

*/

class Parent1
{
    int x;
    Parent1(int a)
    {
        x = a;
    }
}

class Child1 extends Parent1
{
    int y;
    Child1(int a, int b)
    {
        super(a);
        y = b;
    }
    void display()
    {
        System.out.println("Parent x : " + super.x);
        System.out.println("Child y : " + y);
    }
}

class UseSuper3
{
    public static void main(String[] args)
    {
        Child1 obj = new Child1(10, 20);
        obj.display();
    }
}