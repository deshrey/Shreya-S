package Tandemloop;

public class program1 {


		    static class Calculator {
		        double calculate(double a, double b, String operation) {
		            switch (operation.toLowerCase()) {
		                case "add":
		                    return a + b;
		                case "subtract":
		                    return a - b;
		                case "multiply":
		                    return a * b;
		                case "divide":
		                    if (b == 0) {
		                        throw new ArithmeticException("Cannot divide by zero");
		                    }
		                    return a / b;
		                default:
		                    throw new IllegalArgumentException("Invalid operation");
		            }
		        }
		    }

		    public static void main(String[] args) {
		        Calculator calc = new Calculator();
		        double a = 10, b = 5;
		        String operation = "add";

		        System.out.println("Result: " + calc.calculate(a, b, operation));
		    }

	}

