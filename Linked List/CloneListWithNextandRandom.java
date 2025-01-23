import java.util.HashMap;
import java.util.Map;

public class CloneListWithNextandRandom {
    static class Node {
        int data;
        Node next;
        Node random;
    
        Node(int x) {
            data = x;
            next = null;
            random = null;
        }
    }
    public static Node cloneLinkedList(Node head) {
        Map<Node, Node> node = new HashMap<>();
        Node dummy = new Node(0);
        Node curr = head;
        Node currClone = dummy;
        while(head != null){
            Node clone = new Node(head.data);
            currClone.next = clone;
            node.put(head, clone);
            currClone = clone;
            head = head.next;
        }
        Node clone = dummy.next;
        while(curr != null){
            if(curr.random != null){
                clone.random = node.get(curr.random);
            }
            clone = clone.next;
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        CloneListWithNextandRandom.Node head = new CloneListWithNextandRandom.Node(1);
        head.next = new CloneListWithNextandRandom.Node(2);
        head.next.next = new CloneListWithNextandRandom.Node(3);
        head.next.next.next = new CloneListWithNextandRandom.Node(4);

        head.random = head.next.next; 
        head.next.random = head;     
        head.next.next.random = head.next.next.next; 
        head.next.next.next.random = head.next;  

        CloneListWithNextandRandom.Node clonedHead = CloneListWithNextandRandom.cloneLinkedList(head);

        System.out.println("Original List:");
        printList(head);

        System.out.println("Cloned List:");
        printList(clonedHead);
    }

    private static void printList(CloneListWithNextandRandom.Node head) {
        CloneListWithNextandRandom.Node temp = head;
        while (temp != null) {
            System.out.print("Data: " + temp.data);
            if (temp.random != null) {
                System.out.print(", Random: " + temp.random.data);
            } else {
                System.out.print(", Random: null");
            }
            System.out.println();
            temp = temp.next;
        }
    }
}
