package first;
import java.util.Scanner;
public class account {
	Scanner sc=new Scanner(System.in);
	int accno;
	String name;
	int phno;
	float bal_amt;
	void getinput()
	{
		System.out.print("Enter account no:");
		accno=sc.nextInt();
		System.out.print("\nEnter name:");
		name=sc.next();
		System.out.print("\nEnter phone no:");
		phno=sc.nextInt();
		System.out.print("\nEnter balance amount:");
		bal_amt=sc.nextFloat();
		System.out.print("\nWant to deposit?(press 1):");
		int ch=sc.nextInt();
		if(ch==1)
		{
			
			Deposit();
		}
		
		System.out.print("\nWant to withdraw?(press 1):");
		int ch1=sc.nextInt();
		if(ch1==1)
		{
		Withdraw();
		}
	}
	void Deposit()
	{
		System.out.println("Balance amount="+bal_amt);
		System.out.print("\nEnter the amount to be deposited:");
		float amt=sc.nextFloat();
		bal_amt+=amt;
		System.out.println("Balance amount="+bal_amt);
	}
	void Withdraw()
	{
		System.out.println("Balance amount="+bal_amt);
		System.out.print("\nEnter the amount to be withdrawn:");
		float amt=sc.nextFloat();
		bal_amt-=amt;
		System.out.println("Balance amount="+bal_amt);
	}
	void Disp()
	{		
		System.out.println("Account no:"+accno);
		System.out.println("Name:"+name);
		System.out.println("Phone no:"+phno);
		System.out.println("Balance amount="+bal_amt);
	}

	public static void main(String[] args) 
	{

			account a=new account();
			System.out.println("***Enter account details***");
			a.getinput();
			System.out.println("***Account details***");
			a.Disp();
			// TODO Auto-generated method stub

	}

}
