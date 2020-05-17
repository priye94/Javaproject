package pkg2;

public class static2 extends static1
{
	public void m1(int a, int b)
	{
		int c=a*b;
		System.out.println("Value of C is = "+c+" (Child Method m1 - Overloading)");
	}
	
	public static void main(String[] args) {
		
		static2 s1=new static2();
		s1.m1(5, 5); 
		
	}

}

