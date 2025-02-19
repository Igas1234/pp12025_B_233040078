package tugas;


public class Nodemain {
    public static void main(String[] args) {
        // Membuat 2 buah node n1 dan n2	
//    	//NODE A
//        Node n1 = new Node(5);
//        Node n2 = new Node(7);
//        Node n3 = new Node(9);
//        Node n4 = new Node(8);
//
//        // Menghubungkan node n1 ke n2
//        //Node A
//        n1.setNext(n2);
//        n2.setNext(n3);
//        n3.setNext(n4);
//  
//      	//NODE B
    	Node n1 = new Node(2);
    	Node n2 = new Node(3);
      	Node n3 = new Node(5);
      	Node n4 = new Node(7);
      	Node n5 = new Node(9);
      	
      	n1.setNext(n2);
      	n2.setNext(n3);
      	n3.setNext(n4);
      	n4.setNext(n5);

      	// Menggunakan pointer p untuk menelusuri node
        Node p = n1;
        while (p != null) {
            System.out.println(p.getNilai());
            p = p.getNext();
        }
    }
}
