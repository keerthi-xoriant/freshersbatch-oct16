import java.util.Scanner;
public class NumberArm {
	public static void main(String args[]){
	Scanner userip=new Scanner(System.in);
	int i,n,n1,n2,n3;
	System.out.println("Enter a number:");
	n=userip.nextInt();
	n1=(n/100)%10;
	n2=(n/10)%10;
	n3=n%10;
	if(n1*n1*n1+n2*n2*n2+n3*n3*n3==n)
	System.out.println(n+" is an Armstrong Number");
	else
	System.out.println(n+" is not an Armstrong Number");
	}
}