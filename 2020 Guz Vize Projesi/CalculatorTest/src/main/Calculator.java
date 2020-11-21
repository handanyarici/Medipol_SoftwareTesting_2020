package main;

/**
 * Created by TCHYARICI on 21.11.2020
 */
public class Calculator {

	public Double calculate(double first, double second, char operator) {
		double result;

		switch (operator) {
		case '+':
			result = first + second;
			break;

		case '-':
			result = first - second;
			break;

		case '*':
			result = first * second;
			break;

		case '/':
			result = first / second;
			break;

		// operator doesn't match any case constant (+, -, *, /)
		default:
			System.out.printf("Error! operator is not correct");
			return null;
		}
		return result;
	}

}