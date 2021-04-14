class MathsImpl extends Maths
{
	public double sqrtt(double d)
	{
		double s;
		s=Math.sqrt(d);
		return s;		
	}
	public double poww(double x, double y){
		double s;
		s=Math.pow(x,y);
		return s;
	}
	public int randomm(){
		int s;
		s=(int)(Math.random()*100);
		return s;
	}
}

class Test
{
	public static void main(String[] args){
		MathsImpl math=new MathsImpl();
		System.out.println("square root of 9 : "+math.sqrtt(9));
		System.out.println("square of 9 : "+math.poww(9,2));
		System.out.println("Random Number is : "+math.randomm());
	}
}