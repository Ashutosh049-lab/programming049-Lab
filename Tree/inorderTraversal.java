package Tree;


class Node{
    int data;
    Node left,right;


    public Node(int data){
        this.data=data;
        left=right=null;
    }

}


public class inorderTraversal {

    Node root;

    inorderTraversal(){
        root=null;
    }

    void InorderTraversal(Node node){

        if(node==null){
            return;
        }

        //1.traversal the left subtree
        InorderTraversal(node.left);
        //2.print data
        System.out.print(node.data+" ");
        //3.traversal the left subtree
        InorderTraversal(node.right);

    }

    
        public static void main(String [] args){

        inorderTraversal tree=new inorderTraversal();



         tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.left.left=new Node(4);
        tree.root.left.right=new Node(5);
        tree.root.right=new Node(3);
        tree.root.right.left=new Node(6);
        tree.root.right.right=new Node(7);

        System.out.println("Inorder Traversal of a given tree is:");
        tree.InorderTraversal(tree.root);
        System.out.println(" ");

    }

}
