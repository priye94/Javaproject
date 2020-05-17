package pkg1;

public class This1 {

	public void method ()
	{
		System.out.println("default method");
	}
	
	public void method1 (int a)
	{
		System.out.println("One Parameterized method");
	}
	
	public void method2 (int c, int d)
	{
		this.method3(2, 3, 4);
		this.method();
		this.method1(1);
		this.method4(1, 2, 3, 4);
		System.out.println("Two Parameterized method");
	}
	
	public void method3 (int c, int d, int e)
	{
		System.out.println("Three Parameterized method");
	}
	
	public void method4 (int c, int d, int e, int f)
	{
		System.out.println("Four Parameterized method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		This1 obj1=new This1();
		obj1.method2(4, 5);
	}

}
