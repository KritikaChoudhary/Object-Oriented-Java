package first;
import java.util.Scanner;
public class first
		{
		    Scanner sc=new Scanner(System.in);
		    int fibRec(int n)
		    {
		        if(n==0)
		           {
		               System.exit(0);;
		            }
		        if(n==1)
		                return 0;
		        else if(n==2)
		                return 1;
		        else
		             return fibRec(n-1)+fibRec(n-2);   
		    }
		    void fib()
		    {
		        System.out.print("How many :");
		        int n=sc.nextInt();
		        int first=0; 
		        int second=1;
		        if(n==0)
		        System.out.println("Sorry wrong input");
		        else if(n==1)
		        System.out.println(first);
		        else if(n==2)
		        System.out.println(first+" "+second);
		        else
		        {
		        	System.out.print(first+" "+second);
		            for(int i=1;i<=n-2;i++)
		            {
		            	int third=first+second;
		            System.out.print(" "+third);  
		            first=second;
		            second=third;
		            
		            }
		            System.out.println();
		        }
		    }
		    void prime()
		    {
		        System.out.println("Enter no:");
		        int k=0,n=sc.nextInt();
		        for(int i=2;i<n;i++)
		        {
		            if(n%i==0)
		            {
		                k=1;
		                break;
		            }
		        }
		        if(k==1)
		        	System.out.println("Not prime");
		        else
		        	System.out.println("Prime");
		    }
		    void bubbleSort()
		    {
		        int[] a=new int[20];
		        System.out.print("Enter the size of the array:");
		        int size=sc.nextInt();
		        System.out.println();
		        System.out.print("Enter the array elements:");
		        for(int i=0;i<size;i++)
		        a[i]=sc.nextInt();
		        for(int i=0;i<size;i++)
		        {
		            for(int j=i+1;j<size;j++)
		            {
		                if(a[j]<a[i])
		                {
		                    int temp=a[i];
		                    a[i]=a[j];
		                    a[j]=temp;
		                }
		            }
		            System.out.print(a[i]+" ");
		        }
		        System.out.println();
		    }
		    public static void main(String args[])
		    {
		    	Scanner sc=new Scanner(System.in);
		        first f=new first();
		        int ch;
		        do
		        {
		            System.out.print("Fibonacci\n11.Recursion\n12.Without\n2.Prime no\n3.Bubble sort\n4.Exit\nEnter your choice:");
		            ch=sc.nextInt();
		            System.out.println();
		            switch(ch)
		            {
		                case 11:System.out.print("How many no.:");
		                        int n=sc.nextInt();
		                        System.out.println();
		                        for(int i=1;i<=n;i++)
		                         System.out.print(f.fibRec(i)+" ");
		                        System.out.println();
		                        break;
		                case 12:f.fib();
		                        break;
		                case 2:f.prime();
		                        break;
		                case 3:f.bubbleSort();
		            }
		        }while(ch!=4);
		    }
		}
		// TODO Auto-generated method stub

	


