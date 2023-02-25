package java_Basic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		
		try {
			// If input is String
			int num = sc.nextInt();
			int a = num/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			// You want full error type, message and location use printStackTrace()
//			e.printStackTrace();
			
			// Only print the Error Message
			System.out.println(e.getMessage());
			System.err.println("Divisible by 0 not possible ");
		}catch (InputMismatchException e) {
			// if input is string
			System.err.println("Input must be number...");
		}finally {
			sc.close();
		}
		
		System.out.println("Completed.......");

	}

}