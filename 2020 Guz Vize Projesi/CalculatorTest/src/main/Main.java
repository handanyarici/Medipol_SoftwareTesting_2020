package main;

import java.util.Scanner;

/**
 * Created by TCHYARICI on 21.11.2020
 */
public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter two numbers: ");

		// nextDouble() reads the next double from the keyboard
		double first = reader.nextDouble();
		double second = reader.nextDouble();

		System.out.print("Enter an operator (+, -, *, /): ");
		char operator = reader.next().charAt(0);

		Calculator calculator = new Calculator();
		System.out.println(first + " " + operator + " " + second + " = " + calculator.calculate(first,second,operator));

	}
}
