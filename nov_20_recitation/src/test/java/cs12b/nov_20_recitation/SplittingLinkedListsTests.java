package cs12b.nov_20_recitation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.StringJoiner;

import org.junit.jupiter.api.Test;

/**
 * Tests for splitting linked lists question.
 * 
 * COSI 12B: Recitation
 * 11/20/2019
 * @author Chami Lamelas
 * @version 1.0
 */
class SplittingLinkedListsTests {

	/**
	 * Helper method that returns String representation of a singly linked list.
	 * @param list Node head of list
	 * @return data at each node separated by space 
	 * @see Node
	 */
	private static String getString(Node list) {
		StringJoiner joiner = new StringJoiner(" ");
		Node curr = list;
		while (curr != null) {
			joiner.add(curr.toString());
			curr = curr.getNext();
		}
		return joiner.toString();
	}
	
	/**
	 * Builds a singly linked list from an input of integers.
	 * @param input a variable number of ints / an int array 
	 * @return head of SLL created from input
	 * @see Node
	 */
	private static Node buildList(int...input) {
		if (input.length == 0) {
			return null;
		}
		Node head = new Node(input[0]);
		Node addPt = head; 
		for (int i = 1; i < input.length; i++) {
			addPt.setNext(new Node(input[i]));
			addPt = addPt.getNext();
		}
		return head;
	}

	/**
	 * Tests a given input and checks to see if matches the expected String output.
	 * @param expected the expected String output of the list
	 * @param input an input to test
	 * @see #buildList(int...)
	 * @see #getString(Node)
	 * @see Node
	 */
	private static void testInput(String expected, int...input) {
		Node list = buildList(input);
		SplittingLinkedLists.remove2ndHalf(list);
		assertEquals(expected, getString(list));
	}
	
	// Tests some edge cases (small lists of different parity)
	
	@Test
	void testEmpty() {
		testInput("");
	}
	
	@Test
	void test1Elem() {
		testInput("1", 1);
	}
	
	@Test
	void test2Elem() {
		testInput("3", 3, 2);
	}
	
	@Test
	void test3Elem() {
		testInput("5 3", 5, 3, 6);
	}
	
	@Test
	void test4Elem() {
		testInput("8 4", 8, 4, 9, 0);
	}
	
	// Tests for short, medium, and large list sizes
	
	@Test
	void testShortOdd() { // 9
		testInput("3 5 2 1 4", 3, 5, 2, 1, 4, 6, 7, 8, 0);
	}
	
	@Test
	void testShortEven() { // 10
		testInput("3 5 2 1 4", 3, 5, 2, 1, 4, 6, 7, 8, 0, 11);
	}
	
	@Test
	void testMediumOdd() { // 25
		testInput("3 5 2 1 4 6 7 8 0 1 3 4 5", 3, 5, 2, 1, 4, 6, 7, 8, 0, 1, 3, 4, 5, 6, 5, 29, 0, 8, 2, 4, 21, 23, 20, 10, 88);
	}
	
	@Test
	void testMediumEven() { // 26
		testInput("3 5 2 1 4 6 7 8 0 1 3 4 5", 3, 5, 2, 1, 4, 6, 7, 8, 0, 1, 3, 4, 5, 6, 5, 29, 0, 8, 2, 4, 21, 23, 20, 10, 88, 129);
	}
	
	@Test
	void testLargeOdd() { // 59
		testInput("59 21 47 70 67 60 26 0 70 78 8 4 68 93 2 71 6 29 57 66 96 58 59 13 17 48 36 73 56 99", 59, 21, 47, 70, 67, 60, 26, 0, 70, 78, 8, 4, 68, 93, 2, 71, 6, 29, 57, 66, 96, 58, 59, 13, 17, 48, 36, 73, 56, 99, 79, 85, 17, 53, 35, 1, 25, 100, 51, 1, 100, 36, 98, 22, 38, 22, 95, 97, 46, 11, 3, 70, 87, 55, 37, 46, 65, 23, 81);
	}
	
	@Test
	void testLargeEven() { // 60
		testInput("59 21 47 70 67 60 26 0 70 78 8 4 68 93 2 71 6 29 57 66 96 58 59 13 17 48 36 73 56 99", 59, 21, 47, 70, 67, 60, 26, 0, 70, 78, 8, 4, 68, 93, 2, 71, 6, 29, 57, 66, 96, 58, 59, 13, 17, 48, 36, 73, 56, 99, 79, 85, 17, 53, 35, 1, 25, 100, 51, 1, 100, 36, 98, 22, 38, 22, 95, 97, 46, 11, 3, 70, 87, 55, 37, 46, 65, 23, 81, 10);
	}
}
