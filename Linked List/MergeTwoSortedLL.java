public class MergeTwoSortedLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node sortedMerge(Node head1, Node head2) {
        if(head1 == null) return head2;
        if(head2 == null) return head1;
        Node temp = null;
        if(head1.data < head2.data){
            temp = head1;
            head1 = head1.next;
        }
        else{
            temp = head2;
            head2 = head2.next;
        }
        Node newNode = temp;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                temp.next = head1;
                head1 = head1.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        if(head1 == null) temp.next = head2;
        if(head2 == null) temp.next = head1;
        return newNode;
    }
    public static void main(String[] args) {
        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next = new Node(40);
       
        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        System.out.println("Original Linked List:");
        Node temp = head1;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head1 = sortedMerge(head1, head2);
    
        System.out.println("\nReversed Linked List:");
        temp = head1;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
