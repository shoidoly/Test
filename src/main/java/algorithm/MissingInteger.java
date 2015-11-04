package algorithm;

class Point {
	double x;
	double y;
	
	public Point(){
		
	}
	
	public Point closestPoint(Point p, Point[] a) throws Exception{
		if (p == null || a == null) throw new Exception("parameter is null");
		this.x = p.x;
		this.y = p.y;
		Point closestPoint = a[0];
		double distance=0.0;
		double smallestDistance=0.0;
		for (int i=0; i<a.length; i++){
			distance = getDistance(x, y, a[i].x, a[i].y);
			if (i == 0) {
				smallestDistance = distance;
			} else if (smallestDistance > distance) {
				closestPoint = a[i];
				smallestDistance = distance;
			}
		}
		
		return closestPoint;
	}

	private double getDistance(double p1x, double p1y, double p2x, double p2y) {
		return Math.sqrt(Math.pow(p2y - p1y, 2) + Math.pow(p2x - p1x, 2));
	}
}

public class MissingInteger {
	
	public int missingInt(int[] missingArray){

        int len = missingArray.length; 
        int sum = 0;
        
        for(int i=0;i<len;i++){
            sum+=missingArray[i];
        }
        int totalNumber = ((len + 1) * (len + 2)) / 2;
        
        return totalNumber - sum;
    }
	
	public Point closestPoint(Point p, Point[] a){
		Point closestPoint = new Point();
		
		return closestPoint;
	}
    
}
