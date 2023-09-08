package basic;

import java.util.Scanner;

public class Question6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num =5, i=1,fact;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number: ");
			fact= sc.nextInt();
			num=fact;
			while(i<num)
			{
				fact*=i;
				i++;
			}		
			System.out.println("Factorial of  the Number is:" +fact );
			
			

	}

}
