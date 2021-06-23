package cl.bgmp;

import cl.bgmp.single.LinkedList;

public class Main {

    public static void main(String[] args) {
        testLinkedList();
    }

    public static void testLinkedList() {
        LinkedList list = new LinkedList();
        list.addStart(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addStart(7);


        int find = 5;
        boolean found = list.find(find);
        System.out.println(list.toString());
        if (found) {
            System.out.println("Elemento encontrado: " + find);
        } else {
            System.out.println("Elemento no encontrado: " + find);
        }

        int remove = 4;
        System.out.println(list.toString());
        list.remove(remove);
        System.out.println("Elemento eliminado: " + remove);
        System.out.println(list.toString());
    }

    public void testDoubleLinkedList() {

    }
}
