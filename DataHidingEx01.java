class DataHiding
{
	private int a;
}
class Test 
{
	public static void main(String[] args) 
	{
		DataHiding dh=new DataHiding();
		dh.a=100;//a has private access in DataHiding
	}
}
