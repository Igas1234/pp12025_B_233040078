package tugas;

public class Node {  // Perbaikan: Huruf kapital pada nama kelas
    private int nilai;
    private Node next;

    // Inisialisasi Node
    public Node(int nilai) {  // Perbaikan: Nama konstruktor sama dengan nama kelas
        this.nilai = nilai;
        this.next = null;  // Inisialisasi next sebagai null
    }

    // Setter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    // Getter untuk nilai
    public int getNilai() {
        return this.nilai;
    }

    // Getter untuk next
    public Node getNext() {
        return this.next;
    }
}
