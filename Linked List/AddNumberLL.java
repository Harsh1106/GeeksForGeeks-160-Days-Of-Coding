public class AddNumberLL {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node addTwoLists(Node num1, Node num2) {
        Node l1 = rev(num1);
        Node l2 = rev(num2);
        int carry = 0;
        Node curr = null;
        while(l1 != null || l2 != null || carry > 0){
            int v1 = l1 != null ? l1.data : 0;
            int v2 = l2 != null ? l2.data : 0;
            int sum = v1 + v2 + carry;
            carry = sum / 10;
            Node temp = new Node(sum % 10);
            temp.next = curr;
            curr = temp;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        while(curr != null && curr.data == 0) curr = curr.next;
        return curr;
    }
    static Node rev(Node head){
        Node temp = null;
        while(head != null){
            Node nex = head.next;
            if(temp == null){
                temp = head;
                temp.next = null;
            }
            else{
                head.next = temp;
                temp = head;
            }  
            head = nex;
        }
        return temp;
    }
    public static void main(String[] args) {
        Node head1 = new Node(4);
        head1.next = new Node(5);
        Node head2 = new Node(3);
        head2.next = new Node(4);
        head2.next.next = new Node(5);

        Node head = addTwoLists(head1, head2);

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
