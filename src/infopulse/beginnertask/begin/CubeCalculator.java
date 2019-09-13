package infopulse.beginnertask.begin;

	public class CubeCalculator {
		public double findVolume(double edgeLength) {
			double cubeVolume = Math.pow(edgeLength, 3.0);
			return cubeVolume;
		}
		public double findSurface (double edgeLength) {
			double cubeSurface = 6.0*Math.pow(edgeLength,2.0);
			return cubeSurface;
		}
	}
	
	