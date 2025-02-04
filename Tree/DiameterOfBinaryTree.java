class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
public class DiameterOfBinaryTree {
    static int diameterFind(Node root, int[] res){
        if(root == null) return 0;
        int lh = diameterFind(root.left, res);
        int rh = diameterFind(root.right, res);
        res[0] = Math.max(res[0], lh + rh);
        return 1 + Math.max(lh, rh);
    }
    static int diameter(Node root) {
        int[] rs = new int[1];
        diameterFind(root, rs);
        return rs[0];
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        System.out.println(diameter(root));
    }
}
