package basic;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
	        System.out.print("Enter an integer: ");
	        int number =sc.nextInt();
	        int count = 0;
	        while (number > 0) {
	            number = number / 10;
	            count++;
	        }
	        System.out.println("The number of digits in the integer is: " + count);
	}

}
