//import com.tree;
import com.tree.BinaryTree;

public class Tree {

    public static void main(String[] args){

        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);

        tree.inorder();
        tree.preorder();
        tree.postorder();

    }
}
