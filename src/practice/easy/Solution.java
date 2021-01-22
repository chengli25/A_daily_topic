package practice.easy;

/**
 * @author TIMI
 * @Date 2021/1/22 - 19:38
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

/**
 * @Description: 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 第一次用java写数据结构并且get到了新的逆置方法，打破了以前定式的头插法反转，此处忽略头插法，仅仅呈现官方解法
 */


public class Solution {
    public static void main(String[] args) {
        public ListNode reverseList(ListNode head) {
            ListNode pre = new ListNode();
            pre.next = head;
            ListNode cur = head;
            while(cur != null && cur.next != null)
            {
                ListNode p = cur.next;
                cur.next = cur.next.next;
                p.next = pre.next;
                pre.next = p;
            }
            return pre.next;
        }
    }
}

