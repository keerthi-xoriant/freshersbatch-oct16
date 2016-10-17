public class Account{
	private long accno;
	private String name;
	private double bal;

	public Account(long an,String name,double bal){
		this.accno=an;
		this.name=name;
		this.bal=bal;
	}
	
	public void deposit(double amt){
		this.bal+=amt;
	}
	
	public void withdrawl(double amt){
		this.bal-=amt;
	}
	
	public void print(){
		System.out.println("Your Account details are:");
		System.out.println("Account Number:"+this.accno);
		System.out.println("Account Name:"+this.name);
		System.out.println("Account Balance:"+this.bal);
	}
	
	public static void main(String args[]){
		Account a1=new Account(123,"AM",50000);
		a1.print();
		a1.deposit(7000);
		a1.print();
		a1.withdrawl(200);
		a1.print();
	}
}