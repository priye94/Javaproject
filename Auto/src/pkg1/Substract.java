package pkg1;

public class Substract implements inter1{

	public void Calc(int a, int b) //Giving body to abstract method
	{
		int c=a-b;
		System.out.println("Value of substraction is = "+c);
	}
	
	public static void main(String[] args) {
		Substract obj1=new Substract();
		obj1.Calc(8, 4);

	}

}
