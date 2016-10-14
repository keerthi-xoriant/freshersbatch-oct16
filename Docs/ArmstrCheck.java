public class ArmstrCheck {
	public static void main(String args[]){
	int i,n,n1,n2,n3;
	for(n=100;n<1000;n++)
	{
	n1=(n/100)%10;
	n2=(n/10)%10;
	n3=n%10;
	if(n1*n1*n1+n2*n2*n2+n3*n3*n3==n)
	System.out.println(n);
	}
	}
}