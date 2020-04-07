public class BinarySearchTree {
    private BstNode root;

    public boolean isEmpty() {
        boolean isEmptyConclude = false;
        if (this.root == null) {
            isEmptyConclude = true;
        }
        return isEmptyConclude;
    }

    public void insertBst(Integer value) {
        System.out.println("Insert : " + value);
        if (isEmpty()) {
            this.root = new BstNode(value);
            System.out.println("Insert successfully!");
        } else {
            insertNode(this.root, value);
            System.out.println("Insert successfully!");
        }
    }

    public BstNode insertNode(BstNode root, Integer value){
        BstNode tempNode = null;
        Integer rootValue = root.getData();
        if (value<=rootValue){
            if (root.getLeft() == null){
                root.setLeft(new BstNode(value));
                return root.getLeft();
            }else {
                tempNode = root.getLeft();
            }
        }else {
            if (root.getRight() == null){
                root.setRight(new BstNode(value));
                return root.getRight();
            } else {
                tempNode = root.getRight();
            }
        }
        return insertNode(tempNode,value);
    }

    public void doPostOrder(BstNode root){
        if (root == null){
            return;
        } else {
            doPostOrder(root.getLeft());
            doPostOrder(root.getRight());

            System.out.print(root.getData() + " ");
        }
    }

    public void postOrder(){
        doPostOrder(this.root);
    }


}
