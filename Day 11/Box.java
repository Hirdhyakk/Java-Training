class Box
{
    double width, height, depth;
    void setBoxDimensions(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
    double volume()
    {
        return width*height*depth;
    }
}