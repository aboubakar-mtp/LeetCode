package code;

public class MergeBinaryTrees {
	
	public TreeNode mergeTrees(TreeNode r1, TreeNode r2) {
		if(r1 == null && r2 == null) return null;
		
		
		TreeNode n = new TreeNode((r1 == null? 0 : r1.val) +
				(r2 == null? 0 : r2.val));
		n.left = mergeTrees((r1 == null? null : r1.left), 
				(r2 == null? null : r2.left));
		
		n.right = mergeTrees((r1 == null? null : r1.right), 
				(r2 == null? null : r2.right));
		
		
		
		return n;
	}
	//Faster because I've removed the ternary operator.
	//apparently Tenary operatorion consume a lot of compute power
	  public TreeNode mergeTrees3(TreeNode r1, TreeNode r2) {
	        if(r1 == null && r2 == null) return null;
			
			if(r1 == null) {
				return r2;
			}
			else if(r2 == null) {
				return r1;
			}
			
			TreeNode n = new TreeNode((r1.val) + (r2.val));
			n.left = mergeTrees((r1.left), (r2.left));
			
			n.right = mergeTrees((r1.right), ( r2.right));
			
			return n;
	        
	    }
	public TreeNode mergeTrees2(TreeNode r1, TreeNode r2) {
		if(r1 == null && r2 == null) return null;
		
		if(r1 == null) {
			return r2;
		}
		else if(r2 == null) {
			return r1;
		}
		
		r1.val = r1.val + r2.val;
		r1.left = mergeTrees2(r1.left, r2.left);
		r1.right = mergeTrees2(r1.right, r2.right);
		
		return r1;
	}
	
	public void printTree(TreeNode n) {
		if (n == null) return;
		System.out.print(n.val + " ");
		printTree(n.left);
		printTree(n.right);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(1);
		TreeNode n1 = new TreeNode(2);
		TreeNode n2 = new TreeNode(3);
		TreeNode n3 = new TreeNode(5);
		
		root.left = n2;
		root.right = n1;
		n2.left = n3;
		
		TreeNode rr = new TreeNode(2);
		TreeNode n11 = new TreeNode(1);
		TreeNode n21 = new TreeNode(3);
		TreeNode n31 = new TreeNode(4);
		TreeNode n41= new TreeNode(7);
		
		rr.left = n11;
		rr.right = n21;
		n11.right = n31;
		n21.right = n41;
		
		MergeBinaryTrees mbt = new MergeBinaryTrees();
		
		TreeNode m = mbt.mergeTrees(root, rr);
		
		mbt.printTree(root);
		System.out.println();
		mbt.printTree(rr);
		
		System.out.println();
		
		mbt.printTree(m);
		
		

	}

}
