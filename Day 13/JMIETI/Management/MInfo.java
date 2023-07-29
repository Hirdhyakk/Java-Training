package JMIETI.Management;

import java.util.Scanner;

import JMIETI.Management.BBA.BBACourse;
import JMIETI.Management.MBA.MBACourse;

public class MInfo
{
    public MInfo()
    {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;

        while(repeat)
        {
            System.out.println("\n\n---------------------------------------------");

            System.out.println("\n        Management Branch");
            System.out.println("    Management includes Courses of BBA and MBA");
            System.out.println("    It deals with Management related Courses.");

            System.out.println("\nAvailable Choices : ");
            System.out.println("    1 for BBA");
            System.out.println("    2 for MBA");
            System.out.println("    0 for Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    BBACourse ob1 = new BBACourse();
                break;

                case 2:
                    MBACourse ob2 = new MBACourse();
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