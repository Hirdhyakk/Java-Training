class CharNumber
{
	void print(int n, char c)
	{
		System.out.println("Number : " + n + ", Char : " + c);
	}
	void print(char c, int n)
	{
		System.out.println("Char : " + c + ", Number : " + n);
	}
	public static void main(String args[])
	{
		CharNumber ob = new CharNumber();
		ob.print(10, 'a');
		ob.print('a', 10);
	}
}