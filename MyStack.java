import java.util.*;


/**
 * Standurd implementation of a stack.
 *
 * @author (Gibson Goldenberg)
 * @version (.8)
 * @param E type of element
 */
public class MyStack<E>
{
    private int end;
    //next spot to fill
    private E[] stack;
    public MyStack() {
        end = 0;
        stack = (E[]) new Object[100];
    }
    
    public MyStack(int maxSize) {
        end = 0;
        stack = (E[]) new Object[maxSize];
    }
    
    /**
     * Pushes an element to the stack
     * @param element The element that is pushed
     * @throws IllegalStateException If stack is full;
     */
    public void push(E element) {
        if (isFull()) {
            throw new IllegalStateException("stack is full.");
        } else {
        stack[end] = element;
        end++;
        }
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
            end--;
            stack[end] = null;
            return stack[end+1];
        }
    }
    
    /**
     *  Indicates whether stack contains any elements.
     *  
     * @return true if empty otherwise false;
     */
    public boolean isEmpty() {
      return end <= 0;
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
          return stack[end];  
    }
    }
    
    /**
     * Returns the number of elements stored in the stack
     * 
     * @return size of stack;
     */
    public int size() {
        return end;
    }
    
    /**
     * Indicates whether the stack has exhausted its available storage.
     * 
     * @return true if stack is full else false;
     */
    public boolean isFull() {
        return (end >= stack.length);
    }
    
    /**
     * Returns the contents of the stack from top to bottom.
     * 
     * @return contents of the stack;
     */
    public String toString() {
        String str = "";
        for(int i = end -1;i >= 1; i--) {
            str = str + stack[i] + ", ";
        }
        if (end > 0) {
           str = str + stack[0]; 
        }
        return str;
    }
    
}