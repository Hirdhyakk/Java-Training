class Rectangle
{
    int length, breadth;
    Rectangle(int a, int b)
    {
        length = a;
        breadth = b;
    }
    void area()
    {
        System.out.println("Area : " + length * breadth);
    }
    void perimeter()
    {
        System.out.println("Perimeter : " + 2*(length+breadth));
    }
}

class Square extends Rectangle
{
    Square(int s)
    {
        super(s,s);
    }
}

class AreaPerimeter
{
    public static void main(String[] args)
    {
        System.out.println("RECTANGLE : ");
        Rectangle ob1 = new Rectangle(10, 20);
        ob1.area();
        ob1.perimeter();

        System.out.println();

        System.out.println("SQUARE : ");
        Square ob2 = new Square(10);
        ob2.area();
        ob2.perimeter();
    }
}