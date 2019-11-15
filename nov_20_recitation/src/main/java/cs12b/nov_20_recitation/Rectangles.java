package cs12b.nov_20_recitation; 

import java.awt.Point;

/**
 * This class will hold your implementation of a method that finds the number of rectangles given an
 * array of Points.
 * 
 * @author CS12B 
 */
public class Rectangles {

	/**
	 * Gets the number of rectangles that are parallel to the X-axis and Y-axis that can be constructed from
	 * an array of Points.
	 * @param points an array of Points
	 * @return the no. of rectangles that can be constructed from points
	 */
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
