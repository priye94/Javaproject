package pkg3;

public class Star5 {

	public static void main(String[] args) {
		
		int n=4, m=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<=(1-i);j++)
			{
				System.out.print(" ");
			}

				for(int k=1;k<=i;k++)
				{
					System.out.print(m);
					m=m+1;
				}
				
			System.out.println();
		}

	}

}
