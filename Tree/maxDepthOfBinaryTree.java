package Tree;

public class maxDepthOfBinaryTree {
    Node root;

    public int maxDepth(Node root){

        if(root==null){
            return 0;
        }else{
            int lDepth=maxDepth(root.left);
            int rDepth=maxDepth(root.right);

            if(lDepth > rDepth){
                return lDepth+1;
            }else{
                return rDepth+1;
            }
        }
    }


    public static void main(String [] args){

        maxDepthOfBinaryTree tree=new maxDepthOfBinaryTree();

        tree.root=new Node(1);
        tree.root.left=new Node(2);
        tree.root.right=new Node(3);
        tree.root.right.left=new Node(4);
        tree.root.right.right=new Node(5);

        System.out.println(" "+tree.maxDepth(tree.root));
    }

}
