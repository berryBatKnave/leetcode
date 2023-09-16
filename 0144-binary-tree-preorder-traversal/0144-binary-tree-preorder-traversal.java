class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        traversal(root,list);
        return list;
    }

    public void traversal(TreeNode root,ArrayList list){
        while(root==null){
            return;
        }
        traversal(root.left,list);
        traversal(root.right,list);
        list.add(root.val);
    }
}
