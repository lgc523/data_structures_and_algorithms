package dev.spider.list;

public class JosephRing {
    public static void main(String[] args) {
        ListNode head = ListNode.generateLoopList();
        int killNumber = 5;
        while (head != head.next) {
            for (int i = 1; i < killNumber - 1; i++) {
                head = head.next;
            }
            head.next = head.next.next;
        }
        System.out.println(head.getV());
    }
}
