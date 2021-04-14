import java.util.Scanner;

class Student
{
	private int roll;
	private String sname;
	private float per;

	public void setRoll(int roll){
		this.roll=roll;
	}
	public void setName(String sname){
		this.sname=sname;
	}
	public void setPercent(float per){
		this.per=per;
	}
	public int getRoll(){
		return roll;
	}
	public String getName(){
		return sname;
	}
	public float getPercent(){
		return per;
	}
	public void showStudentDetails(){
		System.out.println("Student Detials");
		System.out.println("Student Name : "+sname);
		System.out.println("Student Roll : "+roll);
		System.out.println("Student Per  : "+per);
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		String sname=sc.nextLine();
		System.out.print("Enter Student Roll : ");
		int sroll=sc.nextInt();
		System.out.print("Enter Student Percent : ");
		float sper=sc.nextFloat();

		Student student=new Student();
		student.setName(sname);
		student.setRoll(sroll);
		student.setPercent(sper);
		student.showStudentDetails();

		System.out.println("Student Information");
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Roll : "+student.getRoll());
		System.out.println("Student Perce: "+student.getPercent());
	}
}
/*output
D:\Java\Edit-Plus\OOPs>javac EncapsulationEx04.java

D:\Java\Edit-Plus\OOPs>java Test
Enter Student Name : AAA
Enter Student Roll : 100
Enter Student Percent : 55.45
Student Detials
Student Name : AAA
Student Roll : 100
Student Per  : 55.45
Student Information
Student Name : AAA
Student Roll : 100
Student Perce: 55.45

*/