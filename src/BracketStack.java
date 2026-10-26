//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class BracketStack {
    private Node top;

    private class Node {
        char data;
        Node next;
        Node(char d) {
            data = d;
            next = null;
        }
    }

    public BracketStack() {
        top = null;
    }

    public void push(char val) {
        Node n = new Node(val);
        n.next = top;
        top = n;
    }

    public char pop() {
        if (isEmpty()) return '\0';
        char val = top.data;
        top = top.next;
        return val;
    }

    public char peek() {
        if (isEmpty()) return '\0';
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}