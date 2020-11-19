package LineComparison;

import java.util.Random;

public class App {
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Computation Program");
		Point line1Point1 = new Point(0, 0);
		Point line1Point2 = new Point(10, 0);
		Point line2Point1 = new Point(0, 0);
		Point line2Point2 = new Point(8, 0);
		Line firstLine = new Line(line1Point1, line1Point2);
		Line secondLine = new Line(line2Point1, line2Point2);

		System.out.println("Length of 1st Line is : " + firstLine.length);
		System.out.println("Length of 2nd Line is : " + secondLine.length);
		LineComparison(firstLine, secondLine);
	}

	public static int LineComparison(Line line1, Line line2) {
		boolean ifEqual = line1.equals(line2);
		if (ifEqual)
			System.out.println("Both Lines are Equal");
		else {
			int compare = line1.compareTo(line2);
			if (compare > 0)
				System.out.println("Line 1 is larger");
			else if (compare == 0)
				System.out.println("Both Lines are Equal");
			else
				System.out.println("Line 2 is larger");
		}
		return 0;
	}
}
