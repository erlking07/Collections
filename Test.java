
public class Test
{
    public static void main() {
    MyQueue queue = new MyQueue<Integer>();
    System.out.println(queue.size());
    for(int i = 0; i < 100; i++) {
        
        queue.enqueue(1);
    }
    System.out.println(queue.front());
    for(int i = 0;i < 100; i++) {
        queue.dequeue();
    }
    //for(int i = 0; i < 99; i ++)
    //{
    //    queue.dequeue();
    //}
    //for(int i = 0; i < 98; i ++)
    //{
    //    queue.enqueue(1);
    //}
    //queue.enqueue(1);
    System.out.println(queue.size());
    System.out.println(queue.toString());
}
}