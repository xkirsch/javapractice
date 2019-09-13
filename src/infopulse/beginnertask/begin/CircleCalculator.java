package infopulse.beginnertask.begin;

public class CircleCalculator {
	    public double findRadius(double length) {
	    	double circleRadius = length/(3.14*2);
	    	return circleRadius;
	    }
	    public double findSurface(double circleLength){
	    	double circleSurface = 3.14*Math.pow(findRadius(circleLength),2.0);
	    	return circleSurface;
	    }
}
