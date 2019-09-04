package 面试题18_树的子结构;

/**
 * @Author zjh
 * @Date 2019/03/11,15:41
 */
public class IsChildOfTree {

    public static boolean hasSubtree(BinaryTreeNode root1, BinaryTreeNode root2) {
        boolean result = false;

        if(root1.value == root2.value)
            result = isChildOfTree(root1, root2);
        if(!result)
            result = hasSubtree(root1.lChild, root2);
        if(!result)
            result = hasSubtree(root1.rChild, root2);

        return result;
    }

    public static boolean isChildOfTree(BinaryTreeNode root1, BinaryTreeNode root2) {

        if(root1 == null || root2 == null)
            return false;

        if(root1.value != root2.value)
            return false;

        return isChildOfTree(root1.lChild, root2.lChild) && isChildOfTree(root1.rChild, root2.rChild);
    }

    public static void main(String[] args) {

    }
}
