package pkg2;

public class Test {
		
	public static void method1()
	{
		System.out.println("Value of c");
	}

	public void method2()
	{
		method1();
		
		Test.method1();
		
		Test obj2=new Test();
		obj2.method1();
		
		System.out.println("Non static method");
	}
	
	
	public static void main(String[] args) {
        	
		Test obj1=new Test();
		obj1.method2();
		
	}

}
