//package Pertemuan4;
//
//public class ListTest {
//    public static void main(String[] args) {
//        StrukturList list = new StrukturList();
//
//        // Tambahkan elemen sesuai dengan instruksi di latihan 3
//        list.addTail(3);  // Tambah elemen 3 di akhir list
//        list.addTail(4);  // Tambah elemen 4 di akhir list
//        list.addMid(1, 7); // Tambah elemen 7 di index 1
//        list.addMid(1, 8); // Tambah elemen 8 di index 1
//        list.addHead(5);  // Tambah elemen 5 di awal list
//
//        // Menampilkan elemen dalam list
//        list.displayElement(); // Output: 5 3 8 7 4
//    }
//}


package Pertemuan4;

public class ListTest {
    public static void main(String[] args) {
        // Uji coba pertama: menghasilkan 2.1 3.4 4.5
        StrukturList list1 = new StrukturList();
        list1.addHead(2.1);
        list1.addTail(3.4);
        list1.addTail(4.5);

        System.out.print("List 1: ");
        list1.displayElement(); // Output: 2.1 3.4 4.5

        // Uji coba kedua: menghasilkan 3.4 2.1 1.1 4.5 5.5
        StrukturList list2 = new StrukturList();
        list2.addTail(3.4);
        list2.addMid(1, 2.1);
        list2.addMid(2, 1.1);
        list2.addTail(4.5);
        list2.addTail(5.5);

        System.out.print("List 2: ");
        list2.displayElement(); // Output: 3.4 2.1 1.1 4.5 5.5
    }
}

