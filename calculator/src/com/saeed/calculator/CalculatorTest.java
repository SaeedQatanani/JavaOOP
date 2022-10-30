package com.saeed.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.setOperandone(10.5);
		cal.setOperation('+');
		cal.setOperandtwo(5.2);
		cal.performOperation();
		double result = cal.getResults();
		System.out.println("Your result is " + result);
		Calculator cal2 = new Calculator();
		cal2.setOperandone(10.5);
		cal2.setOperation('-');
		cal2.setOperandtwo(5.2);
		cal2.performOperation();
		double result2 = cal2.getResults();
		System.out.println("Your result is " + result2);

	}

}
