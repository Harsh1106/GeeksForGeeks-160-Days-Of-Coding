public class FindtheFirstNodeofLoopinLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node findFirstNode(Node head) {
        Node fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Node first = new Node(1);
        Node third = new Node(3);
        Node second = new Node(2);
        Node fourth = new Node(4);
        Node fifth = new Node(5);
        first.next = third;
        third.next = second;
        second.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        Node loopNode = findFirstNode(first);
        if (loopNode != null) {
            System.out.println("The first node of the loop is: " + loopNode.data);
        } else {
            System.out.println("No loop found in the linked list.");
        }
    }
}
