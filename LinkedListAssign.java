class Node {
    int data;
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    Node head;
    public LinkedList() {
        this.head = null;
    }
    public void removeAfter(Node node) {
        if (node == null || node.next == null)
            return;
        node.next = node.next.next;
    }

    public LinkedList copy() {
        LinkedList newList = new LinkedList();
        Node current = head;
        while (current != null) {
            newList.append(current.data);
            current = current.next;
        }
        return newList;
    }
    public void removeDuplicate(String key) {
        Node current = head;
        Node prev = null;
        while (current != null) {
            if (String.valueOf(current.data).equals(key)) {
                if (prev == null) {
                    head = current.next;
                } else {
                    prev.next = current.next;
                }
            } else {
                prev = current;
            }
            current = current.next;
        }
    }
    public int max() {
        if (head == null)
            return 0;
        int max = head.data;
        Node current = head.next;
        while (current != null) {
            if (current.data > max)
                max = current.data;
            current = current.next;
        }
        return max;
    }
    public void append(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Node(data);
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class LinkedListAssign {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(2);
        list.append(4);

        System.out.println("First list:");
        list.display();
        list.removeAfter(list.head.next);
        System.out.println("Removed node 2:");
        list.display();

        LinkedList newList = list.copy();
        System.out.println("Copied list:");
        newList.display();
        list.removeDuplicate("2");
        System.out.println("Removed duplicate '2':");
        list.display();

        System.out.println("Max: " + list.max());
    }
}
