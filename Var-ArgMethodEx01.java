//var-arg method---1.5v
/*
class Test 
{
	public int add(int x){
		return x;
	}

	public int add(int x, int y){
		return x+y;
	}

	public int add(int x, int y, int z){
		return x+y+z;
	}
	public static void main(String[] args) 
	{
		Test t= new Test();
		System.out.println(t.add());
		System.out.println(t.add(10));
		System.out.println(t.add(10,20));
		System.out.println(t.add(10,20,30));
	}
}
*/

class Test 
{
	

	
	public static void main(String[] args) 
	{
		Test t= new Test();
		System.out.println(t.add());
		System.out.println(t.add(10));
		System.out.println(t.add(10,20));
		System.out.println(t.add(10,20,30));
		byte b1=100, b2=127;
		System.out.println(t.add(b1,b2));
		System.out.println(t.add('a','b'));
	}
}