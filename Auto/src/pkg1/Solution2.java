package pkg1;

// solve expression ((((10/2)-2)+2)*2)

public class Solution2 {

	public int div (int a, int b)
	{
		int c=a/b;
		System.out.println("Result of division is = "+c);
		return c;
		
	}
	
	public int sub (int d, int e)
	{
		int f=d-e;
		System.out.println("Result of substraction is = "+f);
		return f;
		
	}
	
	public int sum (int g, int h)
	{
		int i=g+h;
		System.out.println("Result of sum is = "+i);
		return i;
	}
	
	public void multi (int j, int k)
	{
		int l=j*k;
		System.out.println("Result of multiplication is = "+l);
		System.out.println("The final result of the expression ((((10/2)-2)+2)*2) = "+l);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution2 a1 = new Solution2 ();
		int div1=a1.div(10, 2);
		int sub1=a1.sub(div1, 2);
		int sum1=a1.sum(sub1, 2);
		a1.multi(sum1, 2);
		

	}

}
