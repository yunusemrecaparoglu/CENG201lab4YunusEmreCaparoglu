//Yunus Emre Çaparoğlu
//240444044
//26.10.2026

public class TokenStack {
    private Node top;

    private class Node {
        String data;
        Node next;
        Node(String d) {
            data = d;
            next = null;
        }
    }

    public TokenStack() {
        top = null;
    }

    public void push(String val) {
        Node n = new Node(val);
        n.next = top;
        top = n;
    }

    public String pop() {
        if (isEmpty()) return null;
        String val = top.data;
        top = top.next;
        return val;
    }

    public boolean isEmpty() {
        return top == null;
    }
}