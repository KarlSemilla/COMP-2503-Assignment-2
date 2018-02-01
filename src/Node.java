
public class Node<type> {
    private type data;
    private Node<type> next = null;
    
    public Node()
    {
    	
    }
    
    public Node(type data) 
    {
    		this.data=data;
    	}
    
    public type getData() 
    { 
    		return data;
    	}
    
    public void setData(type value) 
    { 
    		data = value; 
    	}
           
    public void setNext(Node<type> other)
    { 
    		next = other;
    	}
    
    public Node<type> getNext() 
    { 
    		return next; 
    	}
}
