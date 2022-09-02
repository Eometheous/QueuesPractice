public class Queue {
    private Node head;
    private Node tail;

    public Queue() {
        head = null;
        tail = null;
    }

    public void enqueue(int x) {
        Node tempNode = new Node(x);
        if (head == null && tail == null) {
            head = tempNode;
            tail = tempNode;
        }
        else{
            tail.setNext(tempNode);
            tempNode.setPrevious(tail);
            tail = tempNode;
        }
    }

    public int dequeue() {
        int n;
        if (head == null) return -1;
        n = head.getN();
        if (head == tail) {
            head = null;
            tail = null;
            return n;
        }
        head.getNext().setPrevious(null);
        head = head.getNext();
        return n;
    }
}
