package pkg1;

import java.util.Scanner;

//Solve expression ((((((x1+X2)-X3)+X4)*X5)/X6)
public class scan1 {

	public int sum1 (int a, int b)
	{
		int c=a+b;
		System.out.println("Result of sum is = "+c);
		return c;
	}
	
	public int sub1 (int c, int d)
	{
		int e=c-d;
		System.out.println("Result of sub is = "+e);
		return e;
	}
	
	public int multi1 (int f, int g)
	{
		int h=f*g;
		System.out.println("Result of Multi is = "+h);
		return h;
	}
	
	public void div1 (int i, int j)
	{
		int k=i/j;
		System.out.println("Result of div is = "+k);
		System.out.println("The final result is = "+k);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		scan1 obj1=new scan1();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of X1");
		int X1=s.nextInt();
		System.out.println("Enter the value of X2");
		int X2=s.nextInt();
		System.out.println("Enter the value of X3");
		int X3=s.nextInt();
		System.out.println("Enter the value of X4");
		int X4=s.nextInt();
		System.out.println("Enter the value of X5");
		int X5=s.nextInt();
		System.out.println("Enter the value of X6");
		int X6=s.nextInt();
		int sum=obj1.sum1(X1, X2);
		int sub=obj1.sub1(sum, X3);
		int sum1=obj1.sum1(sub, X4);
		int multi=obj1.multi1(sum1, X5);
		obj1.div1(multi, X6);
	}

}
