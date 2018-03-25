package conceptDemos;

import java.util.Scanner;

public class readingDataFromUserUsingScannerDemo {

	public static void main(String[] args) {
		
		System.out.println("Enter Student Name :");
		Scanner sc= new Scanner(System.in);
		String n= sc.nextLine();
		
		System.out.println("\nEnter /student's Roll Number");
		int a =sc.nextInt();
		
		System.out.println("Student Name entered is : "+n);
		System.out.println("Student's roll number is : "+a);
		sc.close();
		

	}

}
