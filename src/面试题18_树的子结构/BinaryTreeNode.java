package 面试题18_树的子结构;

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
