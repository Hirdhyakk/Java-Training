class PrintNumber
{
	void printn(int n)
	{
		System.out.println("Int n : " + n);
	}
	void printn(float n)
	{
		System.out.println("Float n : " + n);
	}
	void printn(double n)
	{
		System.out.println("Double n : " + n);
	}
	public static void main(String args[])
	{
		PrintNumber ob = new PrintNumber();
		ob.printn(10);
		ob.printn(10.5f);
		ob.printn(10.5);
	}
}