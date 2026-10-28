import java.util.NoSuchElementException;

/**
 * Standurd implementatoin of a queue.
 *
 * @author (Gibson Goldenberg)
 * @version (.8)
 * @param E type of elements
 */
public class MyQueue<E>
{
    // instance variables - replace the example below with your own
    private E[] queue;
    private int front;
    private int back;
    private int size;
    /**
     * Constructor for objects of class myQueue
     */
    public MyQueue() {
        // initialise instance variables
        queue = (E[])new Object[100];
        front = 0;
        back = -1;
        size = queue.length;
    }
    
    public MyQueue(int maxSize) {
        // initialise instance variables
        queue = (E[])new Object[maxSize];
        front = 0;
        back = -1;
        size = 0;
    }
    
    /**
     * Adds an element to the back of the queue.
     * @param element The element that is added to the back
     * @throws IllegalArgumentException If queue is full
     */
    public void enqueue(E element) {
        if(isFull()) {
            throw new IllegalStateException("Queue is Full.");
        }else {
            back = (back + 1) % queue.length;
            queue[back] = element;
            size++;
        }
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
            E temp = queue[front];
            queue[front] = null;
            front = (front + 1) % queue.length;
            size--;
            return temp;
        }
    }
    
    /**
     * Indicates whether the queue contains any elements.
     * @return True if queue is empty else False
     */
    public boolean isEmpty() {
        return size() == 1;
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
        return queue[front];
        }
    }
    
    /**
     * Returns the number of elements stored in the queue.
     * @return number of elements stored in the queue
     */
    public int size() {
        //return Math.floorMod((back - front + queue.length + 1),queue.length);
        return size;
    }
    
    /**
     * Indicates whether the queue has exhausted its available storage.
     * @return True if queue is full else False
     */
    public boolean isFull() {
        return size() == queue.length;
    }
    
    /**
     * Returns the contents of the queue from front to back.
     * @return the contents of the queue from front to bac
     */
    public String toString() {
        String str = "";
        int index = front;
        while(index!= back)
        {
            str = str + queue[Math.floorMod(index,queue.length)]+ ", ";
            index = (index + 1) % queue.length;
        }
        str = str + queue[back];
        return str;
    }
    

}