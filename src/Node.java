
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
    
	public int compareTo(Node other) {
		if(this.data == other.data) {
			return 0;
		}
		else
			return this.data.compareTo((T) other.data);
		/*if(this.getData() == other.getData()) {
			return 0;
		}
		else if(this.getData() != other.getData()) {
			return 1;
		}
		else
			return -1;*/
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
