class Solution {
    // Function to return maximum path sum from any node in a tree.
    private int maxSum;
    public Solution(){
        maxSum = Integer.MIN_VALUE;
    }
    int findSum(Node node){
        if(node == null) return 0;
        int l = Math.max(0, findSum(node.left));
        int r = Math.max(0, findSum(node.right));
        maxSum = Math.max(maxSum, node.data + l + r);
        return node.data + Math.max(l, r);
    }
    int findMaxSum(Node node) {
        findSum(node);
        return maxSum;
    }
}
public class Maximumpathsumfromanynode {
    public static void main(String[] args) {
        Solution obj = new Solution();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(obj.findMaxSum(root));
    }
}
