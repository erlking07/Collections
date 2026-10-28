import java.util.EmptyStackException;

public class MyStackLL<E>
{
    //next spot to fill
    private MyLinkedList stack;
    public MyStackLL() {
        stack = new MyLinkedList<E>();
    }
    
    public MyStackLL(int maxSize) {
        stack =  new MyLinkedList<E>();
    }
    
    /**
     * Pushes an element to the stack
     * @param element The element that is pushed
     * @throws IllegalStateException If stack is full;
     */
    public void push(E element) {
        stack.addHead(element);
    }
    /**
     * Pops the last element
     * 
     * @return element at the end of the array
     * @throws EmptyStackException If stack is empty;
     */
    public E pop() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }else{
            return (E) stack.removeHead();
        }
    }
    
    /**
     *  Indicates whether stack contains any elements.
     *  
     * @return true if empty otherwise false;
     */
    public boolean isEmpty() {
      return stack.isEmpty();
    }
    
    /**
     *  Reads the element at the top of the stack.
     * 
     * @return top element of the stack;
     * @throws EmptyStackException if queue is empty
     */
    public E top() {
        if(isEmpty()) {
            throw new EmptyStackException();
        }else {
          return (E) stack.getHead();  
        }
    }
    
    /**
     * Returns the number of elements stored in the stack
     * 
     * @return size of stack;
     */
    public int size(){
        return stack.size();
    }
    
    /**
     * Returns the contents of the stack from top to bottom.
     * 
     * @return contents of the stack;
     */
    public String toString() {
       return stack.toString();
    }
    
    public void test(){
        
    }
}