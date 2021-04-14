class A
{
	public double m1(int x, float y){
		return x+y;
	}
	public double m1(float x, int y){
		return x+y;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a=new A();
		System.out.println(a.m1(10,10));
	}
}

