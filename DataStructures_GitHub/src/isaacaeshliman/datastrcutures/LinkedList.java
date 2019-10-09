/*
 * Author: Isaac Aeshliman
 * Date: 10/7/2019
 * 
 * Description:
 * 
 * Future Ideas:
 */

package isaacaeshliman.datastrcutures;

public class LinkedList implements List<LinkedList>
{
	// Instance Variables
	private Node head;
	private Node foot;
	
	
	
	// Constructors
	public LinkedList()
	{
		this.head = null;
		this.foot = null;
	}
	
	
	
	// Getters - O(1)
	public Node getHead()
	{
		return this.head;
	}
	
	public Node getFoot()
	{
		return this.foot;
	}
	
	
	
	// Setters - O(1)
	public void setHead(Node head)
	{
		this.head = head;
	}
	
	public void setFoot(Node foot)
	{
		this.foot = foot;
	}
	
	
	
	// Operators
	public void insert(Object object) // O(n)
	{
		Node newNode = new Node(object);
		
		// If the list is empty then make this the first node in the list
		if(head==null)
		{
			head = newNode;
			foot = newNode;
		}
		// Otherwise iterate through the list
		else
		{
			Node currentNode = head;
			
			// Iterates through each node in the list
			while(currentNode!=null)
			{
				// If the new node belongs closer to the head of the list than the current node insert the node before the current node
				if(newNode.compareNode(currentNode)<=0)
				{
					// If the current node is the first node in the list set the head to the new node and update pointers accordingly
					if(currentNode.getLastPointer()==null)
					{
						newNode.setNextPointer(currentNode);
						currentNode.setLastPointer(newNode);
						head = newNode;
						break;
					}
					// Otherwise insert the new node before the current node and update pointers accordingly
					else
					{
						newNode.setLastPointer(currentNode.getLastPointer());
						newNode.setNextPointer(currentNode);
						newNode.getLastPointer().setNextPointer(newNode);
						newNode.getNextPointer().setLastPointer(newNode);
						break;
					}
				}
				// Otherwise set the current node to the next node in the list
				else
				{
					currentNode = currentNode.getNextPointer();
				}
			}
			
			// If the iteration reached the end without finding an insertion point then insert the new node at the end making it the foot and update pointers accordingly
			if(currentNode==null)
			{
				foot.setNextPointer(newNode);
				newNode.setLastPointer(foot);
				foot = newNode;
			}
		}
	}
	
	public void delete(Object object) // O(n)
	{
		Node currentNode = head;
		
		while(currentNode!=null)
		{
			if(currentNode.compareData(object)==0)
			{
				Node temp = currentNode;
				currentNode = currentNode.getNextPointer();
				
				if(temp.getLastPointer()==null)
				{
					head = temp.getNextPointer();
					if(temp.getNextPointer()!=null)
					{
						temp.getNextPointer().setLastPointer(null);
					}
				}
				else if(temp.getNextPointer()==null)
				{
					foot = temp.getLastPointer();
					if(temp.getLastPointer()!=null)
					{
						temp.getLastPointer().setNextPointer(null);
					}
				}
				else
				{
					temp.getLastPointer().setNextPointer(temp.getNextPointer());
					temp.getNextPointer().setLastPointer(temp.getLastPointer());
				}
				
				temp = null;
			}
			else
			{
				currentNode = currentNode.getNextPointer();
			}
		}
	}
	
	public boolean search(Object object) // O(n)
	{
		boolean result = false;
		Node currentNode = head;
		
		while(currentNode!=null)
		{
			if(currentNode.compareData(object)==0)
			{
				result = true;
			}
			
			currentNode = currentNode.getNextPointer();
		}
		
		return result;
	}
	
	public void merge(LinkedList list)
	{
		
	}
	
	
	
	// toString - O(1)
	public String toString()
	{
		String toString = "";
		Node currentNode = head;
		
		while(currentNode!=null)
		{
			toString += currentNode + "\n";
			currentNode = currentNode.getNextPointer();
		}
		
		return toString;
	}
	
}
