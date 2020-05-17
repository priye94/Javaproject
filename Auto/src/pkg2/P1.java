package pkg2;

public class P1 {

	public void method()
	{
		System.out.println("Parent Default Method");
	}

	public void method1(int a)
	{
		System.out.println("Parent 1 Parameterized Method");
	}
	
	public void method2(int a, int b)
	{
		System.out.println("Parent 2 Parameterized Method");
	}
	
	public void method3(int a, int b, int c)
	{
		this.method4(1,2,3,4);
		this.method();
		this.method2(1,2);
		this.method1(1);
		System.out.println("Parent 3 Parameterized Method");
	}
	
	public void method4(int a, int b, int c, int d)
	{
		System.out.println("Parent 4 Parameterized Method");
	}
	
	public static void main(String[] args) {
		

	}

}
