import java.util.Scanner;

class EfficiencyOfWorker
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Work Done (in Hours) : ");
		int hours = sc.nextInt();
		if(hours>2 && hours<=10)
		{
			System.out.print("Worker is Highly Efficient");
		}
		else if(hours>10 && hours<=20)
		{
			System.out.print("Worker is ordered to Increase Speed");
		}
		else if(hours>20 && hours<=30)
		{
			System.out.print("Worker needs Training");
		}
		else if(hours>30)
		{
			System.out.print("Worker has to Leave the Company");
		}
		else
		{
			System.out.print("Wrong Input");
		}
		sc.close();
	}
}