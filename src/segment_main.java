class segment_main {
    public static void main(String[] args) {
            int[] arr =  {3,8,7,6,-2,-8,4,9};
            SegmentTree trees = new SegmentTree(arr);
            trees.display();
        System.out.println(trees.query(0,3));
    }
}
