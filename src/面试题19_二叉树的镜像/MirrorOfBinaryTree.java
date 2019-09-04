package 面试题19_二叉树的镜像;

/**
 * @Author zjh
 * @Date 2019/03/11,16:14
 */
public class MirrorOfBinaryTree {

    public static BinaryTreeNode temp(BinaryTreeNode root) {
        if (root == null)
            return null;

        BinaryTreeNode tempNode = root.lChild;
        root.lChild = temp(root.rChild);
        root.rChild = temp(tempNode);

        return root;
    }

    public static void mirrorOfTree(BinaryTreeNode root) {

        if(root == null)
            return;

        if(root.lChild == null && root.rChild == null)
            return;

        BinaryTreeNode tempNode = root.lChild;
        root.lChild = root.rChild;
        root.rChild = tempNode;

//        if(root.lChild != null)
            mirrorOfTree(root.lChild);

//        if(root.rChild != null)
            mirrorOfTree(root.rChild);
    }

    public static void print(BinaryTreeNode root) {

        if(root == null)
            return;

        while (root != null){
            System.out.print(root.value + "  ");
            print(root.lChild);
            print(root.rChild);

            return;
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode b4 = new BinaryTreeNode(5);
        BinaryTreeNode b5 = new BinaryTreeNode(7);
        BinaryTreeNode b6 = new BinaryTreeNode(9);
        BinaryTreeNode b7 = new BinaryTreeNode(11);

        BinaryTreeNode b2 = new BinaryTreeNode(6, b4, b5);
        BinaryTreeNode b3 = new BinaryTreeNode(10, b6, b7);

        BinaryTreeNode b1 = new BinaryTreeNode(8, b2, b3);

        print(b1);

        System.out.println();
        mirrorOfTree(b1);
        print(b1);
    }
}
