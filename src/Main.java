public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insertBst(8);
        bst.insertBst(10);
        bst.insertBst(12);
        bst.insertBst(6);
        bst.insertBst(30);
        bst.insertBst(3);
        bst.insertBst(7);
        bst.insertBst(9);
        bst.postOrder();
    }
}
