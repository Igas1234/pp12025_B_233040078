package Pertemuan11;

public class QueueMain { public static void main(String[] args){
      StrukturQueue queue = new StrukturQueue();

        System.out.println("\n\n");

        // ===== LATIHAN 1: Enqueue =====
        System.out.println("==== LATIHAN 1: Enqueue ====");
        queue.enqueue(2);
        queue.enqueue(7);
        queue.enqueue(6);
        queue.enqueue(1);

        System.out.println("\n\n");

        // ===== LATIHAN 2: isEmpty check sebelum dan sesudah enqueue =====
        System.out.println("==== LATIHAN 2: isEmpty ====");
        StrukturQueue tempQueue = new StrukturQueue();
        System.out.println("Sebelum enqueue, isEmpty: " + tempQueue.isEmpty());
        tempQueue.enqueue(5);
        System.out.println("Setelah enqueue, isEmpty: " + tempQueue.isEmpty());

        System.out.println("\n\n");

        // ===== LATIHAN 3: size() dan front() =====
        System.out.println("==== LATIHAN 3: size() dan front() ====");
        System.out.println("Size: " + queue.size());
        System.out.println("Front: " + queue.front());

        System.out.println("\n\n");

        // ===== LATIHAN 4: Simulasi Enqueue 3x ====
        System.out.println("==== LATIHAN 4: Simulasi Enqueue 3x ====");
        StrukturQueue q4 = new StrukturQueue();
        System.out.println("### Sebelum Enqueue 3x ###");
        System.out.println("size: " + q4.size());
        System.out.println("isEmpty: " + q4.isEmpty());

        System.out.println("\n### Enqueue 3x ###");
        q4.enqueue(3);
        q4.enqueue(7);
        q4.enqueue(10);
        System.out.println("size: " + q4.size());
        System.out.println("isEmpty: " + q4.isEmpty());
        System.out.println("Front: " + q4.front());

        System.out.println("\n\n");

        // ===== LATIHAN 5: displayElements ====
        System.out.println("==== LATIHAN 5: displayElements ====");
        StrukturQueue q5 = new StrukturQueue();

        System.out.println("### Sebelum Enqueue 4x ###");
        System.out.println("size: " + q5.size());
        System.out.println("isEmpty: " + q5.isEmpty());
        q5.displayElements();

        System.out.println("\n### Enqueue 4x ###");
        q5.enqueue(2);
        q5.enqueue(7);
        q5.enqueue(6);
        q5.enqueue(1);
        System.out.println("size: " + q5.size());
        System.out.println("isEmpty: " + q5.isEmpty());
        q5.displayElements();
        System.out.println("Front: " + q5.front());

        System.out.println("\n\n");

        // ===== TUGAS: Dequeue dan tampilkan ulang =====
        System.out.println("==== TUGAS: Dequeue ====");
        System.out.println("### Dequeue 2x ###");
        q5.dequeue();
        q5.dequeue();

        System.out.println("Size: " + q5.size());
        System.out.println("isEmpty: " + q5.isEmpty());
        q5.displayElements();
        System.out.println("Front: " + q5.front());
    }
}
