public class BankAcc{
	private int accno;
	private String name;
	private double bal;
	
	public BankAcc(int accno,String name,double bal){
		this.accno=accno;
		this.name=name;
		this.bal=bal;
	}
	
	public double totCash(){
		return this.bal;
	}
	
	public static void main(String args[]){
		BankAcc b1=new BankAcc(121,"abc",24365);
		SavAcc s1=new SavAcc(122,"fhdsgf",52632,43623);
		CurAcc c1=new CurAcc(123,"shf",54637,67543);
		System.out.println("The Total cash in the Account is: "+b1.totCash());
		System.out.println("The Total cash in the Account is: "+s1.totCash());
		System.out.println("The Total cash in the Account is: "+c1.totCash());
	}
}

class SavAcc extends BankAcc{
	private double fd;
	
	public SavAcc(int accno,String name,double bal,double fd){
		super(accno,name,bal);
		this.fd=fd;
	}
	
	public double totCash(){
		return super.totCash()+this.fd;
	}
}

class CurAcc extends BankAcc{
	private double cc;
	
	public CurAcc(int accno,String name,double bal,double cc){
		super(accno,name,bal);
		this.cc=cc;
	}
	
	public double totCash(){
		return super.totCash()+this.cc;
	}
}