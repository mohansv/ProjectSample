package org.sample;

public class AddNumbers {
	int a=50;
	int b=60;
	int c;
	private void add() {
		c=a+b;
		System.out.println("Addition od a and b is "+c);
	}
	public static void main(String[] args) {
		AddNumbers sum = new AddNumbers();
		sum.add();
	}

}
