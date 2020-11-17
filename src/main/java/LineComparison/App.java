package LineComparison;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		double length = 0.0;
		Random random = new Random();
		double x1 = random.nextInt(10) + 1;
		double y1 = random.nextInt(10) + 1;
		double x2 = random.nextInt(10) + 1;
		double y2 = random.nextInt(10) + 1;
		length = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
		System.out.println("End points are x1=" + x1 + "y1 =" + y1);
		System.out.println("End points are x2=" + x2 + "y2 =" + y2);
		System.out.println("length of the line is = " + length);
	}
}
