abstract class Shape
{
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}

class Area extends Shape
{
    void rectangleArea(double length, double breadth)
    {
        System.out.println("Area of Rectangle : " + length*breadth + " square units");
    }
    void squareArea(double side)
    {
        System.out.println("Area of Square : " + side*side + "square units");
    }
    void circleArea(double radius)
    {
        System.out.println("Area of Circle : " + 3.14*radius*radius + " square units");
    }
}

class AbstractSixth
{
    public static void main(String[] args)
    {
        Area ob1 = new Area();
        ob1.rectangleArea(10, 20);

        System.out.println();

        ob1.squareArea(15);
        
        System.out.println();

        ob1.circleArea(5);
    }
}