public class Employee{
	private int empno;
	private String name;
	private double sal;
		
	public Employee(int empno,String name,double sal){
		this.empno=empno;
		this.name=name;
		this.sal=sal;
	}
		
	public double getSal(){
		return this.sal;
	}

	public static void main(String args[]){
		Employee e1= new Employee(101,"abc",30000);
		System.out.println("The salary of emp e1 is: "+e1.getSal());
		Labour l1=new Labour(121,"qwe",20000,5000);
		System.out.println("The salary of emp l1 is: "+l1.getSal());
		Manager m1=new Manager(141,"nbv",50000,12000);
		System.out.println("The salary of emp m1 is: "+m11.getSal());
	}
	
}
	
class Labour extends Employee{
	private double overtime;
	
	public Labour(int empno,String name,double sal,double overtime){
		super(empno,name,sal);
		this.overtime=overtime;
	}
	
	public double getSal(){
		return super.getSal()+this.overtime;
	}
}

class Manager extends Employee{
	private double incentive;
	
	public Manager(int empno,String name,double sal,double incentive){
		super(empno,name,sal);
		this.incentive=incentive;
	}
	
	public double getSal(){
		return super.getSal()+this.incentive;
	}
}	
	








