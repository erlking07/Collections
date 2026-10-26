import java.util.NoSuchElementException;

/**
 * Standurd implementatoin of a queue.
 *
 * @author (Gibson Goldenberg)
 * @version (.8)
 * @param E type of elements
 */
public class MyQueueLL<E>
{
    // instance variables - replace the example below with your own
    private MyLinkedList queue;
    /**
     * Constructor for objects of class myQueue
     */
    public MyQueueLL() {
        // initialise instance variables
        queue = new MyLinkedList<E>();
    }
    
    /**
     * Adds an element to the back of the queue.
     * @param element The element that is added to the back
     * @throws IllegalArgumentException If queue is full
     */
    public void enqueue(E element) {
        queue.addTail(element);
    }
    
    /**
     * Removes an element from the front of the queue.
     * @return element The element that is removed from the front
     * @throws NoSuchElementException If queue is empty
     */
    public E dequeue() {
        if(isEmpty()) {
           throw new NoSuchElementException("Queue is Empty."); 
        } else {
            return (E) queue.removeHead();
        }
    }
    
    /**
     * Indicates whether the queue contains any elements.
     * @return True if queue is empty else False
     */
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
     /**
     *  Reads the element at the front of the queue.
     * @return element at the front of the queue
     * @throws NoSuchElementException If queue is empty
     */
    public E front() {
        if(isEmpty()) {
            throw new NoSuchElementException("Queue is Empty."); 
        } else {
        return (E) queue.getHead();
        }
    }
    
    /**
     * Returns the number of elements stored in the queue.
     * @return number of elements stored in the queue
     */
    public int size() {
        return queue.size();
    }
    
    
    /**
     * Returns the contents of the queue from front to back.
     * @return the contents of the queue from front to bac
     */
    public String toString() {
        return queue.toString();
    }
    

}