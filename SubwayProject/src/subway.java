import java.util.Scanner;

public class subway 
{
	String Crust;
	int Crust_cost;
	String Filling;
	int Filling_cost;
	String Topplings[] = new String[3];
	int Topplings_cost[] = new int[3];
	int total_cost;
	
	public String getCrust() {
		return Crust;
	}
	public void setCrust(String crust) {
		Crust = crust;
	}
	public int getCrust_cost() {
		return Crust_cost;
	}
	public void setCrust_cost(int crust_cost) {
		Crust_cost = crust_cost;
	}
	public String getFilling() {
		return Filling;
	}
	public void setFilling(String filling) {
		Filling = filling;
	}
	public int getFilling_cost() {
		return Filling_cost;
	}
	public void setFilling_cost(int filling_cost) {
		Filling_cost = filling_cost;
	}
	public String[] getTopplings() {
		return Topplings;
	}
	public void setTopplings(String[] topplings) {
		Topplings = topplings;
	}
	public int[] getTopplings_cost() {
		return Topplings_cost;
	}
	public void setTopplings_cost(int[] topplings_cost) {
		Topplings_cost = topplings_cost;
	}
	public int getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	
	public void PlaceOrder() {
		// TODO Auto-generated method stub
		String[] Crust = {"Hard","Thin","Soft"};
		String[] Filling = {"Chicken Tikka","Paneer Tikka","Turkey Meat"};
		String[] Topplings1 = {"Cucumber","Tomato","Meat strip","Cabbage"};
		int Topplings1_cost[] ={25,20,45,20};
		String[] Topplings2 = {"Cucumber","Tomato","Cabbage"};
		int Topplings2_cost[] = {25,20,20};
		int cost = 0;
		
		System.out.println("Select "+"Crust"+" (max of 1) ");
		System.out.println("   1) Hard - Rs. 10");
		System.out.println("   2) Thin - Rs. 10");
		System.out.println("   3) Soft - Rs. 12");
		
		Scanner scan = new Scanner(System.in);
		int ch2 = scan.nextInt();
		if(ch2==1)
		{
			cost = 10;
		}
		else if(ch2==2)
		{
			cost = 10;
		}
		else if(ch2==3)
		{
			cost = 12;
		}
		
		setCrust(Crust[ch2-1]);
		setCrust_cost(cost);
		
		if(ch2==1 || ch2==2 || ch2==3)
		{
			System.out.println("Select "+"Filling"+" (max of 1) ");
			System.out.println("   1) Chicken Tikka - Rs. 120");
			System.out.println("   2) Paneer Tikka  - Rs. 100");
			System.out.println("   3) Turkey meat   - Rs. 130");
			
			int ch3 = scan.nextInt();
			
			if(ch2==1)
			{
				cost = 120;
			}
			else if(ch2==2)
			{
				cost = 100;
			}
			else if(ch2==3)
			{
				cost = 130;
			}
			
			setFilling(Filling[ch3-1]);
			setFilling_cost(cost);
			
			if(ch3==1 || ch3==3)
			{
				System.out.println("Select "+"Toppings"+" (max of 3) ");
				System.out.println("   1) Cucumber   - Rs. 25");
				System.out.println("   2) Tomato     - Rs. 20");
				System.out.println("   3) Meat strip - Rs. 45");
				System.out.println("   4) Cabbage    - Rs. 20");
				
				String ch = scan.next();
				String arr[]= ch.split(",");
				int []arr1 = new int[arr.length];
				for(int i=0;i<arr1.length;i++)
				{
					arr1[i]=Integer.parseInt(arr[i]);
				}
				String str[] = new String[arr.length];
				int cost1[] = new int[arr.length];
				for(int i=0;i<arr.length;i++)
				{
					str[i] = Topplings1[arr1[i]-1];
					cost1[i] = Topplings1_cost[arr1[i]-1];
					total_cost = total_cost+cost1[i];
				}
				
				if(str.length==3)
				{
					for(int i=0;i<str.length;i++)
					{
						if(cost1[i]==20)
						{
							cost1[i] = 0;
							total_cost = total_cost-20;
							break;
						}
					}
				}
				total_cost = total_cost+getCrust_cost()+getFilling_cost();
				setTopplings(str);
				setTopplings_cost(cost1);
			}
			else if(ch3==2)
			{
				System.out.println("Select "+"Toppings"+" (max of 3) ");
				System.out.println("   1) Cucumber   - Rs. 25");
				System.out.println("   2) Tomato     - Rs. 20");
				System.out.println("   3) Cabbage    - Rs. 20");
				String ch = scan.next();
				String arr[]= ch.split(",");
				int []arr1 = new int[arr.length];
				for(int i=0;i<arr1.length;i++)
				{
					arr1[i]=Integer.parseInt(arr[i]);
				}
				String str[] = new String[arr.length];
				int cost1[] = new int[arr.length];
				for(int i=0;i<arr.length;i++)
				{
					str[i] = Topplings2[arr1[i]-1];
					cost1[i] = Topplings2_cost[arr1[i]-1];
					total_cost = total_cost+cost1[i];
				}
				
				if(str.length==3)
				{
					for(int i=0;i<str.length;i++)
					{
						if(cost1[i]==20)
						{
							cost1[i] = 0;
							total_cost = total_cost-20;
							break;
						}
					}
				}
				total_cost = total_cost+getCrust_cost()+getFilling_cost();
				setTopplings(str);
				setTopplings_cost(cost1);
			}
			else
			{
				System.out.println("Wrong choice try again");
				PlaceOrder();
			}
		}
		else
		{
			System.out.println("Wrong choice try again");
			PlaceOrder();
		}	
		
	}
	
	public void PrintInvoice() {
		// TODO Auto-generated method stub
		System.out.println("Invoice for Sub");
		System.out.print("   Crust - "+getCrust());
		for(int i=0;i<20-(getCrust().length()+5);i++)
		{
			System.out.print(" ");
		}
		System.out.print(" Rs. - "+getCrust_cost());
		System.out.println();
		
		System.out.print("   Filling - "+getFilling());
		for(int i=0;i<20-(getFilling().length()+7);i++)
		{
			System.out.print(" ");
		}
		System.out.print(" Rs. - "+getFilling_cost());
		System.out.println();
		
		for(int i=0;i<=Topplings.length-1;i++)
		{
			System.out.print("   Toppling - "+Topplings[i]);
			for(int j=0;j<20-(Topplings[i].length()+7);j++)
			{
				System.out.print(" ");
			}
			System.out.print("Rs. - "+Topplings_cost[i]);
			System.out.println();
		}
		System.out.println();
		System.out.print("   Total   ");
		for(int i=0;i<20-5;i++)
		{
			System.out.print(" ");
		}
		System.out.print(" Rs. - "+getTotal_cost());
		System.out.println();
	}
}
