class AreaSquareRectangle
{
	void area(double side)
	{
		double area = side*side;
		System.out.println("Area of Square : " + area + " sq. units");
	}
	void area(double side1, double side2)
	{
		double area = side1*side2;
		System.out.println("Area of Rectangle : " + area + " sq. units");
	}
	public static void main(String args[])
	{
		AreaSquareRectangle ob = new AreaSquareRectangle();
		ob.area(5);
		ob.area(4,5);
	}
}