//import java.util.Queue;

public class QueueWorking {

    public static void main(String[] args){

        Queue queue = new Queue();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(89);
        queue.enqueue(45);

        System.out.println(queue.dequeue());

        queue.enqueue(27);
        queue.enqueue(32);

        System.out.println("peek "+queue.peek());

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

//        queue.show();
    }
}
