
public class Test
{
    public static void main() {
    MyQueueLL queue = new MyQueueLL<Integer>();
    for(int i = 0; i < 100; i++) {
        queue.enqueue(i);
    }
    System.out.println(queue.toString());
    for(int i = 0; i < 99; i ++) {
        queue.dequeue();
    }
    System.out.println(queue.toString());
}
}