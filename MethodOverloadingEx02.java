class Addition
{
	/*
	public int add(int x, int y){
		return x+y;
	}
	*/
	
	public double add(double x, double y){
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
		Addition addition = new Addition();
		System.out.println("Addition of 10+20 : "+addition.add(10,20));
		System.out.println("Addition of 10.25+20.55 : "+addition.add(10.25f,20.55f));
		System.out.println("Addition of Java + Programming : "+addition.add("Java"," Programming"));
		System.out.println("Addition of Java + Programming : "+(char)addition.add('a','b'));
	}
}
