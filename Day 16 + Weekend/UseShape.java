abstract class Shape
{
    double side1, side2;
    void get_data(int a, int b)
    {
        side1 = a;
        side2 = b;
    }
    abstract void display_area();
}

class Triangle extends Shape
{
    void display_area()
    {
        System.out.println("Area of Triangle : " + 0.5 * side1 * side2);
    }
}

class Rectangle extends Shape
{
    void display_area()
    {
        System.out.println("Area of Rectangle : " + side1  * side2);
    }
}

public class UseShape
{
    public static void main(String[] args)
    {
        Triangle ob1 = new Triangle();
        ob1.get_data(10, 20);
        ob1.display_area();

        System.out.println();

        Rectangle ob2 = new Rectangle();
        ob2.get_data(10, 20);
        ob2.display_area();
    }
}