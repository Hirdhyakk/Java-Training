import java.util.Scanner;

class UseTemperature
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Temperature obj = new Temperature();
        
        System.out.println("\n1 to Convert Celsius to Fahrenheit");
        System.out.println("2 to Convert Fahrenheit to Celsius");
        System.out.println("\nEnter Your Choice : ");
        int choice = sc.nextInt();

        if(choice==1)
        {
            System.out.println("Enter Celsius : ");
            double c = sc.nextDouble();
            obj.celsius(c);
            obj.celsiusToFahrenheit();
        }
        else if(choice==2)
        {
            System.out.println("Enter Fahrenheit : ");
            double f = sc.nextDouble();
            obj.fahrenheit(f);
            obj.fahrenheitToCelsius();
        }
        else
        {
            System.out.println("Wrong Input");
        }

        sc.close();
    }
}