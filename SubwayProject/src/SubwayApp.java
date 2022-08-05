import java.util.Scanner;

public class SubwayApp
{

	static subway s = new subway();
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Subway:");
		System.out.println("   1) Order 'Sub' off the day");
		System.out.println("   2) Order your own 'Sub'");
		System.out.println("   3) Exit");
		
		Scanner scan = new Scanner(System.in);
		
		int ch1 = scan.nextInt();
		if(ch1==1)
		{
			s.PlaceOrder();
		}
		else if(ch1==2)
		{
			System.out.println("Wrong choice try again");
			main(args);
		}
		else if(ch1==3)
		{
			System.exit(0);
		}
		else
		{
			System.out.println("Wrong choice try again");
			main(args);
		}
		s.PrintInvoice();
	}
}