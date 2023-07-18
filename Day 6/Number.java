class Number
{
	int num1, num2;
	Number()
	{
		num1 = 5;
		num2 = 10;
	}
	Number(int n1, int n2)
	{
		num1 = n1;
		num2 = n2;
	}
	void print()
	{
		System.out.println("num1 : " + num1 + ", num2 : " + num2);
	}
	public static void main(String args[])
	{
		Number ob1 = new Number();
		ob1.print();
		Number ob2 = new Number(100, 200);
		ob2.print();
	}
}