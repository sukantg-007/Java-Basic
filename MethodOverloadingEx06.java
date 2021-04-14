//case 4- normal method get more priority that var-arg method
class Test 
{
	public void m1(int...x){
		System.out.println("var-arg method");
	}

	public void m1(int x){
		System.out.println("normal method");
	}

	public static void main(String[] args) 
	{
		Test t=new Test();
		t.m1(10);
	}
}
