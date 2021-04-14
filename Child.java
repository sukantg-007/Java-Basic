class B extends A 
{
	public void m1()
	{
		System.out.println("method-m1-B");
	}
	
	public void m3()
	{
		System.out.println("method-m3-B");
	}

	public static void main(String[] args) 
	{
		System.out.println("Child reference and child object");
		B b=new B();
		b.m1();
		b.m2();
		b.m3();
		System.out.println("Parent reference and child object");
		A a=new B();
		a.m1();
		a.m2();
		//a.m3();
	}
}
