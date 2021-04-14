//case 2- when equal level clases are there in argument then compiler gets confuse called ambiguity situation
class Test 
{
	public void m1(String s){
		System.out.println("String version");
	}

	public void m1(StringBuffer s){
		System.out.println("StringBuffer version");
	}

	public static void main(String[] args) 
	{
		Test t= new Test();
		t.m1("Java");
		t.m1(new StringBuffer("Java"));
		t.m1(null);
	}
}

/*
MethodOverloadingEx04.java:17: error: reference to m1 is ambiguous
                t.m1(null);
                 ^
  both method m1(String) in Test and method m1(StringBuffer) in Test match
1 error
*/