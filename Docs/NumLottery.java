import java.util.Scanner;
import java.util.Random;
public class NumLottery {
	public static void main(String args[]){
	Scanner userip=new Scanner(System.in);
	int[] n=new int[6];
	int[] n1=new int[6];
	int i,j;
	System.out.println("Enter numbers:");
	for(i=0;i<6;i++)
	{
	n[i]=userip.nextInt();
	}
	for(i=0;i<6;i++)
	{
	n1[i]=(int) (Math.random()*100);
	System.out.println(n1[i]);
	}
	System.out.println("");
	for(i=0;i<5;i++)
	{
		for(j=i+1;j<6;j++)
		{
			if(n[i]==n1[j])
			{
			System.out.println(n[i]);
			}
		}
	}
	
	}
}