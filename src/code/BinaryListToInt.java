package code;
import java.util.ArrayList;

public class BinaryListToInt {
	public class ListNode {
		     int val;
		     ListNode next;
		     ListNode(int x) { 
		    	 val = x; 
		    }
	}
	
	public int binToInt(ListNode head) {
		int size = 0;
		ListNode start = head;
		
		while(start != null) {
			size++;
			start = start.next;
		}
		int power = size - 1;
		
		start = head;
		int sum = 0;
		while(start != null) {
			sum += (Math.pow(2, power)) * start.val;
			power--;
			start = start.next;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryListToInt bli = new BinaryListToInt();
		ListNode head = bli.new ListNode(0);
		ListNode n = bli.new ListNode(1);
		ListNode n2 = bli.new ListNode(1);
		
		head.next = n;
		n.next = n2;
		
		System.out.println(bli.binToInt(head));
		
		

	}

}
