

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BubbleTests {

	private void checkArrayEquals(int[] expected, int[] actual) {
		if (actual == null) {
			fail("Actual value cannot be null.");
		}
		if (actual.length != expected.length) { 
			fail("Actual length must be " + expected.length);
		}
		for (int i = 0; i < actual.length; i++) {
			if (actual[i] != expected[i]) {
				fail("Array contents differ at idx=" + i + ". Exp: " + expected[i] + " Actual: " + actual[i]);
			}
		}
	}

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
}
