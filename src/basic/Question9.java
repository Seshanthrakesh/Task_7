package basic;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();
	        if (age >= 60) {
	            System.out.println("The person is a senior citizen.");
	        } else {
	            System.out.println("The person is  not a senior citizen.");
	        }
		
		
	}

}
