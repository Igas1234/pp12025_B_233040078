package Pertemuan12;

public class StrukturStack {
  private int[] array;
    private int capacity;
    private int TOP;
    public final int MIN = -1;

    // Konstruktor
    public StrukturStack(int capacity) {
        super();
        array = new int[capacity];
        this.capacity = capacity;
        TOP = MIN;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack Penuh");
        } else {
            TOP++;
            array[TOP] = data;
        }
    }

    public boolean isEmpty() {
        return TOP == MIN;
    }

    public boolean isFull() {
        return TOP == capacity - 1;
    }

    public int size() {
        return TOP + 1;
    }

    public int top() {
        if (isEmpty()) {
            return MIN;
        }
        return array[TOP];
    }

    public int pop() {
    int temp;
    if (isEmpty()) {
        System.out.println("Stack kosong");
        return MIN; // atau nilai lain yang menunjukkan stack kosong
    } else {
        temp = array[TOP];
        TOP = TOP - 1;
        return temp;
    }
}


    public void printStack() {
        System.out.print("Elemen from TOP: ");
        for (int i = TOP; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}