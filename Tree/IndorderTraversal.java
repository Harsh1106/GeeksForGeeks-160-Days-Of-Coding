import java.util.ArrayList;

public class IndorderTraversal {
    static ArrayList<Integer> al = new ArrayList<>();
    ArrayList<Integer> inOrder(Node root) {
        if(root == null)  return al;
        inOrder(root.left);
        al.add(root.data);
        inOrder(root.right);
        return al;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        
        IndorderTraversal obj = new IndorderTraversal();
        ArrayList<Integer> res = obj.inOrder(root);
        for(int i : res) System.out.print(i + " ");
    }
}
