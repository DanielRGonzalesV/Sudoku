package geometry;

public class Point {
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		
			this.x = x;
			this.y = y;
		
	}
	
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	public double distanceTo(Point other) {
		double deltaX = getX() - other.getX();
		double deltaY = getY() - other.getY();
		
		
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}
	
	@Override
	public boolean equals(Object someOtherObject) {
		if ((someOtherObject instanceof Point) != true) {
			return false;
		}
		Point otherPoint = (Point)someOtherObject;
		return otherPoint.x == this.x && otherPoint.y == this.y;
	}
	
	public static double distanceBetweenPoints(Point firstPoint, Point secondPoint) {
		return firstPoint.distanceTo(secondPoint);
	}

}
