class Person
{
    private String name, dob;
    Person(String name, String dob)
    {
        this.name = name;
        this.dob = dob;
    }
    void personalDetails()
    {
        System.out.println("Name : " + name);
        System.out.println("DOB : " + dob);
    }
}

class CollegeGraduate extends Person
{
    String gpa, yearOfGraduation;
    CollegeGraduate(String name, String dob, String gpa, String yearOfGraduation)
    {
        super(name, dob);
        this.gpa = gpa;
        this.yearOfGraduation = yearOfGraduation;
    }
    void collegeDetails()
    {
        System.out.println("GPA : " + gpa);
        System.out.println("Year of Graduation : " + yearOfGraduation);
    }
}

class UsePerson
{
    public static void main(String[] args)
    {
        CollegeGraduate obj = new CollegeGraduate("Ram", "01 January 1990", "9.9", "2020");
        obj.personalDetails();
        obj.collegeDetails();
    }
}