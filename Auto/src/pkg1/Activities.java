package pkg1;

import java.util.Scanner;

public class Activities {

	int a, b;
	
	public Activities()
	{
		this.method1(1);
		System.out.println("default constuctor");
	}
	
	public Activities(int b)
	{
		this();
		System.out.println("One perametric constuctor");
	}
	
	public void method1(int a)
	{
		System.out.println("Value of a is = "+a);
		this.method2(2);
	}
	
	public void method2(int b)
	{
		System.out.println("Value of b is = "+b);
	}
	
	
	public int sum (int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public int sub (int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Activities obj1=new Activities(1);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Value of a");
		obj1.a=s.nextInt();
		

		
	}

}
