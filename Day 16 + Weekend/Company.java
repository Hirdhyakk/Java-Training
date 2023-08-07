import java.util.Scanner;

abstract class Member
{
    Scanner sc = new Scanner(System.in);
    String name, phoneNumber, address;
    int age;
    double salary;
    Member()
    {
        System.out.print("Enter Name : ");
        name = sc.nextLine();
        System.out.print("Enter Age : ");
        age = sc.nextInt();
        sc.nextLine();
        // String a = sc.nextLine();System.out.println(a);
        System.out.print("Enter Phone Number : ");
        phoneNumber = sc.nextLine();
        System.out.print("Enter Address : ");
        address = sc.nextLine();
        System.out.print("Enter Salary : ");
        salary = sc.nextDouble();
    }
    abstract void getDetails();
    abstract void display();
    void printSalary()
    {
        System.out.println("Salary : " + salary);
    }
}

class Employee extends Member
{
    Scanner sc = new Scanner(System.in);
    String specialization, department;
    Employee()
    {
        super();
        getDetails();
    }
    void getDetails()
    {
        System.out.print("Enter Specialization : ");
        specialization = sc.nextLine();
        System.out.print("Enter Department : ");
        department = sc.nextLine();
    }
    void display()
    {
        System.out.println();
        System.out.println("Employee Details");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Address :  "+ address);
        printSalary();
        System.out.println("Specialization : " + specialization);
        System.out.println("Department : " + department);
    }
}

class Manager extends Member
{
    Scanner sc = new Scanner(System.in);
    String specialization, department;
    Manager()
    {
        super();
        getDetails();
    }
    void getDetails()
    {
        System.out.print("Enter Specialization : ");
        specialization = sc.nextLine();
        System.out.print("Enter Department : ");
        department = sc.nextLine();
    }
    void display()
    {
        System.out.println();
        System.out.println("Manager Details");
        System.out.println();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Phone Number : " + phoneNumber);
        System.out.println("Address :  "+ address);
        printSalary();
        System.out.println("Specialization : " + specialization);
        System.out.println("Department : " + department);
    }
}

class Company
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        while(true)
        {
            System.out.println();
            System.out.println();
            System.out.println("AVAILABLE CHOICES : ");
            System.out.println("\t1 for Employee");
            System.out.println("\t2 for Manager");
            System.out.println("\t3 for Exit");
            System.out.println("Enter Your Choice : ");
            int choice = sc.nextInt();

            switch(choice)
            {
                case 1:
                    Member ob1 = new Employee();
                    ob1.display();
                break;

                case 2:
                    Member ob2 = new Manager();
                    ob2.display();
                break;

                case 3:
                    System.out.println("Successfully Exited");
                    return;
                
                default:
                    System.out.println("Invalid Input");
            }
        }
    }
}