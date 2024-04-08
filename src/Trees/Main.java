package Trees;

public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(55);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(10);
        intTree.insert(15);
        intTree.insert(32);

        intTree.traverseInOrder();
    }
}
