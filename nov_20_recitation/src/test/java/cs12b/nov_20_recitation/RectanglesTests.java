package cs12b.nov_20_recitation;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Point;

import org.junit.jupiter.api.Test;

/**
 * Tests for creating rectangles question.
 * 
 * COSI 12B: Recitation
 * 11/20/2019
 * @author Chami Lamelas
 * @version 1.0
 */
class RectanglesTests {

	/**
	 * Tests a given input against an expected output.
	 * @param expected the expected output
	 * @param testCase the input test case
	 */
	void testInput(int expected, int... testCase) {
		if (testCase.length % 2 != 0) {
			throw new IllegalArgumentException("Invalid test case!");
		}
		
		Point[] points = new Point[testCase.length/2];
		for (int i = 0; i < testCase.length; i++) {
			if (i % 2 == 0) {
				points[i/2] = new Point();
				points[i/2].x = testCase[i];
			}
			else {
				points[i/2].y = testCase[i];
			}
		}
		
		assertEquals(expected, Rectangles.getNumRectangles(points));
	}
	
	// tests inputs with only positive points of increasing size 
	
	@Test
	void test1RectPositive() {
		testInput(1, 1, 1, 1, 2, 2, 1, 2, 2);
	}
	
	@Test
	void test2RectPositive() {
		testInput(2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 3, 3, 1, 3, 3);
	}
	
	@Test
	void test9RectPositive() {
		testInput(9, 1, 1, 1, 2, 2, 1, 2, 2, 1, 3, 3, 1, 3, 3, 2, 3, 3, 2);
	}
	
	@Test
	void test36RectPositive() {
		testInput(36, 1, 1, 1, 2, 2, 1, 2, 2, 1, 3, 3, 1, 3, 3, 2, 3, 3, 2, 4, 4, 4, 1, 4, 2, 4, 3, 1, 4, 2, 4, 3, 4);
	}
	
	// tests inputs with only positive points of increasing size
	
	@Test
	void test1RectNegative() {
		testInput(1, -1, -1, -1, -2, -2, -1, -2, -2);
	}
	
	@Test
	void test2RectNegative() {
		testInput(2, -1, -1, -1, -2, -2, -1, -2, -2, -1, -3, -3, -1, -3, -3);
	}
	
	@Test
	void test9RectNegative() {
		testInput(9, -1, -1, -1, -2, -2, -1, -2, -2, -1, -3, -3, -1, -3, -3, -2, -3, -3, -2);
	}
		
	@Test
	void test36RectNegative() {
		testInput(36, -1, -1, -1, -2, -2, -1, -2, -2, -1, -3, -3, -1, -3, -3, -2, -3, -3, -2, -4, -4, -4, -1, -4, -2, -4, -3, -1, -4, -2, -4, -3, -4);
	}
	
	// Edge case tests: 0-3 rectangles
	
	@Test
	void testOnly3() {
		testInput(0, 1, 1, 1, 2, 2, 1);
	}
	
	@Test
	void testOnly2() {
		testInput(0, 1, 1, 1, 2);
	}
	
	@Test
	void testOnly1() {
		testInput(0, 1, 1);
	}
	
	@Test
	void testZero() {
		testInput(0);
	}
	
	// Tests point arrays that form 0 rectangles
	
	@Test
	void testNone1() {
		testInput(0, 1, 1, 1, 2, 2, 1, 3, 2);
	}
	
	@Test
	void testNone2() {
		testInput(0, 1, 1, 2, 2, 2, 3, 3, 2);
	}
	
	// Special case tests: squares surrounding each other, squares in a line, squares arranged diagonally
	
	@Test
	void testSurroundingSquares() {
		testInput(2, -1, -1, 1, 1, 1, -1, -1, 1, 2, 2, -2, -2, -2, 2, 2, -2);
	}
	
	@Test
	void testLinedUpSquares() {
		testInput(6, 1, 1, -1, -1, -1, 1, 1, -1, 2, 1, 2, -1, -2, -1, -2, 1);
	}
	
	@Test
	void testDiagonalSquares() {
		testInput(3, -1, 1, -2, 1, -2, 2, -1, 2, -1, -1, 1, 1, 1, -1, 2, -1, 2, -2, 1, -2);
	}
}
