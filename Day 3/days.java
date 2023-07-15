class days
{
	public static void main(String args[])
	{
		int total = Integer.parseInt(args[0]);
		
		int year, month, day;
		
		year = total / 360;
		total = total - (year*360);
		
		month = total / 30;
		total = total - (month*30);
		
		day = total;
		
		System.out.println("Year : " + year);
		System.out.println("Month : " + month);
		System.out.println("Day : " + day);
		
	}
}