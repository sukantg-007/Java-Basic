class A
{
	int a;
	double d;
	String s;
	static{
		System.out.println("Step 1. A class bytecode loading");
	}

	A(double d, String s)
	{
		this.d=d;
		this.s=s;
		System.out.println("Step 2. Objet created and Instance Variabled Initialized");
	}
	
	A()
	{		
		System.out.println("Step 2. Objet created and Instance Variabled Initialized");
	}
	public String toString(){
		String s1;
		s1=	"Value of a: "+a+
			"\nValue of d: "+d+
			"\nValue of s: "+s;
		return s1;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a1=new A(12.25,"AAA");
		System.out.println(a1);
	}
}
