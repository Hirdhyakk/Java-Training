class Staff
{
    String code, name;
    Staff(String code, String name)
    {
        this.code = code;
        this.name = name;
    }
}

class Teacher extends Staff
{
    String subject, publication;
    Teacher(String code, String name, String subject, String publication)
    {
        super(code, name);
        this.subject = subject;
        this.publication = publication;
    }
    void getDetails()
    {
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Subject : " + subject);
        System.out.println("Publication : " + publication);
    }
}

class Typist extends Staff
{
    int speed;
    Typist(String code, String name, int speed)
    {
        super(code, name);
        this.speed = speed;
    }
}

class Regular extends Typist
{
    double salary;
    Regular(String code, String name, int speed, double salary)
    {
        super(code, name, speed);
        this.salary = salary;
    }
    void getDetails()
    {
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Speed : " + speed);
        System.out.println("Salary : " + salary);
    }
}

class Casual extends Typist
{
    double dailyWage;
    Casual(String code, String name, int speed, double dailyWage)
    {
        super(code, name, speed);
        this.dailyWage = dailyWage;
    }
    void getDetails()
    {
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Speed : " + speed);
        System.out.println("Daily Wage : " + dailyWage);
    }
}

class Officer extends Staff
{
    String grade;
    Officer(String code, String name, String grade)
    {
        super(code, name);
        this.grade = grade;
    }
    void getDetails()
    {
        System.out.println("Code : " + code);
        System.out.println("Name : " + name);
        System.out.println("Grade : " + grade);
    }
}

class Main
{
    public static void main(String[] args)
    {
        Teacher ob1 = new Teacher("ABC", "Ram", "Math", "none");
        ob1.getDetails();

        System.out.println();

        Regular ob2 = new Regular("DEF", "Shyam", 40, 20000);
        ob2.getDetails();

        System.out.println();

        Casual ob3 = new Casual("DEF", "Rohan", 45, 15000);
        ob3.getDetails();

        System.out.println();

        Officer ob4 = new Officer("GHI", "Mohan", "A+");
        ob4.getDetails();
    }
}