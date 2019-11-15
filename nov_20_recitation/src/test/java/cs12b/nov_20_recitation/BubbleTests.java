package cs12b.nov_20_recitation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Tests for bubble zeroes question.
 * 
 * COSI 12B: Recitation
 * 11/20/2019
 * @author Chami Lamelas
 * @version 1.0
 */
class BubbleTests {

	/**
	 * Checks if an expected array is equal to an actual array
	 * @param expected the expected array 
	 * @param actual the actual array 
	 */
	private void checkArrayEquals(int[] expected, int[] actual) {
		if (actual == null) {
			fail("Actual value cannot be null.");
		}
		if (actual.length != expected.length) { 
			fail("Actual length must be " + expected.length);
		}
		for (int i = 0; i < actual.length; i++) {
			if (actual[i] != expected[i]) {
				fail("Array contents first differ at idx=" + i + ". Exp: " + expected[i] + " Actual: " + actual[i]);
			}
		}
	}
	
	// Odd, even length arrays of only 0's and 1's

	@Test
	void binaryOddTest() {
		int[] array = {1,0,1,0,1};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,1,1,0,0}, array);
	}
	
	@Test
	void binaryEvenTest() {
		int[] array = {0,1,0,1,0,1};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,1,1,0,0,0}, array);
	}
	
	// Positive, negative arrays of varying parity
	
	@Test
	void positivesOddTest() {
		int[] array = {0,1,0,2,0,3,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,2,3,0,0,0,0}, array);
	}
	
	@Test
	void positivesEvenTest() {
		int[] array = {4,0,5,0,6,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {4,5,6,0,0,0}, array);
	}
	
	@Test
	void negativesOddTest() {
		int[] array = {0,-1,0,-2,0,-3,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {-1,-2,-3,0,0,0,0}, array);
	}
	
	@Test
	void negativesEvenTest() {
		int[] array = {-4,0,-5,0,-6,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {-4,-5,-6,0,0,0}, array);
	}
	
	// Edge case tests: all nonzero, all zero, 1-3 zeroes
	
	@Test
	void allNonZero() {
		int[] array = {1,2};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,2}, array);
	}
	
	@Test
	void allZero() {
		int[] array = {0,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {0,0}, array);
	}
	
	@Test
	void oneZero() {
		int[] array = {0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {0}, array);
	}
	
	@Test
	void oneNonZero() {
		int[] array = {-100};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {-100}, array);
	}
	
	@Test
	void doubleZero() {
		int[] array = {0,0,1,0,0,2,0,0,3,0,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,2,3,0,0,0,0,0,0,0,0}, array);
	}
	
	@Test
	void tripleZero() {
		int[] array = {0,0,0,1,0,0,0,2,0,0,0,3,0,0,0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,2,3,0,0,0,0,0,0,0,0,0,0,0,0}, array);
	}	
	
	// general tests
	
	@Test
	void genTest1() {
		int[] array = {0, 0, 31, 0, -25, 0, 38, 0, 0, -34, 19, 0};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {31,-25,38,-34,19,0,0,0,0,0,0,0}, array);
	}
	
	@Test
	void genTest2() {
		int[] array = {0, 0, 0, 0, -5, 4, 3, -2};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {-5, 4, 3, -2, 0, 0, 0, 0}, array);
	}
	
	@Test
	void genTest3() {
		int[] array = {1, 2, 3, 0, 0, 0, 4, 5, 6};
		BubbleZeroes.bubble(array);
		checkArrayEquals(new int[] {1,2,3,4,5,6,0,0,0}, array);
	}
}
