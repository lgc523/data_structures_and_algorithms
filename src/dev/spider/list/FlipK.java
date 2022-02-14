package dev.spider.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class FlipK {
    public static void main(String[] args) {
        ListNode head = ListNode.singleInit();
        ListNode listNode = flipK(head, 3);
        ListNode.printList(listNode);
    }

    public static ListNode flipK(ListNode head, int k) {
        Deque<ListNode> stack = new ArrayDeque<ListNode>();
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (true) {
            int count = 0;
            ListNode tmp = head;
            while (tmp != null && count < k) {
                stack.add(tmp);
                tmp = tmp.getNext();
                count++;
            }
            if (count != k) {
                p.setNext(head);
                break;
            }
            while (!stack.isEmpty()) {
                p.setNext(stack.pollLast());
                p = p.getNext();
            }
            p.setNext(tmp);
            head = tmp;
        }
        return dummy.getNext();
    }
}
