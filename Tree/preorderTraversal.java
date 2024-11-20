package Tree;

public class preorderTraversal {
    Node root;

    preorderTraversal() {
        root = null;
    }

    void PreorderTraversal(Node node) {

        if (node == null) {
            return;
        }

        //1.print data
        System.out.print(node.data + " ");
        //2.traversal the left subtree
        PreorderTraversal(node.left);

        //3. traversal the right subtree
        PreorderTraversal(node.right);

    }





    public static void main(String[] args) {

        preorderTraversal tree = new preorderTraversal();


        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right = new Node(3);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        System.out.println("Preorder Traversal of a given tree is:");
        tree.PreorderTraversal(tree.root);
        System.out.println(" ");

    }

}

