package treeDemo;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(10);
        tree.insert(13);
        tree.insert(20);
        tree.insert(14);
        tree.insert(7);
        tree.insert(9);
        tree.insert(11);
        tree.insert(15);

        tree.inorder(); //call inorder method which will call inorderRec method

    }
}
