import java.util.Scanner;
public class LoginVal {
	public static void main(String args[]){
	Scanner userip=new Scanner(System.in);
	int i,n;
	n=0;
	String uname,psswd;
	String passwd="keerthikumar1234";
	System.out.println("Enter your username:");
	uname=userip.next();
	
	while(n!=3)
	{
		System.out.println("Enter your password:");
			psswd=userip.next();
		if(psswd.equals(passwd))
		{
			System.out.println("Welcome");
			continue;
		}
		else
			n++;
	}
	if(n==3)
	System.out.println("Contact admin");
	}
}