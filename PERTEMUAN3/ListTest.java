package PERTEMUAN3;

public class ListTest {
		 
		public static void main(String[] args) {
			StrukturList list= new StrukturList();
//			list.addTail(3);
//			list.addTail(4);
//			list.addTail(5);
			
			list.addHead(1);
			list.addHead(2);
			list.addHead(3);

			System.out.print("Elemen: ");
			list.displayElement();
			}
	}


