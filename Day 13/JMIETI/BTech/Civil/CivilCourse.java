package JMIETI.BTech.Civil;

import java.util.Scanner;

public class CivilCourse 
{
    public CivilCourse()
    {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        while(repeat)
        {
            System.out.println("\n\n---------------------------------------------");
            
            System.out.println("\n        Course Detail of CIVIL : ");
            
            System.out.println("\nAvailable Choices : ");
            System.out.println("    1 for Duration.");
            System.out.println("    2 for Fees.");
            System.out.println("    0 to Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();
        
            switch(choice)
            {
                case 1: 
                    duration();
                break;

                case 2:
                    fees();
                break;

                case 0:
                    repeat = false;
                break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
    public static void duration()
    {
        System.out.println("The duration of Civil Course is 4 Years");
    }
    public static void fees()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Civil Fees");

        boolean repeat = true;
        while(repeat)
        {
            System.out.println("Enter Sem to check the fees or 0 to Exit : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    System.out.println("Fees for 1st Sem is Rs. xxx");
                break;

                case 2:
                    System.out.println("Fees for 2nd Sem is Rs. xxx");
                break;

                case 3:
                    System.out.println("Fees for 3rd Sem is Rs. xxx");
                break;

                case 4:
                    System.out.println("Fees for 4th Sem is Rs. xxx");
                break;

                case 5:
                    System.out.println("Fees for 5th Sem is Rs. xxx");
                break;

                case 6:
                    System.out.println("Fees for 6th Sem is Rs. xxx");
                break;

                case 7:
                    System.out.println("Fees for 7th Sem is Rs. xxx");
                break;

                case 8:
                    System.out.println("Fees for 8th Sem is Rs. xxx");
                break;

                case 0:
                    repeat = false;
                break;

                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
