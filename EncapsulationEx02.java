import java.util.Scanner;

class MyNumber
{
	private int data;

	public void setData(int data){
		this.data=data;
	}

	public boolean isNegative(){
		return data<0;
	}
	public boolean isPositive(){
		return data>0;
	}
	public boolean isZero(){
		return data==0;
	}
	public boolean isOdd(){
		return data%2!=0;
	}
	public boolean isEven(){
		return data%2==0;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		MyNumber myn=new MyNumber();
		myn.setData(n);
		System.out.println("Number is Zero		: "+myn.isZero());
		System.out.println("Number is Positive	: "+myn.isPositive());
		System.out.println("Number is Negative	: "+myn.isNegative());
		System.out.println("Number is Odd		: "+myn.isOdd());
		System.out.println("Number is Even		: "+myn.isEven());
	}
}
