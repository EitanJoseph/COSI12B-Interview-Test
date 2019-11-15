package cs12b.nov_20_recitation;

/**
 * Node class for Singly Linked List questions.  
 * 
 * @author Chami Lamelas
 * @version 1.0
 * COSI12B: Recitation
 * 11/20/19
 */
public class Node {

	/** Integer node data */
	private int data;
	/** Reference to next node */
	private Node next;
	
	/**
	 * Constructs a Node object given some data.
	 * @param data initialization data 
	 */
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	/**
	 * Updates the next reference to be to a new Node or null.
	 * @param next new reference that this Node should lead to
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	/**
	 * Gets the reference to the following node. This does not allow edits to next, you should use setNext().
	 * @return the ref. to the following node
	 * @see #setNext(Node)
	 */
	public Node getNext() {
		return this.next;
	}
	
	@Override
	/**
	 * Provides a String representation of this Node. 
	 * @return String of the data stored in this Node
	 */
	public String toString() {
		return ""+data;
	}
}
