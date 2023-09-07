package basic;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
		System.out.print("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		 number=sc.nextInt();
		boolean isPrime = true;
		if(number<=1)
		{
			isPrime=false;	
		}
		else{
		
	for(int i=2;i<=Math.sqrt(number);i++)
	{
		if(number%i==0)
		isPrime=false;	
	}
		
		}
			if(isPrime) {
				System.out.print(number+" :is a prime number");	
				
			}
			else {
				System.out.print(number+" :is a non-prime number");
			}
		
		
		
		
	}

}
