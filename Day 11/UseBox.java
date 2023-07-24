import java.util.Scanner;

class UseBox
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Box obj = new Box();

        double width, height, depth;

        System.out.print("Enter Width : ");
        width = sc.nextDouble();
        System.out.print("Enter Height : ");
        height = sc.nextDouble();
        System.out.print("Enter Depth : ");
        depth = sc.nextDouble();

        obj.setBoxDimensions(width,height,depth);

        double volume = obj.volume();
        System.out.println("Volume : " + volume + " unit cube");

        sc.close();
    }
}