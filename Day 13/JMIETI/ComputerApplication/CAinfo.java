package JMIETI.ComputerApplication;

import java.util.Scanner;

import JMIETI.ComputerApplication.BCA.BCACourse;
import JMIETI.ComputerApplication.MCA.MCACourse;

public class CAinfo
{
    public CAinfo()
    {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;

        while(repeat)
        {
            System.out.println("\n\n---------------------------------------------");

            System.out.println("\n    Computer Applications Branch");
            System.out.println("Computer Applications includes Courses of BCA and MCA.");
            System.out.println("It deals with Computer related Courses.");

            System.out.println("\nAvailable Courses : ");
            System.out.println("    1 for BCA");
            System.out.println("    2 for MCA");
            System.out.println("    0 for Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    BCACourse ob1 = new BCACourse();
                break;

                case 2:
                    MCACourse ob2 = new MCACourse();
                break;

                case 0:
                    repeat = false;
                break;

                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}