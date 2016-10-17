public class ComplexNum{
	private int real;
	private int imag;
	
	public ComplexNum(ComplexNum c1){
		this.real=c1.real;
		this.imag=c1.imag;
	}
	
	public ComplexNum(int real,int imag){
		this.real=real;
		this.imag=imag;
	}
	public ComplexNum add(ComplexNum c1){
		this.real+=c1.real;
		this.imag+=c1.imag;
		return this;
	}
	
	public ComplexNum sub(ComplexNum c1){
		this.real-=c1.real;
		this.imag-=c1.imag;
		return this;
	}
	
	public ComplexNum mul(ComplexNum c1){
		this.real*=c1.real;
		this.imag*=c1.imag;
		return this;
	}
	
	public void printCom(){
		System.out.println("The Complex Number is :"+this.real+"+"+this.imag);
	}
	
	public static void swap(ComplexNum c[]){
		ComplexNum temp=c[0];
		c[0]=c[1];
		c[1]=temp;
	}
	
	public static void main(String args[]){
		ComplexNum c1=new ComplexNum(3,5);
		ComplexNum c2=new ComplexNum(7,9);
		ComplexNum c[]=new ComplexNum[2];
		c[0]=new ComplexNum(c1);
		c[1]=new ComplexNum(c2);
		c1.printCom();
		c2.printCom();
		c1.add(c2);
		c1.printCom();
		c1.sub(c2);
		c1.printCom();
		c1.mul(c2);
		c1.printCom();
		c2.printCom();
		swap(c);
		c[0].printCom();
		c[1].printCom();
	}
}