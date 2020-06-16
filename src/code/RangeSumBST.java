package code;

public class RangeSumBST {
	
	public int rangeSumBST(TreeNode root, int L, int R) {
		
		int a = 0;
		if(root == null) {
			return 0;
		}
		
		if(root.val >= L && root.val <= R) {
			
			a+= root.val;
		}
		
		if(root.val < R) {
			a += rangeSumBST(root.right, L, R);
		}
		if(root.val > L) {
			a += rangeSumBST(root.left, L, R);
		}
		
		return a;
        
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RangeSumBST rs = new RangeSumBST();
		
		TreeNode root = new TreeNode(10);
		TreeNode n1 = new TreeNode(5);
		TreeNode n2 = new TreeNode(15);
		TreeNode n3 = new TreeNode(3);
		TreeNode n4 = new TreeNode(7);
		//TreeNode n5 = new TreeNode(10);
		TreeNode n6 = new TreeNode(18);
		
		root.left = n1;
		root.right = n2;
		n1.left = n3;
		n1.right = n4;
		n2.right = n6;
		
		
		
		System.out.println(rs.rangeSumBST(root, 7, 15));
		
		
		

	}

}
