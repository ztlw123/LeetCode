package 面试题6_重建二叉树;

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
}
