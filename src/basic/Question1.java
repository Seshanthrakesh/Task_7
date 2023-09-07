package basic;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,c,d,b,e,f;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value:  ");
		a=sc.nextInt();
		System.out.println("Enter the b value:  ");
		b=sc.nextInt();
		System.out.println("Enter the c value:  ");
		c=sc.nextInt();
		System.out.println("Enter the d value:  ");
		d=sc.nextInt();
		e=a+b;
		System.out.println("The sum of a and b:  "+e);
		f=c+d;
		System.out.println("The sum of c and d:  "+f);
		if(e<f)
		{
			System.out.println("The sum of a and b is greater than sum of c and d");
			}
		else 
			System.out.println();
			
		
	}

}
