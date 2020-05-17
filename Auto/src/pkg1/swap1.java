package pkg1;

import java.util.Scanner;

public class swap1 {

	public static void main(String[] args) {
		int x, y, z;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Value of X and Y");
		x=s.nextInt();
		y=s.nextInt();
		
		System.out.println("Before Swapping number is: "+x+" "+y);
		z=x;
		x=y;
		y=z;
		
		System.out.println("After Swapping number is: "+x+" "+y);
		
	}

}
