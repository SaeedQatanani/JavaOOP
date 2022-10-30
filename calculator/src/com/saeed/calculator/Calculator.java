package com.saeed.calculator;

public class Calculator {
	private double operandone;
	private double operandtwo;
	private char operation;
	private double result = 0.0;
	
	public double getOperandone() {
		return operandone;
	}
	public void setOperandone(double operandone) {
		this.operandone = operandone;
	}
	public double getOperandtwo() {
		return operandtwo;
	}
	public void setOperandtwo(double operandtwo) {
		this.operandtwo = operandtwo;
	}
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	public void performOperation() {
		if (this.operation == '+') {
			this.result = this.operandone + this.operandtwo;
		}
		else if (this.operation == '-') {
			this.result = this.operandone - this.operandtwo; 
		}
		else {
			System.out.println("you have entered sth wrong");
		}
	}
	public double getResults() {
		return this.result;
	}
	
}
