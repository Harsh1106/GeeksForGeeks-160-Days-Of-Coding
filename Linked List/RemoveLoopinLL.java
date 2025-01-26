public class RemoveLoopinLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void removeLoop(Node head) {
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast == null || fast.next == null) return;
        slow = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        Node newLoop = slow;
        Node temp = newLoop;
        while(temp.next != newLoop) temp = temp.next;
        temp.next = null;
    }
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = head.next.next;

        System.out.println("Loop created in the linked list.");
        
        removeLoop(head);

        System.out.println("Linked list after removing the loop:");
        printList(head);
    }
}
