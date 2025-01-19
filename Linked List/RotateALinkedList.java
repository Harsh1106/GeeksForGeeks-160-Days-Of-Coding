public class RotateALinkedList {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node rotate(Node head, int k) {
        int len = 1;
        Node temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }
        k = k % len;
        if(k == 0) return head;
        temp.next = head;
        temp = head;
        for(int i = 1 ; i < k ; i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
    public static void main(String[] args) {
        int k = 4;
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next = new Node(40);
        head.next.next = new Node(50);

        System.out.println("Original Linked List:");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head = rotate(head, k);

        System.out.println("\nReversed Linked List:");
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
