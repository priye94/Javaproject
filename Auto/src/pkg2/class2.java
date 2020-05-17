package pkg2;

import java.util.Scanner;

public class class2 {
	
	public void multi(float a, float b)
	{
		float c=a*b;
		System.out.println("Value of Multiply = "+c);
	}
	
	public static void main(String[] args) {
		
		class2 obj1=new class2();
		Scanner obj3=new Scanner(System.in); //has a relationship
		System.out.println("Enter Value of X1");
		int X1=obj3.nextInt();
		System.out.println("Value of X1 = "+X1);
		System.out.println("*************************");
		System.out.println("Enter value of X2");
		float X2=obj3.nextFloat();
		System.out.println("Value of X2 = "+X2);
		System.out.println("*************************");
		obj1.multi(X1, X2);
		

	}

}
