package pkg;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int Choice ;
		int a;
		int b;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your numbers: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		do 
		{
			System.out.println("1 for Addition" + "\n" + "2 for Subtraction" + "\n" + "3 for Multiplication" + "\n" +"4 for Division");
			System.out.println("Choose your choice");
			Choice = sc.nextInt();
			
			switch(Choice)
			{
			case 1:
				int add = a + b;
				System.out.println("Addition of the given number is = " + add);
			    break;
		
			case 2:
				int sub = a - b;
				System.out.println("Subtraction of the given number is = " + sub);
				break;
			
			case 3:
				int mul = a * b;
				System.out.println("Multiplication of the given number is = " + mul);
			    break;
			
			case 4:
				if(b == 0) 
				{
				System.out.println("Invalid input");
			    }
				else 
			    {
					int div = a / b;
				    System.out.println("Division of the given number is = " + div);
			    }
			
			    break;
			
			default:
				System.out.println("Choose any valid choice");
			
			}
		}
		
		while(Choice > 0 && Choice <= 4);
		
		
	}

}
