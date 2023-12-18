package javaTraining;

import java.util.Scanner;

public class UsingScanner {
	
	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
	
    System.out.println("Enter the Name:");
	
    String name = scan.nextLine();
    
    System.out.println("Enter the Age:");
    
    int age = scan.nextInt();
    
    System.out.println("Name is " + name);
    System.out.println("Age is " + age);
	
	}

}
