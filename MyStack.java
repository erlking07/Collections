
/**
 * Write a description of class MyStack here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyStack
{
    private int end;
    //next spot to fill
    private int[] stack;
    public MyStack() {
        end = 0;
        stack = new int[100];
    }
    
    public MyStack(int maxSize) {
        end = 0;
        stack = new int[maxSize];
    }
    
    /**
     * Pushes an element to the stack
     * @param element The element that is pushed
     */
    public void push(int element) {
        stack[end] = element;
        end++;
    }
    
    /**
     * Pops the last element
     * 
     * @return element at the end of the array;
     */
    public int pop() {
        end--;
        return stack[end+1];
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
     */
    public int top() {
      return stack[end];  
    }
    
    /**
     *  Returns the number of elements stored in the stack
     * 
     * @return size of stack;
     */
    public int size(){
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
    
    public String toString() {
        String str = "";
        for(int i = end -1;i >= 1; i--) {
            str = str + stack[i]+", ";
        }
        if (end > 0) {
           str = str + stack[0]; 
        }
        return str;
    }
    
    public void test(){
        push(4);
        push(6);
        pop();
        pop();
        System.out.println(size());
        System.out.println(isEmpty());
        System.out.println(toString());
    }
}