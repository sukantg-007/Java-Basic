//static method overriding (method hiding)-responsibility is compiler depeding on reference type
class A
{
	public static void m1()
	{
		System.out.println("static method m1-Parent");
	}
}

class B extends A
{
	public static void m1()
	{
		System.out.println("static method m1-Child");
	}
}

class Test
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
	
		B b = new B();
		b.m1();
		
		A a1 = new B();
		a1.m1();
	}
}

/*
static method m1-Parent
static method m1-Child
static method m1-Parent
*/
		
