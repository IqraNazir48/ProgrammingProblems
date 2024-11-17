public class SearchInABinarySearchTree {
    TreeNode root;
    public static class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean searchBST(TreeNode root, int val) {
        if(root==null){
            return false;
        }
        TreeNode current=root;
        while(current!=null){
            if(val==current.val){
                return true;
            }
            else if(val>current.val){
                current=current.right;
            }
            else{
                current=current.left;
            }
        }
        return false;
    }
    public TreeNode insert(int data, TreeNode root){
        TreeNode n=new TreeNode(data);
        if(root==null){
            root=n;
            return root;
        }
        TreeNode current=root;
        TreeNode previous=root;
        while(current!=null){
            previous=current;
            if(data>current.val){
                current=current.right;
            }
            else{
                current=current.left;
            }
        }
        if(data>previous.val){
            previous.right=n;
        }
        else{
            previous.left=n;
        }
        return root;
    }
    public static void main(String[] args) {
        SearchInABinarySearchTree bst=new SearchInABinarySearchTree();
        bst.root=bst.insert(5,bst.root);
        bst.insert(7,bst.root);
        bst.insert(9,bst.root);
        bst.insert(3,bst.root);
        bst.insert(2,bst.root);
        bst.insert(1,bst.root);

        System.out.println("Searching : "+3+"  "+bst.searchBST(bst.root,3));
        System.out.println("Searching : "+11+" "+bst.searchBST(bst.root,11));
        System.out.println("Searching : "+2+" "+bst.searchBST(bst.root,2));
    }
}
