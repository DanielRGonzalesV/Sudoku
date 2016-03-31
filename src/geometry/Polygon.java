package geometry;

import java.util.List;

public class Polygon {
	
	private List<Point> vertices;
	String t;
	/**
	 * Polygon constructor
	 * 
	 * @param vertices
	 * @throws InsufficientArgumentsException, if list of points contains less than 3 points
	 */
	public Polygon(List<Point> vertices) throws InsufficientArgumentsException{
		if (vertices.size() < 3) {
			throw new InsufficientArgumentsException("Given list of Points contains only " + vertices.size() + " elements.");
		}
		/*if(instanceOfPoint(vertices)){
			throw new InsufficientArgumentsException("This '"+ t +"' is not a point, it should have X and Y.");
		}*/
		instanceOfPoint(vertices);
		this.vertices = vertices;
	}
	
	public double perimeter() {
		Point reference = vertices.get(0);
		double perimeter = 0;
		for (int index = 1; index < vertices.size(); index++) {
			Point currentPoint = vertices.get(index);
			perimeter = perimeter + reference.distanceTo(currentPoint);
			reference = currentPoint;
		}
		perimeter = perimeter + reference.distanceTo(vertices.get(0));
		return perimeter;
	}
	
	public boolean instanceOfPoint(List vertice) throws InsufficientArgumentsException{
		boolean res=false;
		
		for(int i=1;i<vertice.size();i++){
			if(!(vertice.get(i) instanceof Point)){
				res=true;
				t=(String)vertice.get(i);
				throw new InsufficientArgumentsException("This '"+ t +"' is not a point, it should have X and Y.");
			}
		}
	    return res;
	}

}
