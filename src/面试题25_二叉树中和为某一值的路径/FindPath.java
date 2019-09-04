package 面试题25_二叉树中和为某一值的路径;


import java.util.ArrayList;
import java.util.List;

/**
 * @Author zjh
 * @Date 2019/03/13,10:36
 */
public class FindPath {

    public static void findPath(BinaryTreeNode root, int target, ArrayList<Integer> path, ArrayList<List<Integer>> allPath){
        if(root == null)
            return;

        path.add(root.value);
        target-= root.value;

        if(target == 0 && root.lChild == null && root.rChild == null){
            allPath.add(new ArrayList<>(path));
        }
        else{
            findPath(root.lChild, target, path, allPath);
            findPath(root.rChild, target, path, allPath);
        }

        path.remove(path.size()-1);
        return;
    }

    public static void test(List<Integer> path, List<List<Integer>> result, Integer target, BinaryTreeNode root) {
        if(root==null)
            return;
        path.add(root.value);
        target -= root.value;

        if(target == 0 && root.lChild==null && root.rChild==null){
            result.add(new ArrayList<>(path));
        }
    }

    public static void main(String[] args) {
        BinaryTreeNode b4 = new BinaryTreeNode(5);
        BinaryTreeNode b5 = new BinaryTreeNode(7);
        BinaryTreeNode b6 = new BinaryTreeNode(9);
        BinaryTreeNode b7 = new BinaryTreeNode(1);

        BinaryTreeNode b2 = new BinaryTreeNode(6, b4, b5);
        BinaryTreeNode b3 = new BinaryTreeNode(10, b6, b7);

        BinaryTreeNode b1 = new BinaryTreeNode(8, b2, b3);

        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<List<Integer>> allPath = new ArrayList<>();

        findPath(b1, 19, path, allPath);
    }
}
