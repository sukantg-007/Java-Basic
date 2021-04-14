class Animal
{
}

class Monkey extends Animal
{
}

class Test 
{
	public void m1(Animal a){

		System.out.println("Animal-Version");

	}

	public void m1(Monkey m){

		System.out.println("Monkey-Version");

	}

	public static void main(String[] args) 

	{
		Test t=new Test();
		Animal a1=new Animal();
		t.m1(a1);

		Monkey m1=new Monkey();
		t.m1(m1);

		
l a2=new Monkey();//in overloading method resolution depends upon compiler and it check reference type
		t.m1(a2);

	}
}
