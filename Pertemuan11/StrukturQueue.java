package Pertemuan11;

public class StrukturQueue {
    private Node FRONT, REAR;

    public StrukturQueue() {
        FRONT = null;
        REAR = null;
    }

    public boolean isEmpty() {
        return FRONT == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            FRONT = REAR = newNode;
        } else {
            REAR.setNext(newNode);
            REAR = newNode;
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong, tidak bisa dequeue.");
            return;
        }

        if (FRONT == REAR) {
            FRONT = REAR = null;
        } else {
            FRONT = FRONT.getNext();
        }
    }

    public int size() {
        int size = 0;
        Node current = FRONT;
        while (current != null) {
            size++;
            current = current.getNext();
        }
        return size;
    }

    public int front() {
        return (FRONT != null) ? FRONT.getData() : -1;
    }

    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Elemen Queue: Queue kosong");
            return;
        }

        System.out.print("Elemen Queue: ");
        Node current = FRONT;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }
}
