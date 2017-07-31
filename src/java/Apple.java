package java;

public class Apple extends Fruite {

	Apple(int x, int y) {
		super(x);
		System.out.println("Apple 2 param const");

	}

	Apple(int x) {

		this(x,x);
		System.out.println("Apple 1 param const");

	}

	public static void main(String[] args) {
		Apple apple = new Apple(3);

	}

}
