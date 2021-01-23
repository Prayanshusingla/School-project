package class2;
import java.util.Scanner;
import java.lang.Math;
public class Calculator {

	public static void main(String[] args) {
		System.out.println("CALCULATOR");
		Scanner scan = new Scanner(System.in);
	System.out.println("Menu for calculator:"+ "\n 1: ADD " + "\n 2: SUBTRACT" + "\n 3: MULTIPLY"+"\n 4: DIVISION"+"\n 5: SQUARE RT"+"\n 6: POWER");
	System.out.println("Please choose your option:");
	int menu = scan.nextInt();
	switch (menu) {
	case 1:{
		System.out.println("Please enter variable a and b:" );
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Your answer is:"+ (a+b));
		break; 
		}
	case 2: {
		System.out.println("Please enter variable a and b:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Your answer is:"+ (a-b));
		break; 
	}
	case 3: {
		System.out.println("Please enter variable a and b:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Your answer is:"+ (a*b));
		break; 
	}
	case 4: {
		System.out.println("Please enter variable a and b:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Your answer is:"+ (a/b));
		break; 
	}
	case 5:{
	System.out.println("Please enter variable a:");
	double a = scan.nextDouble();
	System.out.println("Your answer is:"+ Math.sqrt(a));
	break; 
	}
	case 6:{
		System.out.println("Please enter variable a and power b:");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		System.out.println("Answer is:"+ Math.pow(a, b));
		break; 
	}
	}
		
	}


		// TODO Auto-generated method stub
		
	}

}
