package pkg1;

import java.util.Scanner;

public class swap2 {

	public static void main(String[] args) {
        int x, y;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Value of X and Y");
		x=s.nextInt();
		y=s.nextInt();
		
		System.out.println("Before Swapping number is: "+x+" "+y);
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("After Swapping number is: "+x+" "+y);

	}

}
