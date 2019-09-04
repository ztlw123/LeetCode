package 面试题23_从上往下打印二叉树;

import java.util.LinkedList;

/**
 * @Author zjh
 * @Date 2019/03/12,11:41
 * @Description 层序遍历二叉树
 */
public class PrintBinaryTree {

    public static void print(BinaryTreeNode root) {

        if(root == null)
            return;

        LinkedList<BinaryTreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()) {
            BinaryTreeNode node = queue.poll();
            System.out.println(node.value);

            if(node.lChild != null)
                queue.add(node.lChild);
            if(node.rChild != null)
                queue.add(node.rChild);
        }

        return;
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
    }
}
