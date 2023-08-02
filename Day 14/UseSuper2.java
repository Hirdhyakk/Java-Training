/*

Use of super Keyword : 

2. During Instance Overriding
    Same instance/variable in parent and child class.

*/

class Parent
{
    int x;
    void setVal(int a)
    {
        x = a;
    }
}

class Child extends Parent
{
    int x;
    void setVal(int a, int b)
    {
        super.setVal(a);
        x = b;
    }
    void display()
    {
        System.out.println("Parent x : " + super.x);
        System.out.println("Child x : " + x);
    }
}

class UseSuper2
{
    public static void main(String[] args)
    {
        Child obj = new Child();
        obj.setVal(10, 20);
        obj.display();
    }
}