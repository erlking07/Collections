import java.util.NoSuchElementException;

/**
 * Write a description of class MyLinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyLinkedList<E> {
    private Node head;
    private Node tail;
    private int size;
    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }
    
    /**
     * Adds element at beginning of list.
     * @param element The element that is added to the front
     */
    public void addHead(E element) {
            Node newNode = new Node(element);
            newNode.setNext(head);
            head = newNode;
            size++;
            if(tail == null) {
                tail = head;
            }
    }
    
    /**
     * Adds element at end of list.
     * @param element The element that is added to the back
     */
    public void addTail(E element) {
        Node newNode = new Node(element);
        if(tail != null)
        {
            tail.setNext(newNode);
        }else{
            head = newNode;
        }
        tail = newNode;
        size++;
    }
    
    /**
     * Removes and returns element at beginning of list.
     * @return element The element that is removed from the front
     */
    public E removeHead() {
        if(isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty.");
        }
        if(size == 1) {
            tail = null;
        }
        E element = (E)head.getElement();
        head = head.getNext();
        size--;
        return element;
    }
    
    /**
     * Returns element at beginning of list.
     * @return element The element that in the front
     */
    public E getHead() {
        if(isEmpty()) {
            throw new NoSuchElementException("Linked List is Empty."); 
        }
        return (E) head.getElement();
    }
    
    /**
     *  Indicates whether list is empty.
     * @return True if is empty otherwise false
     */
    public boolean isEmpty() {
        return head == null;
    }
    
    /**
     *  Returns number of elements in list.
     * @return number of elements in list
     */
    public int size() {
        return size;
    }
    
    /**
     * Returns elements in list as one string.
     * @return elements in list as one string in order
     */
    public String toString() {
        Node point = head;
        String str = "";
        if(head != null) {
            while(point.getNext() != null)
            {
                str = str + point.getElement() +", ";
                point = point.getNext();
            }
            str = str + point.getElement();
        }
        return str;
    }
    
   private class Node<E>{
       private E element;
       private Node next;
       private Node(E element) {
           this.element = element;
           next = null;
       }
       private void setNext(Node next) {
            this.next = next;  
       }
       private Node getNext() {
           return next;
       }
       private void setElement() {
           this.element = element;
       }
       private E getElement() {
           return element;
       }
    }
}