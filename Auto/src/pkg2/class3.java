package pkg2;

public class class3 {
	
	int a, b, c, d;
	
	public class3 ()
	{
		System.out.println("i am default constractor");
	}

	public class3 (int a)
	{
		this ();
		System.out.println("i am One parameterized constractor");
	}
	
	public class3 (int a1, int b1, int c1, int d1)
	{
		this (2);
		System.out.println("i am four parameterized constractor");
		
	}
	
	
	public static void main(String[] args) {
		
		class3 aastha=new class3(1, 2, 3, 4);
		
		
	}

}
