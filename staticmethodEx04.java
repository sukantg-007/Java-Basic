//method verriding related with static keyword
class A
{
	public  void m1()//overridden
	{
		System.out.println("static method m1");
	}
	
}

class B extends A
{
	public static void m1()//overriding
	{
		System.out.println("non-static method m1");
	}
}

/*
staticmethodEx03.java:13: error: m1() in B cannot override m1() in A
	 overriding method is static

	            ^
   overriding method is static

1 error
*/
