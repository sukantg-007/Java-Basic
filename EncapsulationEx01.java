import java.util.Scanner;
class Account
{
	private int accNo;
	private double bal;

	public int getAccNo(){
		return accNo;
	}
	public void setAccNo(int accNo){
		this.accNo=accNo;
	}
	public double getBal(){
		return bal;
	}
	public void setBal(double bal){
		this.bal=bal;	
	}

	public void depositAmt(double amt){
		this.bal=this.bal+amt;
	}
	public void withdrawalAmt(double amt){
		this.bal=this.bal-amt;
	}
}
class Test 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Account account=new Account();
		System.out.print("Enter Acc No: ");
		int acc=sc.nextInt();
		account.setAccNo(acc);
		System.out.print("Enter Amout To Deposit : ");
		double damt=sc.nextDouble();
		account.setBal(damt);
		System.out.println("Your Balance is : "+account.getBal());
		System.out.println("Enter amount to withdra : ");
		double wamt=sc.nextDouble();
		account.withdrawalAmt(wamt);
		System.out.print("Your Balance is : "+account.getBal());
	}
}
