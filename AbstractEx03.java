abstract class Fruit
{
	public abstract String getTest();
}

class Mango extends Fruit
{
	public String getTest(){
		return "Sweet";
	}
}
class Grapes extends Fruit
{
	public String getTest(){
		return "Bitter";
	}
}
class Chilly extends Fruit
{
	public String getTest(){
		return "Spice";
	}
}
/*
class SubFruit extends Fruit
{
	AbstractEx03.java:24: error: SubFruit is not abstract and does not override abstract method getTest() in Fruit
class SubFruit extends Fruit
^
1 error
}
*/
class Test
{
	public static void main(String[] args){
		Mango m=new Mango();
		Grapes g= new Grapes();
		Chilly c=new Chilly();
		System.out.println("Manago is : "+m.getTest());
		System.out.println("Grapes is : "+g.getTest());
		System.out.println("Chilly is : "+c.getTest());
	}
}
/*output 
D:\Java\Edit-Plus\Access-Modifiere>java Test
Manago is : Sweet
Grapes is : Bitter
Chilly is : Spice
*/