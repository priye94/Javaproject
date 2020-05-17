package pkg2;

import java.util.Scanner;

public class Even1 {

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enetr the no to check Even");
		n=s.nextInt();
		
		if (n%2==0) {
			System.out.println("Even number");
		}
		else {
			System.out.println("Not even");
		}

	}

}
