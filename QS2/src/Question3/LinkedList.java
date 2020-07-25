package Question3;

import java.util.NoSuchElementException;

/**
 * Your linked list implementation.
 */
public class LinkedList<E> implements List<E> {
	
	private Node<E> head, tail;
	int length = 0;
	
	public LinkedList(){
    	// Your code here
		head = new Node<E>();
		head.setData(null);
		head.setLink(null);
		tail = head;
    }
    
	public boolean isEmpty(){
    	// Your code here
		if(head==tail) return true;
		else return false;
    }
    
	public void add(E item) {
		// Your code here
		Node<E> node = new Node<E>();
		node.setData(item);
		node.setLink(null);
		tail.setLink(node);
		tail=node;
		length++;
    }

	public void add(E... items) {
    	// Your code here
		int i=0;
		for(E e:items){
			Node<E> node = new Node<E>();
			node.setData(e);
			node.setLink(null);
			tail.setLink(node);
			tail=node;
			i++;
		}
		length+=i;
    }

	public void add(E item, int pos) throws IndexOutOfBoundsException {
		// Your code here
		int index=0;
		Node<E> iterator = head;
		while(iterator.getLink()!=null&&index<pos){
			index++;
			iterator=iterator.getLink();
		}
		Node<E> node = new Node<E>();
		node.setData(item);
		node.setLink(iterator.getLink());
		iterator.setLink(node);
		length++;
	}

	public void remove(int pos) throws IndexOutOfBoundsException {   		
		// Your code here
		int index=0;
		Node<E> iterator = head;
		while(iterator.getLink()!=null&&index<pos-1){
			index++;
			iterator=iterator.getLink();
		}
		iterator.setLink(iterator.getLink().getLink());
		length--;
    }

	public E get(int pos) throws IndexOutOfBoundsException {	
    	// Your code here
		int index=-1;
		Node<E> iterator = head;
		while(iterator.getLink()!=null&&index<pos){
			index++;
			iterator=iterator.getLink();
		}
		if(index<pos){
			throw new IndexOutOfBoundsException();
		}
		return iterator.getData();
    }

    public int length() {
        // Your code here
    	return length;
    }

	public boolean contains(E target) {
    	// Your code here
		Node<E> iterator = head;
		while(iterator.getLink()!=null){
			iterator=iterator.getLink();
			if(iterator.getData().equals(target)){
				return true;
			}
		}
		return false;
    }

	public int findFirst(E target) throws NoSuchElementException {
    	// Your code here
		int pos=-1;
		Node<E> iterator = head;
		while(iterator.getLink()!=null){
			iterator=iterator.getLink();
			pos++;
			if(iterator.getData().equals(target)){
				return pos;
			}
		}
		if(iterator.getLink()==null){
			throw new NoSuchElementException();
			
		}
		return 0;
    }

	public void reverse() {
    	// Your code here
		Node<E> p = head.getLink();
		Node<E> q=null;
		Node<E> r=null;
		while(p!=null){
			q=p.getLink();
			p.setLink(r);
			r=p;
			p=q;
		}
		head.setLink(r);
    }
    
	public void printList(){
    	// Your code here
		Node<E> iterator = head;
		while(iterator.getLink()!=null){
			iterator=iterator.getLink();
			System.out.println(iterator.getData());
		}
    }
}