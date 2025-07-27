import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TREES trees = new TREES();
        trees.populate(sc);
        trees.display();
        trees.Pretty_display();
//        trees.preorder();
//        System.out.println();
        trees.inorder();
//        System.out.println();
//        trees.postorder();

//        BST tree = new BST();
//        int[] nums ={5,2,1,7,3}; // if the array is sorted , it creates a linked list jesa bt/unbalanced/skewed
//        tree.populate(nums);
//        tree.display();

//        BST tree2 = new BST();
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        tree2.populate_sorted(arr);
//        tree2.display();


    }
}
