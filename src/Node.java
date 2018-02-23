
public class Node<T extends Comparable<T>> {
    private T data;
    private Node<T> next = null;
    
    public Node()
    {
    		//data = this.data;
    }
    
    public Node(T data) 
    {
    		this.data=data;
    	}
    
	public int compareTo(Node<T> other) {
		if(this.data == other.data) {
			return 0;
		}
		else
			return this.data.compareTo((T) other.data);
	}
    
    public T getData() 
    { 
    		return data;
    	}
    
    public void setData(T value) 
    { 
    		data = value; 
    	}
           
    public void setNext(Node<T> other)
    { 
    		next = other;
    	}
    
    public Node<T> getNext() 
    { 
    		return next; 
    	}
}
