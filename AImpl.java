import pack1.A;
import pack1.B;

class C extends A 
{
	public static void main(String[] args){
		C c=new C();
		//c.m1();//m1 is default in a so not accessible
		c.m2();
		//c.m3();//m1 is private in a so not accessible
		c.m4();
	}
}

class D extends B 
{
	public static void main(String[] args){		
	}
}