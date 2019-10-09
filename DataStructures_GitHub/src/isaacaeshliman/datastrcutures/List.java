package isaacaeshliman.datastrcutures;

public interface List<T>
{
	// Inserts a new object into the list
	public void insert(Object object);
	
	// Removes any matching objects from the list
	public void delete(Object object);
	
	// Searches for a matching object in the list and returns a boolean of the result
	public boolean search(Object object);
	
	// Merges two lists together into one list
	public void merge(T list);
}
