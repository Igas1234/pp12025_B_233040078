package Pertemuan10;

public class ListMkTest {
    public static void main(String[] args) {
//      latihan 4
System.out.println("latihan 4");
        StrukturMatakuliah list = new  StrukturMatakuliah();
        list.addHead(new Matakuliah("if001","dasar pemrograman",4));
        list.addHead(new Matakuliah("if002","pemrograman web",3));
        list.displayElement();

// Tes-1
System.out.println("Test1");
    StrukturMatakuliah test1 = new  StrukturMatakuliah();
    test1.addHead(new Matakuliah("if001","dasar Pemrograman ",4));
    test1.addHead(new Matakuliah("if002","Dasar web",3));
    test1.addHead(new Matakuliah("if003","Struktur Diskrit",3));
    test1.addHead(new Matakuliah("if004","Konstruksi PL Berorientasi Objek",3));
    test1.displayElement();


        // Tes-4
    System.out.println("Test-4");
    StrukturMatakuliah test4 = new  StrukturMatakuliah();
    test4.addTail(new Matakuliah("IF002, ", "Pemrograman Web, ", 3));
    test4.addTail(new Matakuliah("IF001, ", "Dasar Pemrograman, ", 4));
    test4.addHead(new Matakuliah("IF004, ", "Konstruksi PL Berorientasi Objek, ", 3));
    test4.addMid(new Matakuliah("IF003, ", "Struktur Dekrit, ", 3), 2);        test4.displayElement();


    }
}
