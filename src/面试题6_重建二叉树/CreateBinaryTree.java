package 面试题6_重建二叉树;

/**
 * @Author zjh
 * @Date 2019/02/27,17:37
 * @Description 已知先序和中序的数组，重建该二叉树
 */
public class CreateBinaryTree {

    public static void printTree(BinaryTreeNode root) {

        if (root == null)
            return;

        BinaryTreeNode node = root;

        while (node != null) {
            System.out.println(node.value);
            printTree(node.lChild);
            printTree(node.rChild);

            return;
        }

    }

    public static BinaryTreeNode rebuild(int[] pre, int preStart, int preEnd,
                                         int[] media, int mediaStart, int mediaEnd) {
        if(preStart > preEnd || mediaStart > mediaEnd || pre.length != media.length)
            return null;

        BinaryTreeNode root = new BinaryTreeNode(pre[preStart], null, null);

        int position = 0;
        for(position = mediaStart; position<=mediaEnd; position++) {
            if(media[position] == pre[preStart])
                break;
        }

        root.lChild = rebuild(pre, preStart+1, preStart+(position-mediaStart), media, mediaStart, position-1);
        root.rChild = rebuild(pre, preStart+position-mediaStart+1, preEnd, media, position+1, mediaEnd);

        return root;
    }


    public static void main(String[] args) {
//        BinaryTreeNode b1 = new BinaryTreeNode(1, null, null);
//        BinaryTreeNode b2 = new BinaryTreeNode(2, null, null);
//        BinaryTreeNode b3 = new BinaryTreeNode(4, null, null);
//        BinaryTreeNode b4 = new BinaryTreeNode(7, null, null);
//        BinaryTreeNode b5 = new BinaryTreeNode(3, null, null);
//        BinaryTreeNode b6 = new BinaryTreeNode(5, null, null);
//        BinaryTreeNode b7 = new BinaryTreeNode(6, null, null);
//        BinaryTreeNode b8 = new BinaryTreeNode(8, null, null);
//
//        BinaryTreeNode[] pre = {b1,b2,b3,b4,b5,b6,b7,b8};
//
//        BinaryTreeNode c1 = new BinaryTreeNode(4, null, null);
//        BinaryTreeNode c2 = new BinaryTreeNode(7, null, null);
//        BinaryTreeNode c3 = new BinaryTreeNode(2, null, null);
//        BinaryTreeNode c4 = new BinaryTreeNode(1, null, null);
//        BinaryTreeNode c5 = new BinaryTreeNode(5, null, null);
//        BinaryTreeNode c6 = new BinaryTreeNode(3, null, null);
//        BinaryTreeNode c7 = new BinaryTreeNode(8, null, null);
//        BinaryTreeNode c8 = new BinaryTreeNode(6, null, null);
//
//        BinaryTreeNode[] media = {c1,c2,c3,c4,c5,c6,c7,c8};
//
//        BinaryTreeNode root = CreateBinaryTree.rebuild(pre, 0, 7, media, 0, 7);
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] media = {4,7,2,1,5,3,8,6};
        BinaryTreeNode root = CreateBinaryTree.rebuild(pre, 0, 7, media, 0, 7);

        CreateBinaryTree.printTree(root);
    }
}
