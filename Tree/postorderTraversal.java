package Tree;

public class postorderTraversal {

    Node root;

    postorderTraversal() {
        root = null;
    }

    void PostorderTraversal(Node node) {

        if (node == null) {
            return;
        }


        //1. traversal the left subtree
        PostorderTraversal(node.left);

        //2. traversal the right subtree
        PostorderTraversal(node.right);
        //3.print data
        System.out.print(node.data + " ");

    }





    public static void main(String[] args) {

        postorderTraversal tree = new postorderTraversal();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Postorder Traversal of a given tree is:");
        tree.PostorderTraversal(tree.root);
        System.out.println(" ");

    }
}
