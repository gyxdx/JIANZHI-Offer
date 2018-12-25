
// 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
import java.util.*;
import java.util.ArrayList;
public class Solution {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		Stack<Integer> stack = new Stack<>();
		while (listNode != null) {
			stack.add(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> ret = new ArrayList<>();
		while (!stack.isEmpty())
			ret.add(stack.pop());
		return ret;
	}

}
class ListNode {
	int val;
	ListNode next = null;
	ListNode(int val) {
		this.val = val;
	}
}
