class Box
{
    double width, height, length;
    void setDim(double w, double h, double l)
    {
        width = w;
        height = h;
        length = l;
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
        System.out.println("Width : " + width);
        System.out.println("Height : " + height);
        System.out.println("Length : " + length);
        System.out.println("Color : " + color);
    }
}


class SingleInheritance
{
    public static void main(String[] args)
    {
        BoxColor obj = new BoxColor();
        obj.setDim(1.5, 2.5, 3.5);
        obj.setColor("Black");
        obj.display();
    }
}
