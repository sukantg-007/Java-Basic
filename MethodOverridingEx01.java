class Parent
{	
	public void m1(){
		System.out.println("Parent-m1");
	}	
}

class Child extends Parent
{
	public void m1(){
		System.out.println("Child-m1");
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		
		Parent p1=new Parent();//ref:parent and RObject: parent
		p1.m1();
		

		Child ch1=new Child();//ref:Child and RObject: Child
		ch1.m1();

		Parent p2=new Child();//ref:Parent and RObject: Child
		p2.m1();
	}
}
