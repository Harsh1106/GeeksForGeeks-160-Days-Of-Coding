class ReverseALinkedList {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverseListUsingStack(Node head) {
        java.util.Stack<Integer> st = new java.util.Stack<>();
        Node temp = head;
        while(temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            temp.data = st.pop();
            temp = temp.next;
        }
        return head;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;
        while(current != null){
            Node nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        System.out.println("Original Linked List:");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head = reverseList(head);

        System.out.println("\nReversed Linked List:");
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}