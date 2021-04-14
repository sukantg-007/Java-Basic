class Test 
{
	public void m1(int x, double y){
		System.out.println("int-double-version");
	}

	public void m1(double x, int y){
		System.out.println("double-int-version");
	}

	public static void main(String[] args) 
	{
		Test t= new Test();
		t.m1(10,10.25);
		t.m1(10.25,10);
		t.m1(10,10);
	}
}

/*
MethodOverloadingEx05.java:16: error: reference to m1 is ambiguous
                t.m1(10,10);
                 ^
  both method m1(int,double) in Test and method m1(double,int) in Test match
1 error
*/
