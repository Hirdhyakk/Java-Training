package JMIETI;
import java.util.Scanner;

import JMIETI.BTech.BTechInfo;
import JMIETI.ComputerApplication.CAinfo;
import JMIETI.Management.MInfo;

public class JMIETIBranch
{
    public void display()
    {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;
        while(repeat)
        {
            System.out.println("\n\n---------------------------------------------");

            System.out.println("\n        Welcome to JMIETI Branches");

            System.out.println("\nAvailable Branches : ");
            System.out.println("    1. Bachelor of Technology");
            System.out.println("    2. Computer Applications");
            System.out.println("    3. Management");
            System.out.println("    0 to Exit");

            System.out.println("Enter Your Choices : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    BTechInfo ob1 = new BTechInfo();
                break;

                case 2:
                    CAinfo ob2 = new CAinfo();
                break;

                case 3:
                    MInfo ob3 = new MInfo();
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
