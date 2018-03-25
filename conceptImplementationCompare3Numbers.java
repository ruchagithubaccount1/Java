package conceptDemos;

import java.util.Scanner;

public class conceptImplementationCompare3Numbers {

	public static void main(String[] args) {
		
		System.out.println("Enter first number : ");
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		
		System.out.println("\nEnter second number : ");
		int b =sc.nextInt();
		System.out.println("\nEnter third  number : ");
		int c =sc.nextInt();
		// Print biggest of 3 numbers 
		System.out.println ((a>b) ? (a>c?a:c) : (b>c?b:c));	
	
		// Print smallest of 3 numbers 
				System.out.println ((a<b) ? (a<c?a:c) : (b<c?b:c));	
			

	}

}
