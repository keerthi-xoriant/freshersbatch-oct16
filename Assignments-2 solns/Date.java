public class Date{
	private int day;
	private int month;
	private int year;

	public Date(){
		this.day=22;
		this.month=3;
		this.year=2016;
	}
	public Date(int day,int month,int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
	public void setDay(int newday){
		day=newday;
	}
	public void setMonth(int newmonth){
		month=newmonth;
	}
	public void setYear(int newyear){
		year=newyear;
	}
	public void printDate(){
		System.out.println("Date is"+this.day+":"+this.month+":"+this.year);
	}
	public static void swapDate(Date d1,Date d2){
		Date temp=d1;
		d1=d2;
		d2=temp;
	}
	public static void main(String args[]){
		Date d1=new Date();
		Date d2=new Date(14,6,2010);
		d1.printDate();
		d2.printDate();
		d1.setDay(30);
		d1.setMonth(1);
		d1.setYear(2015);
		d1.printDate();
		System.out.println("The day of d2 is "+d2.getDay());
		swapDate(d1,d2);
		d1.printDate();
		d2.printDate();
	}
}
