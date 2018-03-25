package conceptDemos;

import java.util.Scanner;

public class conceptImplementationEvenOROdd {

	public static void main(String[] args) {

		System.out.println("Enter number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println((n%2==0)?"Even number":"Odd number");
		sc.close();
	}

}
