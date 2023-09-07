package basic;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int number;
			System.out.print("Enter a Number: ");
			Scanner sc = new Scanner(System.in);
			number=sc.nextInt();					
			if(number%2 ==0)
			{
			System.out.print("The given Number is even: "+number);
			}
			else 
				System.out.print("The given is number is odd: ");
		

	}

}
