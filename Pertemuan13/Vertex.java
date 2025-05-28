package Pertemuan13;

public class Vertex {
    private char label;
    private boolean wasVisited;

    public Vertex(char lab){
        label = lab;
        wasVisited = false;
    }

    public char getlabel(){
    return label;
    }

    public void setlabel(char label){
        this.label = label;
    }

     public boolean getwasVisited() {
        return wasVisited;
    }

    public void setwasVisited(Boolean wasVisited) {
        this.wasVisited = wasVisited;
    }
}
