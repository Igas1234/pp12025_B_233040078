package Pertemuan7;

public class ListMain {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();

        list.addHead(2);
        list.addHead(9);
        list.addHead(7);

        System.out.println("Element: ");
        list.displayElement();

        System.out.println("\n\nElement setelah di removeHead ");
        list.removeHead();
        list.displayElement();
        
        System.out.println("\n\nElement setelah di removeHead ");
        list.removeHead();
        list.displayElement();

        System.out.println("\n\nElement setelah di removeHead ");
        list.removeHead();
        list.displayElement();
    }
}