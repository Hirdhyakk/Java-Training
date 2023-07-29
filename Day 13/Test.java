import java.util.Scanner;

import JMIETI.JMIETIBranch;
import JMIETI.JMIETIinfo;

public class Test
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        boolean repeat = true;
        while(repeat)
        {
            System.out.println("        ---------------------------");
            System.out.println("         WELCOME TO JMIETI COLLEGE");
            System.out.println("        ---------------------------");

            System.out.println("\n\nAvailable Choices : ");
            System.out.println("    1 for College Information.");
            System.out.println("    2 for Branches Information.");
            System.out.println("    0 to Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1: 
                    JMIETIinfo ob1 = new JMIETIinfo();
                    ob1.display();
                break;

                case 2:
                    JMIETIBranch ob2 = new JMIETIBranch();
                    ob2.display();
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