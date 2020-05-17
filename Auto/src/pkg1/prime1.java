package pkg1;

import java.util.Scanner;

public class prime1 {

	public static void main(String[] args) {
		
	int x, y, z=0;
	
	Scanner s=new Scanner(System.in);
	System.out.println("Enter any number to check prime");
	int a=s.nextInt();
	
	y=a/2;
	
	if (a==0||a==1) {
		
		System.out.println(a+" : "+"is not a prime number");
	}
	else {
		for(x=2;x<=y;x++) {
			if(a%x==0) {
			System.out.println(a+" : "+"is not a prime number");
			z=1;
			break;
			}
		}
		if(z==0) {
		System.out.println(a+" : "+"is a prime number");
		
		}
	}
	
	}

}
