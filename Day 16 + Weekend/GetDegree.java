class Degree
{
    void getDegree()
    {
        System.out.println("I got a Degree.");
    }
}

class Undergraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am an Undergraduate");
    }
}

class Postgraduate extends Degree
{
    void getDegree()
    {
        System.out.println("I am a Postgraduate");
    }
}

class GetDegree
{
    public static void main(String[] args)
    {
        Degree ob1 = new Degree();
        ob1.getDegree();

        System.out.println();

        Undergraduate ob2 = new Undergraduate();
        ob2.getDegree();

        System.out.println();

        Postgraduate ob3 = new Postgraduate();
        ob3.getDegree();
    }
}