/*
 * Author: Isaac Aeshliman
 * Date: 10/7/2019
 * 
 * Description: A node in a data structure. Holds a reference to any data (an instance of some class)
 * which allows for the content of the node to be separate from the node class itself. This makes
 * the node class dynamic and viable for any type of class while still working within any
 * data structure which utilizes the node class. Includes a series of different types of pointers for
 * use in different types of data structures including lists, queues, stacks, heaps, and trees.
 * 
 * Future Ideas: Will possibly create a system for the number of pointers to be infinite by
 * making the pointer itself a class and have the node class contain a list of pointers
 * and a method for adding a new pointer. This would allow for multilists of a dynamic size.
 */

package isaacaeshliman.datastrcutures;

public class Node
{
	// Instance Variables
	private Object data;
	private Node nextPointer;
	private Node lastPointer;
	private Node parentBranch;
	private Node leftBranch;
	private Node rightBranch;
	
	
	
	// Constructors
	public Node()
	{
		this.data = null;
		this.nextPointer = null;
		this.lastPointer = null;
		this.parentBranch = null;
		this.leftBranch = null;
		this.rightBranch = null;
	}
	
	public Node(Object data)
	{
		this.data = data;
		this.nextPointer = null;
		this.lastPointer = null;
		this.parentBranch = null;
		this.leftBranch = null;
		this.rightBranch = null;
	}
	
	
	
	// Getters - O(1)
	public Object getData()
	{
		return data;
	}
	
	public Node getNextPointer()
	{
		return nextPointer;
	}
	
	public Node getLastPointer()
	{
		return lastPointer;
	}
	
	public Node getParentBranch()
	{
		return parentBranch;
	}
	
	public Node getLeftBranch()
	{
		return leftBranch;
	}
	
	public Node getRightBranch()
	{
		return rightBranch;
	}
	
	
	
	// Setters - O(1)
	public void setData(Object data)
	{
		this.data = data;
	}
	
	public void setNextPointer(Node nextPointer)
	{
		this.nextPointer = nextPointer;
	}
	
	public void setLastPointer(Node lastPointer)
	{
		this.lastPointer = lastPointer;
	}
	
	public void setParentBranch(Node parentBranch)
	{
		this.parentBranch = parentBranch;
	}
	
	public void setLeftBranch(Node leftBranch)
	{
		this.leftBranch = leftBranch;
	}
	
	public void setRightBranch(Node rightBranch)
	{
		this.rightBranch = rightBranch;
	}
	
	
	
	// Miscellaneous
	public int compareNode(Node node) // O(1)
	{
		int result;
		
		result = this.data.toString().compareTo(node.data.toString());
		
		return result;
	}
	
	public int compareData(Object data) // O(1)
	{
		int result;
		
		result = this.data.toString().compareTo(data.toString());
		
		return result;
	}
	
	
	
	// toString - O(1)
	public String toString()
	{
		String toString = null;
		
		toString = data.toString();
		
		return toString;
	}
}
