interface I1
{
	void m1();
}
interface I2
{
	void m1();
}
class C implements I1,I2
{
	public void m1()
	{
		System.out.println("A-m1-method");
	}
}

class Test
{
	public static void main(String[] args) 
	{
		I1 i1=new C();
		i1.m1();
		I2 i2=new C();
		i2.m1();
		C c=new C();
		c.m1();

	}
}
