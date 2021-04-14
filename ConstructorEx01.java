class A
{
	int a;
	A(int a){
		this.a=a;
		System.out.println("Parameterised Constructor");
	}

	A(){
		System.out.println("Non-Parameterised Constructor");
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		A a1=new A(10);
		A a2=new A();
	}
}
