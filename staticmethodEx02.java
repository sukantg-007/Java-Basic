//static method 
class A
{
	public static void m1()
	{
		System.out.println("static method -m1");
	}
	
	public void m2()
	{
		System.out.println("non-static method -m2");
	}
}

class Test
{
	public static void main(String[] args)
	{
		A a= new A();
		A.m1();//a.m1()
		a.m2();
	}
}
