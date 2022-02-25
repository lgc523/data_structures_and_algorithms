package dev.spider.list;

public class FlipSingle {
    public static void main(String[] args) {
        ListNode head = ListNode.singleInit();
        ListNode listNode = flipSingle(head);
        ListNode.printList(listNode);
    }

    public static ListNode flipSingle(ListNode head) {
        if (head.getNext() == null) return head;
        ListNode last = flipSingle(head.getNext());
        head.next.next = head;
        head.next = null;
        return last;
    }
}
