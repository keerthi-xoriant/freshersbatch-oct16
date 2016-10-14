import java.util.Scanner;
public class StudentResult {
	public static void main(String args[]){
	Scanner user_input=new Scanner(System.in);
	int n,i;
	int sub1,sub2,sub3;

	String sname;
	
	
	System.out.println("Enter The Name of student:");
	sname=user_input.next();
	
	System.out.println("Enter The Marks of 1st Subject:");
	sub1=user_input.nextInt();
	
	System.out.println("Enter The Marks of 2nd Subject:");
	sub2=user_input.nextInt();
	
	System.out.println("Enter The Marks of 3rd Subject:");
	sub3=user_input.nextInt();
	
	if(sub1>60 && sub2>60 && sub3>60)
		System.out.println(sname+" has passed");
	else if(sub1>60 && sub2>60 || sub2>60 && sub3>60 || sub1>60 && sub3>60)
		System.out.println(sname+" is promoted");
	else
		System.out.println(sname+" has failed");
	
	}
}