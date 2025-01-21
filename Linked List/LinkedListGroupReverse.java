public class LinkedListGroupReverse {
    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node reverseKGroup(Node head, int k) {
        int len = getLen(head);
        Node origH = null, origT = null, tmpH = null, tmpT = null, curr = head;
        while(len > 0){
            int j = k;
            j = Math.min(j, len);
            while(j > 0){
                Node nex = curr.next;
                if(tmpH == null){
                    tmpH = curr;
                    tmpT = curr;
                }
                else{
                    curr.next = tmpH;
                    tmpH = curr;
                }
                curr = nex;
                j--;
                len--;
            }
            if(origH == null){
                origH = tmpH;
                origT = tmpT;
            }
            else{
                origT.next = tmpH;
                origT = tmpT;
            }
            tmpH = null;
            tmpT = null;
        }
        origT.next = null;
        return origH;
    }
    public static int getLen(Node head){
        int len = 0;
        while(head != null){
            len++;
            head = head.next;
        }
        return len;
    }

    public static void main(String[] args) {
        int k = 4;
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(2);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        head.next.next.next.next.next.next.next = new Node(8);

        System.out.println("Original Linked List:");
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        head = reverseKGroup(head, k);
    
        System.out.println("\nReversed Linked List:");
        temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
