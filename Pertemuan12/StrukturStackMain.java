package Pertemuan12;

public class StrukturStackMain {
     public static void main(String[] args) {
        StrukturStack stack = new StrukturStack(3);
        System.out.println("#Sebelum PUSH");
        stack.printStack();

        System.out.println("#Setelah PUSH 3x");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.printStack();

        System.out.println("#Setelah POP 1x");
        stack.pop();
        stack.printStack();
    }
}
