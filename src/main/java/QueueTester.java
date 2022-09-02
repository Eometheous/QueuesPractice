public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(3);
        int n1 = queue.dequeue();
        int n2 = queue.dequeue();
        int n3 = queue.dequeue();
        int n4 = queue.dequeue();
        

        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4);
    }
}
