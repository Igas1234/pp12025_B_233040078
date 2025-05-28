package Pertemuan13;

public class Graph {

    private Vertex vertexList[]; // array untuk menyimpan simpul (vertex)
    private int adjMat[][];     // matriks ketetanggaan (adjacency matrix)
    private int nVerts;         // jumlah simpul saat ini

    // Constructor Graph dengan parameter jumlah maksimum simpul
    public Graph(int maxVerts) {
        vertexList = new Vertex[maxVerts];        // inisialisasi array simpul
        adjMat = new int[maxVerts][maxVerts];     // inisialisasi matriks ketetanggaan
        nVerts = 0;                               // awalnya belum ada simpul

        // Mengisi semua elemen matriks ketetanggaan dengan 0
        for(int i = 0; i < maxVerts; i++) {
            for(int j = 0; j < maxVerts; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(char lab) {
    // Menambahkan simpul baru ke dalam graf
    vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end) {
    // Menambahkan sisi/edge antara dua simpul dalam graf tak berarah
    adjMat[start][end] = 1;
    adjMat[end][start] = 1;
    }


        public void adjacencyMatrix() {
            for (int i = 0; i < adjMat.length; i++) {
                for (int j = 0; j < adjMat[0].length; j++) {
                        System.out.print(adjMat[i][j] + " ");
                            }
                                System.out.println();
                                    }
                                        }
}


