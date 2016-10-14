import java.util.Scanner;
public class NumberTable {
	public static void main(String args[]){
	Scanner userip=new Scanner(System.in);
	int i,n;
	System.out.println("Enter a number:");
	n=userip.nextInt();
	for(i=1;i<=10;i++)
	{
	System.out.println(n*i);
	}
	}
}