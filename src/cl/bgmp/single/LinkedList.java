package cl.bgmp.single;

public class LinkedList {
    private Node origin = null;

    public LinkedList() {
    }

    public void addStart(int element) {
        Node newNode = new Node(element);
        if (origin != null) newNode.setNext(origin);
        this.origin = newNode;
    }

    public void addLast(int element) {
        Node newNode = new Node(element);

        if (this.origin == null) {
            this.origin = newNode;
        } else {
            Node instance = this.origin;

            while (instance.getNext() != null) {
                instance = instance.getNext();
            }

            instance.setNext(newNode);
        }
    }

    public boolean find(int element) {
        Node instance = this.origin;

        while (instance != null) {
            if (instance.getElement() == element) {
                return true;
            } else {
                instance = instance.getNext();
            }
        }

        return false;
    }

    public void remove(int element) {
        if (this.find(element)) {
            if (this.origin.getElement() == element) {
                origin = origin.getNext();
            } else {
                Node instance = this.origin.getNext();
                Node previous = this.origin;

                while (instance != null) {
                    if (instance.getElement() == element) {
                        previous.setNext(instance.getNext());
                    } else {
                        previous = previous.getNext();
                    }
                    instance = instance.getNext();
                }
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node instance = this.origin;

        while (instance != null) {
            builder.append(instance.toString());
            instance = instance.getNext();
        }

        return builder.toString();
    }
}
