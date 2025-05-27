package Pertemuan12.modul10;

public class MyStack extends AbstrackStack{ 
    // Constructor
    public MyStack (int capacity) { 
        super (capacity); 
    } 

public void displayStack (String m) { 
    System.out.println(m); 
    System.out.println("Stack (bottm-->):"); 
    for (int i = 0; i < size(); i++) { 
        System.out.println(peekN(i)); 
        System.out.println(' '); 
    }   
    System.out.println(""); 
} 

    public int peekN(int n) { 
        return array[n]; 
    } 
}
