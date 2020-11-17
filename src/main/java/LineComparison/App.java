package LineComparison;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		double length1;
		double length2;
		Random random = new Random();
		double x1 = random.nextInt(10) + 1;
		double x2 = random.nextInt(10) + 1;
		double y1 = random.nextInt(10) + 1;
		double y2 = random.nextInt(10) + 1;
		double x3 = random.nextInt(10) + 1;
		double x4 = random.nextInt(10) + 1;
		double y3 = random.nextInt(10) + 1;
		double y4 = random.nextInt(10) + 1;

		length1 = (Math.sqrt(((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1))));
		length2 = (Math.sqrt(((x4 - x3) * (x4 - x3)) + ((y4 - y3) * (y4 - y3))));

		System.out.println("Length of 1st Line is : " + length1);
		System.out.println("Length of 2nd Line is : " + length2);
		Double line1 = new Double(length1);
		Double line2 = new Double(length2);
		boolean ifEqual = line1.equals(line2);
		if (ifEqual)
			System.out.println("Lines are Equal");
		else {
			int compare = line1.compareTo(line2);
			if (compare == 0)
				System.out.println("Both Lines are Equal");
			else if (compare > 0)
				System.out.println("Line 1 is larger");
			else
				System.out.println("Line 2 is larger");
		}
	}
}
