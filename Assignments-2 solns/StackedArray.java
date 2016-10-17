public class StackedArray{
	private int top;
	private int size;
	private int len;
	private int ary[]; 
	
	public StackedArray(int n){
		this.top=-1;
		this.size=n;
		this.ary=new int[n];
		this.len=0;
	}
	
	public  void push(int a){
		if(this.len!=this.size){
			this.top++;
			this.ary[this.top]=a;
			this.len++;
			System.out.println("This is pushed: "+ary[this.top]);
		}
		else{
			System.out.println("Stack is full");
		}
	}
	
	public void pop(){
		if(this.len!=0){
			this.len--;
			System.out.println("This is popped: "+ary[this.top--]);
		}
		else{
			System.out.println("Stack is Empty");
		}
	}
	
	public static void main(String args[]){
		StackedArray a1=new StackedArray(4);
		a1.pop();
		a1.push(10);
		a1.push(20);
		a1.push(30);
		a1.push(40);
		a1.push(50);
		a1.pop();
		a1.pop();
		a1.pop();
		a1.pop();
		a1.pop();
		
	}
} 