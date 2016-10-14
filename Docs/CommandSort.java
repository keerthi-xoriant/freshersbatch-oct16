public class CommandSort {
	public static void main(String args[]){
	int[] num = new int[20];
	int n,j,k,temp;
	int i=0;
	n=args.length;
	for(i=0;i<args.length;i++)
		{
			num[i]=Integer.parseInt(args[i]);
		}
	for(i=0;i<n-1;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(num[i]>num[j])
			{
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
	for(i=0;i<n;i++)
	{
		System.out.println(num[i]);
	}
	
	}
}