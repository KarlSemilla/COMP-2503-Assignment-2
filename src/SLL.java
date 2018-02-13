
public class SLL<T extends Comparable<T>> {
	private Node<T> start;
	private Node<T> end;
	private Node<T> tmp;
	
	public SLL() {
		start = null;
		end = null;
		tmp = null;
	}
	
    public int size(){
        Node<T> curr = start;
        int length = 0;

        while(curr != null)
        {
            length++;
            curr = curr.getNext();
        }

        return length;
    }
	
    public boolean isEmpty(){ 
    		return (start == null); 
    }
    
	public int compareTo() {
		return 1;
	}
	
    public void addToStart(T data) 
    { 
        Node<T> nodeToAdd = new Node<T>(data); 
        if(isEmpty())
            start = nodeToAdd;
        else
        {
          nodeToAdd.setNext(start);
          start = nodeToAdd;
        }
    }
        
        public void addToEnd(T data) {
            Node<T> nodeToAdd = new Node(data); 
            if(start != null){
                Node<T> curr = start;

                while(curr.getNext() != null){
                   curr = curr.getNext();
                }
                curr.setNext(nodeToAdd);
            }
            else
                start = nodeToAdd;   
    }
        
       public T get(int index){
            T data = null;
            int length = size();
            Node<T> curr = start;
            
            if (index <= length && index >=0){
                curr = start;
                for (int count = 0; count < index; count++)
                    curr = curr.getNext();
                data = curr.getData();    
            }
            return data;
        }
    
    public void print()
    {
        Node<T> curr = start;

        System.out.print("Start->");

        while(curr != null)
        {
            System.out.print("["+curr.getData()+"]->");
            curr = curr.getNext();
        }

        System.out.println("null");
    }

	public boolean contains(Word w) {
		boolean result = false;
		while(start != null) {
			if(tmp.getData() == w.getWord()) {
				result = true;
			}
			else
				result = false;
			tmp.getNext();
			}
			return result;
		}
    
    
}
