package first;
import java.util.Scanner;
public class stack
{

	public static void main(String args[])
	{
		int ch;
		stack s=new stack();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of stack:");
		s.size=sc.nextInt();
		do
		{
			System.out.println("1.Push\n2.Pop\n3.Exit\nChoice:");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:System.out.println("Enter element:");
					int val=sc.nextInt();
					s.push(val);
					s.disp();
					break;
			case 2:System.out.println("Deleted element:"+s.pop());
					s.disp();
			}
		}while(ch!=3);
		
	}
	int top,size,stack[]=new int[30];
	stack()
	{
		top=-1;
	}
	void push(int val)
	{
		if(top==size-1)
			{
				System.out.println("Stack overflow!");
				return;
			}
		stack[++top]=val;
	}
	int pop()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow!");
			return -1;
		}
		return stack[top--];
	}
	void disp()
	{
		if(top==-1)
			System.out.println("Stack underflow!");
		else
		{
			for(int i=0;i<=top;i++)
			System.out.print(" "+stack[i]);
		}
		System.out.println();
	}
}
