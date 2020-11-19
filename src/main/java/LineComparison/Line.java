package LineComparison;

public class Line implements Comparable<Line> {

	double length;
	Point firstPoint, lastPoint;

	public Line(Point firstPoint, Point lastPoint) {
		this.firstPoint = firstPoint;
		this.lastPoint = lastPoint;
		this.calculateLength();
	}

	@Override
	public int compareTo(Line obj) {
		if (this.length > obj.length) {
			return 1;
		} else if (this.length < obj.length) {
			return -1;
		} else
			return 0;
	}

	@Override
	public boolean equals(Object obj) {
		Line line = (Line) obj;
		return this.length == line.length;

	}

	public void calculateLength() {
		this.length = (Math.sqrt(((this.lastPoint.xCoordinate - this.firstPoint.xCoordinate)
				* (this.lastPoint.xCoordinate - this.firstPoint.xCoordinate))
				+ ((this.lastPoint.yCoordinate - this.firstPoint.yCoordinate)
						* (this.lastPoint.yCoordinate - this.firstPoint.yCoordinate))));
		
	}

}
