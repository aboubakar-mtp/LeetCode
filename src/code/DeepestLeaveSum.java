package code;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DeepestLeaveSum {
	public int deepestLeavesSum(TreeNode root) {
		if (root == null) return 0;
		
		ArrayList<TreeNode> parents = new ArrayList<>();
		ArrayList<TreeNode> children = new ArrayList<>();
		
		int sum = 0;
		
		children.add(root);
		
		while(!children.isEmpty()) {
			parents.clear();
			while(!children.isEmpty()) {
				parents.add(children.remove(0));
			}
			//children.clear();
			sum = 0;
			for(TreeNode n : parents) {
				sum += n.val;
				if(n.left != null) children.add(n.left);
				if(n.right != null) children.add(n.right);
				
			}
		}
		
		
		return sum;
        
    }
	
	
	public int deepestLeavesSum2(TreeNode root) {
		
		if(root == null) return 0;
		int sum = 0;
		
		Queue<TreeNode> childrenAtlevel = new LinkedList<>();
		
		childrenAtlevel.add(root);
		
		while(!childrenAtlevel.isEmpty()) {
			int size = childrenAtlevel.size();
			sum = 0;
			for(int i = 0; i < size; i++) {
				TreeNode n = childrenAtlevel.poll();
				sum += n.val;
				
				if(n.left != null) childrenAtlevel.add(n.left);
				if(n.right != null) childrenAtlevel.add(n.right);
			}
		}
		
		return sum;
		
	}
	
	
	
	//another approach is to find the max depth of the tree
	// then use that to compute the sum of highest depth leaves
	
	public int getMaxdepth(TreeNode root) {
		if(root == null) return 0;
		
		return 1 + Math.max(getMaxdepth(root.left), getMaxdepth(root.right));
	}
	
	public int getSumAtLevel(TreeNode root, int level) {
		if(root == null) return 0;
		if(level == 1) return root.val;
		
		return getSumAtLevel(root.left, level - 1) + getSumAtLevel(root.right, level - 1);
	}
	
	public int deepestLeavesSum3(TreeNode root) {
		int depth = this.getMaxdepth(root);
		
		return this.getSumAtLevel(root, depth);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DeepestLeaveSum dls = new DeepestLeaveSum();
		
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(4);
		TreeNode n4 = new TreeNode(5);
		TreeNode n5 = new TreeNode(6);
		TreeNode n6 = new TreeNode(7);
		TreeNode n7 = new TreeNode(8);
		
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.right = n5;
		n3.left = n6;
		n5.right = n7;
		
		System.out.println(dls.deepestLeavesSum3(root));
		

	}

}
