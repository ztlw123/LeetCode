package 面试题25_二叉树中和为某一值的路径;

/**
 * @Author zjh
 * @Date 2019/02/27,17:40
 */
public class BinaryTreeNode {

    public int value;

    public BinaryTreeNode lChild;

    public BinaryTreeNode rChild;

    public BinaryTreeNode(int value, BinaryTreeNode lChild, BinaryTreeNode rChild) {
        this.value = value;
        this.lChild = lChild;
        this.rChild = rChild;
    }

    public BinaryTreeNode(int value) {
        this.value = value;
        this.lChild = null;
        this.rChild = null;
    }
}
