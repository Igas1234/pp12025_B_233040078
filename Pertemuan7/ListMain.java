package Pertemuan7;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        // list.addHead(2);
        // list.addHead(9);
        // list.addHead(7);

        // System.out.println("Element: ");
        // list.displayElement();

        // System.out.println("\n\nElement setelah di removeHead ");
        // list.removeHead();
        // list.displayElement();
        
        // System.out.println("\n\nElement setelah di removeHead ");
        // list.removeHead();
        // list.displayElement();


// ------------------------------------------------------------------------------------------------------------------------
        // Latihan 4 modul 4

        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        list.addTail(5);
        list.addTail(1);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println("\n\nElement setelah di removeTail ");
        list.removeTail();
        list.displayElement();
        
        System.out.println("\n\nElement setelah di removeHead ");
        list.removeHead();
        list.displayElement();

        System.out.println("\n\nElement setelah di removeHead ");
        list.removeTail();
        list.displayElement();


    }
}