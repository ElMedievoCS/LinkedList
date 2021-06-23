package cl.bgmp.single;

public class Node {
    private int element;
    private Node next = null;

    public Node(int element) {
        this.element = element;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public int getElement() {
        return this.element;
    }

    @Override
    public String toString() {
        return element + "--->";
    }
}
