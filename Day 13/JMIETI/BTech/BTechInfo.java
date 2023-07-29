package JMIETI.BTech;

import java.util.Scanner;

import JMIETI.BTech.AIML.AIMLCourse;
import JMIETI.BTech.CS.CSCourse;
import JMIETI.BTech.Civil.CivilCourse;

public class BTechInfo
{
    public BTechInfo()
    {
        Scanner sc = new Scanner(System.in);

        boolean repeat = true;

        while(repeat)
        {
            System.out.println("\n\n---------------------------------------------");

            System.out.println("\n        Bachelor of Technology Branch");
            System.out.println("Bachelor of Technology includes Courses of CS, CS(AIML) and Civil.");

            System.out.println("\nAvailable Courses : ");
            System.out.println("    1 for Computer Science");
            System.out.println("    2 for CS(AIML)");
            System.out.println("    3 for Civil");
            System.out.println("    0 for Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    CSCourse ob1 = new CSCourse();
                break;

                case 2:
                    AIMLCourse ob2 = new AIMLCourse();
                break;

                case 3:
                    CivilCourse ob3 = new CivilCourse();
                break;

                case 0:
                    repeat = false;
                break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println("\npress enter to return");
            String s = sc.nextLine();
        }
    }
}
