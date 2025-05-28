package Pertemuan13;

public class GraphMain {

    public static void main(String[] args) {
        Graph graph = new Graph(5); // Membuat objek graf dengan maksimal 5 simpul

        // menambahkan vertex
        graph.addVertex('A'); // index 0 (start for dfs)
        graph.addVertex('B'); // index 1
        graph.addVertex('C'); // index 2
        graph.addVertex('D'); // index 3
        graph.addVertex('E'); // index 4

        // menambahkan edge
        graph.addEdge(0, 1); // A-B
        graph.addEdge(1, 2); // B-C
        graph.addEdge(0, 3); // A-D
        graph.addEdge(3, 4); // D-E

        graph.adjacencyMatrix(); // Menampilkan matriks ketetanggaan
        System.out.println(); // Baris kosong
System.out.println("-------------------------------------------------------------------------------------");

        Graph graph1 = new Graph(4); // hanya 4 simpul: A, B, C, D

        // menambahkan vertex
        graph1.addVertex('A'); // index 0
        graph1.addVertex('B'); // index 1
        graph1.addVertex('C'); // index 2
        graph1.addVertex('D'); // index 3

        // menambahkan edge sesuai gambar
        graph1.addEdge(0, 1); // A-B
        graph1.addEdge(0, 2); // A-C
        graph1.addEdge(0, 3); // A-D
        graph1.addEdge(1, 3); // B-D

        graph1.adjacencyMatrix(); // mencetak matriks ketetanggaan
        System.out.println();
    }
}


