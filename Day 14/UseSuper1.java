/*

Use of super Keyword : 

1. During Method Overriding
    Same method in parent and child class.

*/

class Box
{
    double width, height, length;
    void setDim(double w, double h, double l)
    {
        width = w;
        height = h;
        length = l;
    }
    void display()
    {
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Length : " + length);
    }
}

class BoxColor extends Box
{
    String color;
    void setColor(String c)
    {
        color = c;
    }
    void display()
    {
        super.display();
        System.out.println("Color : " + color);
    }
}


class UseSuper1
{
    public static void main(String[] args)
    {
        BoxColor obj = new BoxColor();
        obj.setDim(1.5, 2.5, 3.5);
        obj.setColor("Black");
        obj.display();
    }
}
