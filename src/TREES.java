import java.util.Scanner;

//BST
public class TREES{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TREES tree = new TREES();
        tree.populate(sc);
        tree.display();
    }
    public TREES(){

    }
    private static class Node{
        int value;
        Node left;
        Node right;

        public Node(int value){
            this.value = value;
        }
    }

    private Node root;

    //insert elements into the tree
    public void populate(Scanner sc){
        System.out.println("Enter the root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc,root);// here we are entering the value of the left and right side of the tree (ROOT)
    }

    private void insert(Scanner scanner, Node node) {
        System.out.println("Do you want to enter left of "+node.value);
        boolean left =scanner.nextBoolean();//input true or false
        if(left){
            System.out.println("Enter the value of left of "+node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);// adding the left node of NODE(root)
            insert(scanner,node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            insert(scanner, node.right);
        }
    }

    public void display() {
        display(this.root, "");
    }
    public void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }


    public void Pretty_display(){
        Pretty_display(root,0);
    }

    private void Pretty_display(Node node, int level){
        if (node == null) {
            return;
        }

        Pretty_display(node.right, level+1);
        if(level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------->" + node.value);
        }
        else{
            System.out.println(node.value); // only for root node
        }

        Pretty_display(node.left, level+1);
    }

    //TRAVERSALS
    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.value+" ");//root
        preorder(node.left);//left
        preorder(node.right);//right
    }


    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null){
            return;
        }
        inorder(node.left);//left
        System.out.print(node.value+" ");//root
        inorder(node.right);//right
    }

    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null){
            return;
        }
        postorder(node.left);//left
        postorder(node.right);//right
        System.out.print(node.value+" ");//root
    }


}
