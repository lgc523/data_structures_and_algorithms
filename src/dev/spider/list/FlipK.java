package dev.spider.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class FlipK {
    public static void main(String[] args) {
        ListNode head = ListNode.singleInit();
        flipKInList(head, 3);
    }

    public static void flipKInList(ListNode head, int k) {
        Deque<ListNode> queue = new ArrayDeque<>();
        int count = 0;
        ListNode newHead = new ListNode(-1);
        while (true) {
            ListNode guard = head;
            //flip unit
            while (guard.getNext() != null && count < k) {
                queue.add(guard);
                guard = guard.getNext();
                count++;
            }
            //less
            if (count != k) {
                newHead.setNext(head);
                break;
            }

            while (!queue.isEmpty()) {
                newHead.setNext(queue.pollLast());
                newHead = newHead.getNext();
            }
            newHead.setNext(guard);
            head = guard;
        }
        ListNode.printList(newHead.getNext());
    }
}
