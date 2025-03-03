//package Pertemuan4;
//
//public class StrukturList {
//    private Node HEAD;
//
//    public void addHead(int data) {
//        Node newNode = new Node(data);
//        newNode.setNext(HEAD);
//        HEAD = newNode;
//    }
//
//    public void addMid(int position, int data) {
//        Node newNode = new Node(data);
//
//        if (position == 0 || HEAD == null) {
//            addHead(data);
//            return;
//        }
//
//        Node positionNode = HEAD;
//        int index = 0;
//
//        while (positionNode != null && index < position - 1) {
//            positionNode = positionNode.getNext();
//            index++;
//        }
//
//        if (positionNode == null) {
//            System.out.println("Posisi di luar jangkauan");
//            return;
//        }
//
//        newNode.setNext(positionNode.getNext());
//        positionNode.setNext(newNode);
//    }
//
//    public void addTail(int data) {
//        Node newNode = new Node(data);
//
//        if (HEAD == null) {
//            HEAD = newNode;
//            return;
//        }
//
//        Node curNode = HEAD;
//
//        while (curNode.getNext() != null) {
//            curNode = curNode.getNext();
//        }
//
//        curNode.setNext(newNode);
//    }
//
//    public void displayElement() {
//        Node position = HEAD;
//        while (position != null) {
//            System.out.print(position.getData() + " ");
//            position = position.getNext();
//        }
//        System.out.println();
//    }
//}

//
//
package Pertemuan4;

public class StrukturList {
    private Node HEAD;

    public void addMid(int position, double data) {
        Node newNode = new Node(data);

        // Jika posisi adalah 0 atau list kosong, tambahkan di awal
        if (position == 0 || HEAD == null) {
            addHead(data);
            return;
        }

        Node positionNode = HEAD;
        int index = 0;

        // Traversal untuk menemukan posisi sebelum titik penyisipan
        while (positionNode != null && index < position - 1) {
            positionNode = positionNode.getNext();
            index++;
        }

        // Jika posisi melebihi panjang list, hentikan eksekusi
        if (positionNode == null) {
            System.out.println("Posisi di luar jangkauan");
            return;
        }

        // Sisipkan node baru ke dalam list
        newNode.setNext(positionNode.getNext());
        positionNode.setNext(newNode);
    }

    public void addTail(double data) {
        Node newNode = new Node(data);

        if (HEAD == null) {  // Jika list kosong, jadikan HEAD
            HEAD = newNode;
            return;
        }

        Node curNode = HEAD;

        while (curNode.getNext() != null) {  // Cari node terakhir
            curNode = curNode.getNext();
        }

        curNode.setNext(newNode);  // Tambahkan elemen di akhir
    }

    public void displayElement() {
        Node position = HEAD;
        while (position != null) {
            System.out.print(position.getData() + " ");
            position = position.getNext();
        }
        System.out.println();
    }

    public void addHead(double data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }
}
