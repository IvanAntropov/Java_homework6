public class Program {
    public static void main(String[] args) {
        Tree root = new Tree(1);
        Tree l1 = new Tree(2);
        Tree r1 = new Tree(3);
        Tree r1l1 = new Tree(6);
        Tree r1r1 = new Tree(7);
        Tree l1l1 = new Tree(4);
        Tree l1r1 = new Tree(5);
        r1.left = r1l1;
        r1.right = r1r1;
        l1.left = l1l1;
        l1.right = l1r1;
        root.left = l1;
        root.right = r1;

        Printer.print1(root,"");
        Printer.print2(root);

        System.out.println("\nPre-order");
        Walker1.Walk(root);
        System.out.println("\nPost-order");
        Walker2.Walk(root);
        System.out.println("\nIn-order");
        Walker3.Walk(root);
    }
}

class Tree {
    int value;
    public Tree(int val){
        this.value = val;
    }
    public int getValue(){
        return this.value;
    }
    Tree left;
    Tree right;
}

class Printer {
    static void print1(Tree tree,String bracer){
        if(tree != null){
            System.out.println(bracer + tree.getValue());
            if(tree.left != null) {
                print1(tree.left, bracer+"  ");
            }
            if(tree.right != null) {
                print1(tree.right, bracer+"  ");
            }
        }
    }

    static void print2(Tree tree){
        if(tree != null){
            System.out.printf(tree.getValue() + "(");
                if(tree.left != null) {
                    print2(tree.left);
                }
                if(tree.right != null) {
                    print2(tree.right);
                }
                System.out.printf(")");

        }
    }
}

class Walker1 {
    static void Walk(Tree tree){
        if(tree != null){
            System.out.printf(" "+tree.getValue());
            if(tree.right != null) {
                Walk(tree.right);
            }
            if(tree.left != null) {
                Walk(tree.left);
            }
        }
    }
}

class Walker2 {
    static void Walk(Tree tree){
        if(tree.right != null) {
            Walk(tree.right);
        }
        if(tree.left != null) {
            Walk(tree.left);
        }
        if(tree != null){
            System.out.printf(" "+tree.getValue());
        }
    }
}

class Walker3 {
    static void Walk(Tree tree){
        if(tree.right != null) {
            Walk(tree.right);
        }
        if(tree != null){
            System.out.printf(" "+tree.getValue());
        }
        if(tree.left != null) {
            Walk(tree.left);
        }
    }
}