package basic;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,temp;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter First Number: ");
		num1=sc.nextInt();
		System.out.print("Enter second Number: ");
		num2=sc.nextInt();
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("After Swapping two Numbers: ");
		System.out.println("First Number is : "+num1);
		System.out.println("Second Number is: "+num2);                   
	}

}
