class A implements Abc 
{
	public void m1(){
		System.out.println("method-m1-A");
	}
	public void m2(){
		System.out.println("method-m2-A");
	}

	public void m3(){
		System.out.println("method-m3-A");
	}
}

class Test
{
	public static void main(String[] args){
		System.out.println("Implemented class reference and Interface method");
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println("interface reference and Interface method");
		Abc abc=new A();
		abc.m1();
		abc.m2();
		abc.m3();
	}
}