package conceptDemos;

import java.util.Scanner;

public class conceptImplementationPositiveORNegativeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		System.out.println((n>=0)? "Positive":"Negative");
		sc.close();
		
		
	}

}
