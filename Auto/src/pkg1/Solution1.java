package pkg1;

// solve expression ((((10+2)-2)+2)*2)/2)

public class Solution1 {

	public int sum (int a, int b)
	{
		int c=a+b;
		System.out.println("Result of addition is = "+c);
		return c;
		
	}
	
	public int sub (int d, int e)
	{
		int f=d-e;
		System.out.println("Result of substraction is = "+f);
		return f;
		
	}
	
	public int multi (int g, int h)
	{
		int i=g*h;
		System.out.println("Result of multiplication is = "+i);
		return i;
	}
	
	public void div (int j, int k)
	{
		int l=j/k;
		System.out.println("Result of division is = "+l);
		System.out.println("The final result of the expression ((((10/2)-2)+2)*2) = "+l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution1 a1 = new Solution1 ();
		int sum1=a1.sum(10, 2);
		int sub1=a1.sub(sum1, 2);
		int sum2=a1.sum(sub1, 2);
		int multi1=a1.multi(sum2, 2);
		a1.div(multi1, 2);
	
	}

}
