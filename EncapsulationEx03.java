import java.util.Scanner;

class MyMath
{
	private int data;

	public void setData(int data){
		this.data=data;
	}
	public long myRandom(){
		return Math.round(Math.random()*data);
	}
	public double mySqrt(){
		return Math.sqrt(data);
	}
	public double myPow(double exp){
		return Math.pow(data,exp);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		MyMath mm=new MyMath();
		mm.setData(n);
		System.out.println("Random Number : "+mm.myRandom());
		System.out.println("Sqrroot Number : "+mm.mySqrt());
		System.out.println("Square Number : "+mm.myPow(2));
	}
}
