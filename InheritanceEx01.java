class A
{
	public void m1()
	{
		System.out.println("A-m1-method");
	}
}
class B
{
	public void m1()
	{
		System.out.println("B-m1-method");
	}
}
class Test extends A,B
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}

/*
InheritanceEx01.java:15: error: '{' expected
class Test extends A,B
                    ^
1 error
*/