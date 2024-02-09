import java.util.Arrays;

public class SinglyLinkedList {
    private Node head, tail;
    private int size;

    public SinglyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int first() {
        if (isEmpty()) {
            return -1;
        }
        return head.getElement();
    }

    public int last() {
        if (isEmpty()) {
            return -1;
        }
        return tail.getElement();
    }

    public void addFirst(int element) {
        head = new Node(element, head);
        if (size == 0) {
            tail = head;
        }
        size++;
    }

    public void addLast(int element) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.setNext(newest);
        }
        tail = newest;
        size++;
    }

    public void addMiddle(int element, int pos) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            Node temp = head;
            for (int i = 0; i < pos - 2; i++) {
                temp = temp.getNext();
            }
            newest.setNext(temp.getNext());
            temp.setNext(newest);
        }
        size++;
    }

    public int removeFirst() {
        if (isEmpty()) {
            return -1;
        }
        int answer = head.getElement();
        head = head.getNext();
        size--;

        return answer;
    }

    public void removeMiddle(int pos) {


        if (pos < 1 || pos > size) {
            //invalid
            return;
        }
        if (pos == 1) {
            head = head.getNext();
            return;
        }
        Node temp = head;
        for (int i = 0; i < pos - 2; i++) {
            temp = temp.getNext();
        }
        temp.setNext(temp.getNext().getNext());

        size--;
    }

    public int removeLast() {
        if (isEmpty()) {
            return -1;
        }
        int answer = tail.getElement();
        Node temp = head;
        while (temp.getNext().getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(null);
        size--;
        return answer;
    }

    public void sort() {
        Node temp = head;
        int[] ary = new int[size];
        int i = 0;
        while (temp != null) {
            ary[i++] = temp.getElement();
            temp = temp.getNext();
        }
        Arrays.sort(ary);
        temp = head;
        i = 0;
        while (temp != null) {
            temp.setElement(ary[i++]);
            temp = temp.getNext();
        }
    }

    public void reverse() {
        Node current = head, prev = null, next;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }

        head = prev;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void showList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getElement() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

}