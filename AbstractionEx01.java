class Add
{
	/*
	public int add(int x, int y){
		int z;
		z=x+y;
		return z;
	}
	public float add(float x, float y){
		float z;
		z=x+y;
		return z;
	}
	public String add(String x, String y){
		String z;
		z=x+y;
		return z;
	}
	*/

	public int add(int x, int y){		
		 return x+y;		
	}
	public float add(float x, float y){
		return x+y;
	}
	public String add(String x, String y){
		return x+y;
	}
}
class Test
{
	public static void main(String[] args) 
	{
		Add a=new Add();
		System.out.println("Add of 10+20 : "+a.add(10,20));
		System.out.println("Add of 1.2+2.4 : "+a.add(1.2f,2.4f));
		System.out.println("Add of abc+def : "+a.add("abc","def"));
	}
}
