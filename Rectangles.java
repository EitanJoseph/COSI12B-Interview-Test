
import java.awt.Point;

public class Rectangles {

	public static int getNumRectangles(Point[] points) {
		return 0;
	}
	
	// Helper methods
	// You may use either of these two methods in your solution

	/**
	 * @param x
	 * @param y
	 * @return xCy
	 */
	public static int choose(int x, int y) {
		return factorial(x)/(factorial(y)*factorial(x-y));
	}
	
	/**
	 * @param x
	 * @return x!
	 */
	public static int factorial(int x) {
		return x <= 1 ? 1 : x * factorial(x - 1);
	}
	
}
