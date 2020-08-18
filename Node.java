package Generics;

public class Node<T> {
	 T data;  
	    Node<T> leftChild;
	    Node<T> rightChild;
	      
	    public Node(T data) {
	        this.data = data;
	    }
	       
	    @Override
	    public String toString() {
	        return data.toString();
	    }
}

