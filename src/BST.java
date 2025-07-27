public class BST {
    public class Node{
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value){
            this.value = value;
        }

        public int getValue(){
            return value;
        }
    }

    private Node root;

    public BST(){
       // this is the basic constructor
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void display(){
        display(this.root,"root node: ");
    }

    private void display(Node node , String details){
        if(node == null){
            return;
        }
        System.out.println(details + node.value);
        display(node.left ,"left child of "+node.getValue()+" : ");
        display(node.right ,"right child of "+node.getValue()+" : ");
    }

    public void insert(int value){
       root = insert(value,root);
    }
    private Node insert(int value,Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        // left me insert tabhi karenge jab root se chota hoga
        if(value<node.value){
            node.left = insert(value,node.left);
        }

        // warna bada hua toh right me insert
        if(value>node.value){
            node.right = insert(value,node.right);
        }

        node.height = Math.max(height(node.left) , height(node.right)) +1;

        return node;
    }

    //inserting multiple items
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    //populate sorted array into bst
    public void populate_sorted(int[] nums){
        populate_sorted(nums,0,nums.length-1);
    }
    private void populate_sorted(int[] nums , int start, int end){
       if(start > end) {
           return;
       }

       int mid = start + (end-start)/2;

       this.insert(nums[mid]);// add the mid then move left and right respectively
        populate_sorted(nums,start,mid-1);
        populate_sorted(nums,mid+1,end);

    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1 && balanced(node.left) && balanced(node.right);
        // check whether the diff in height at the same level is 1 or less than 1 , and do the same for the sub tree
    }

}
