abstract class Marks
{
    abstract void getPercentage();
}

class A extends Marks
{
    float sub1, sub2, sub3;
    A(float i, float j, float k)
    {
        sub1 = i;
        sub2 = j;
        sub3 = k;
    }
    void getPercentage()
    {
        System.out.println("Percentage of Student A : " + (sub1+sub2+sub3)/3);
    }
}

class B extends Marks
{
    float sub1, sub2, sub3, sub4;
    B(float i, float j, float k, float l)
    {
        sub1 = i;
        sub2 = j;
        sub3 = k;
        sub4 = l;
    }
    void getPercentage()
    {
        System.out.println("Percentage of Student B : " + (sub1+sub2+sub3+sub4)/4);
    }
}

class AbstractThird
{
    public static void main(String[] args)
    {
        Marks ob1 = new A(90, 91, 93);
        ob1.getPercentage();

        System.out.println();

        Marks ob2 = new B(89, 90, 93, 95);
        ob2.getPercentage();
    }
}