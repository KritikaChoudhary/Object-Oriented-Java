package Person;
import java.util.Scanner;
public class Personal {
	Scanner sc=new Scanner(System.in);
	String name;
	int age,yoe,loan;
	String education;
	float salary, loanamt,hra,basic,da;
	Personal() {
		// TODO Auto-generated constructor stub
		System.out.println("\nEnter the details");
		System.out.print("Name:");
		name=sc.nextLine();
		System.out.print("\nAge:");
		age=sc.nextInt();
		System.out.print("\nYears of experience:");
		yoe=sc.nextInt();
		System.out.print("\nHighest Educational Qualification:");
		education=sc.next();
		System.out.print("\nHRA, basic and DA per month:");
		hra=sc.nextFloat();
		da=sc.nextFloat();
		basic=sc.nextFloat();
		salary=basic+hra*da;
		System.out.print("\nNo. of Loans:");
		loan=sc.nextInt();
		System.out.print("Want to take loan?(press Y or y)");
		char ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y')
			isEligible(age,loan,salary);
		isEligiblePromotion(yoe,age);	
		Display();
	}
	void isEligible(int age, int loan,float salary)
	{
		if(age<21||loan>2||salary<15000)
			System.out.println("Not eligible for a loan");
		else
		{
			System.out.println("Eligible for a loan");
			System.out.print("\nEnter Loan Amount:");
			loanamt=sc.nextFloat();
		}
	}
	double taxPay(float salary)
	{
		if(salary>30000)
		{
			System.out.println("\nTax is 10% of salary");
			return 0.1*salary;
		}
		else if(salary<30000&&salary>=10000)
		{
			System.out.println("\nTax is 5% of salary");
			return 0.05*salary;
		}
		else
		{
			System.out.println("\nTax paid is 0");
			return 0;
		}
	}
	void isEligiblePromotion(int yoe,int age)
	{
		if(yoe>10||age>30)
			System.out.println("Employee not eligible for promotion");
		else
			System.out.println("Employee eligible for promotion");
	}
	void Display()
	{
		System.out.println("***Employee Details***");
		System.out.print("Name:"+name);
		System.out.print("\nAge:"+age);
		System.out.print("\nYears of experience:"+yoe);
		System.out.print("\nHighest Educational Qualification:"+education);
		System.out.print("\nSalary:"+salary);
		System.out.print("\nNo. of Loans:"+loan);
		System.out.println("Tax:"+taxPay(salary));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no of employees:");
		int n=sc.nextInt();
		Personal employee[]=new Personal[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Employee no "+(i+1));
			employee[i]=new Personal();
		}
	}

}
