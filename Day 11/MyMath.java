import java.util.Scanner;

class MyMath
{
    static int power(int number, int power)
    {
        int result = 1;
        for(int i=0; i<power; i++)
        {
            result = result * number;
        }
        return result;
    }
    static int factorial(int number)
    {
        if(number==1)
            return 1;
        return number * factorial(number-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("AVAILABLE CHOICES : ");
        System.out.println("1 for Power");
        System.out.println("2 for Factorial");
        System.out.println("3 for Square Root");
        System.out.println("\nEnter Your Choice : ");
        int choice = sc.nextInt();
        int number, power;
        
        switch(choice)
        {
            case 1:
                System.out.print("Enter Number : ");
                number = sc.nextInt();
                System.out.print("Enter Power : ");
                power = sc.nextInt();
                System.out.println("Result : " + power(number, power));
            break;

            case 2:
                System.out.print("Enter Number : ");
                number = sc.nextInt();
                System.out.println("Result : " + factorial(number));
            break;

            case 3:
                System.out.print("Enter Number : ");
                number = sc.nextInt();
                System.out.println("Result : " + Math.sqrt(number));
            break;

            default:
                System.out.println("Wrong Input.");
        }
        sc.close();
    }
}
