
/**
 * Write a description of class myQueue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyQueue
{
    // instance variables - replace the example below with your own
    private int[] queue;
    private int front;
    private int back;
    /**
     * Constructor for objects of class myQueue
     */
    public MyQueue() {
        // initialise instance variables
        queue = new int[100];
        front = 0;
        back = -1;
    }
    
    public MyQueue(int maxSize) {
        // initialise instance variables
        queue = new int[maxSize];
        front = 0;
        back = -1;
    }

    public void enqueue(int element) {
        back = (back + 1) % queue.length;
        queue[back] = element;
    }
    
    public int dequeue() {
        int temp = queue[front];
        front = (front + 1) % queue.length;
        return temp;
    }
    
    public boolean isEmpty() {
        return (back + 1) % queue.length == front;
    }
    
    public int front() {
        return front;
    }
    
    public int size() {
        return Math.floorMod((back - front),queue.length) + 1;
    }
    
    public boolean isFull() {
        return size() == queue.length;
    }
    
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
    
    public void test() {
        enqueue(65);
        enqueue(4);
        enqueue(7);
        enqueue(3);
        enqueue(10);
        dequeue();
        dequeue();
        System.out.println(toString());
        System.out.println(size());
    }
}