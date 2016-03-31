package geometry;

public class VerticalLineSegment extends LineSegment{

	private double length;
	
	protected VerticalLineSegment(Point startPoint, Point endPoint) {
		super(startPoint, endPoint);
		
		//this.start = null; // derivative class cannot access to private fields
	}
	
	public VerticalLineSegment(Point start, double length)
	{
		this(start, new Point(start.getX(), (int)(start.getY() + length)));
		this.length = length;
	}
	
	public double length() {
		return Math.abs(start.getY() - end.getY());
	}

}
