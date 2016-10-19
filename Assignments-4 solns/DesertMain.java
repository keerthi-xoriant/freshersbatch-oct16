import java.util.Scanner;
abstract class DesertItem{
abstract double getCost();
}
class Candy extends DesertItem{
	private double cost=100.0;
	private int qty=10;
	public double getCost(){
		return cost/(double)60.0;
	}
	public int getQty(){
		return qty;
	}
	
	public void addQty(int n){
		this.qty+=n;
	}
	public void subQty(int n){
		this.qty-=n;
	}
}

class Cookie extends DesertItem{
	private double cost=200.0;
	private int qty=10;
	public double getCost(){
		return cost/(double)70.0;
	}
		public int getQty(){
		return qty;
	}
		public void addQty(int n){
		this.qty+=n;
	}
		public void subQty(int n){
		this.qty-=n;
	}
}

class Icecream extends DesertItem{
	private int cost=300;
	private int qty=10;
	public double getCost(){
		return cost;
	}
		public int getQty(){
		return qty;
	}
		public void addQty(int n){
		this.qty+=n;
	}
		public void subQty(int n){
		this.qty-=n;
	}
}

class DesertMain{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		int inp,odno,qty;
		Candy c=new Candy();
		Cookie ck=new Cookie();
		Icecream ic=new Icecream();
		double cost;
		for(;;){
			System.out.println("Enter your role:\n");
			System.out.println("Customer : press 1");
			System.out.println("Owner : press 2");
			System.out.println("Exit : press 3");
			inp=scan.nextInt();
			if(inp==1){
				System.out.println("Hello Customer,please place your order:");
				System.out.println("Press 1 for Candy");
				System.out.println("Press 2 for Cookie");
				System.out.println("Press 3 for Icecream");
				odno=scan.nextInt();
				System.out.println("Enter the quantity:");
				qty=scan.nextInt();
				switch(odno){
					case 1:		if(c.getQty()>=qty){
									System.out.println("Your order has been placed");
									System.out.println("The total cost for "+qty+" Candies is "+(double)qty*c.getCost()+"dollars\n");
									c.subQty(qty);
								}
								else{
									System.out.println("The item quantity in storage is less than you mentioned,please enter less quantity \n");
								}
								break;
					
					case 2:		if(ck.getQty()>=qty){
								System.out.println("Your order has been placed");
								System.out.println("The total cost is"+qty+" Cookies is "+(double)qty*ck.getCost()+"Euros\n");
								}
								else{
									System.out.println("The item quantity in storage is less than you mentioned,please enter less quantity\n ");
								}
								break;
						
					case 3:		if(ic.getQty()>=qty){
								System.out.println("Your order has been placed");
								System.out.println("The total cost is"+qty+" Icecream is "+qty*ic.getCost()+"Rupees\n");
								}
								else{
									System.out.println("The item quantity in storage is less than you mentioned,please enter less quantity\n ");
								}
								break;		
							
					default:	System.out.println("Wrong Input for desert item\n");
				}
			}
			else if(inp==2){
				System.out.println("Hello owner,please enter the item no:");
				System.out.println("Press 1 for Candy");
				System.out.println("Press 2 for Cookie");
				System.out.println("Press 3 for Icecream");
				odno=scan.nextInt();
				System.out.println("Enter the quantity:");
				qty=scan.nextInt();
				switch(odno){
					case 1:		c.addQty(qty);
								System.out.println(qty+" Candies are added in our desert storage\n");
								break;
					
					case 2:		ck.addQty(qty);
								System.out.println(qty+" Cookies are added in our desert storage\n");
								break;
						
					case 3:		ic.addQty(qty);
								System.out.println(qty+" Icecream are added in our desert storage\n");
								break;		
							
					default:	System.out.println("Wrong Input for desert item\n");
				}
			}
			else if(inp==3){break;}
			else{
				System.out.println("Wrong input for role\n");
			}
		}
	}
}








