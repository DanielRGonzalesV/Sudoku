package geometry;

public class LineSegment {
	
	protected Point start;
	protected Point end;
	private double m;
	
	public static double INFINITY = Double.MAX_VALUE;
	
	public LineSegment(Point start, Point end) {
		this.start = start;
		this.end = end;
		
		m = calculateM(start, end);
	}
	
	private static double calculateM(Point firstPoint, Point secondPoint) {
		int deltaX = firstPoint.getX() - secondPoint.getX();
		double m;
		if (deltaX == 0) {
			m = INFINITY;
		} 
		else {
			m = (firstPoint.getY() - secondPoint.getY())/deltaX; 
		}
		return m;
	}
	
	public double length() {
		return start.distanceTo(end);
	}
	
	public boolean contains(Point point) {
		boolean containsPoint;
		if (point.equals(end)) {
			containsPoint = true;
		}
		else {
			containsPoint = (this.m == calculateM(this.end, point));
		} 
		
		return containsPoint;
	}
	
	public double distanceTo(Point point) {
		return 0;
	}
	
	

}
