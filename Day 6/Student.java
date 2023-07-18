class Student
{
	String name;
	int age;
	String address;
	Student()
	{
		name = "unknown";
		age = 0;
		address = "not available";
	}
	void setInfo(String setName, int setAge)
	{
		name = setName;
		age = setAge;
	}
	void setInfo(String setName, int setAge, String setAddress)
	{
		name = setName;
		age = setAge;
		address = setAddress;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		System.out.println("Address : " + address);
	}
	public static void main(String args[])
	{
		Student ob1 = new Student();
		ob1.setInfo("Ram", 15);
		ob1.display();
		
		System.out.println();
		
		Student ob2 = new Student();
		ob2.setInfo("Shyam", 20, "Yamunanagar, Haryana");
		ob2.display();
		
	//	System.out.println();
		
	//	Student ob3 = new Student();
	//	ob3 = setInfo("Rohan");
	}
}