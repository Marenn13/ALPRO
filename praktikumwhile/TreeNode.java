
public class TreeNode {
    
          int data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    
    
    TreeNode (){
        leftNode = null;
        rightNode =null;
        
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    public String toString (){
      //  return "" + data;
        return String.valueOf(data);
    }
    
}
