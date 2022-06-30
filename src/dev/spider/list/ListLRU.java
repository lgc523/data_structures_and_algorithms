package dev.spider.list;

public class ListLRU {

    ListNode head = ListNode.singleInit();

    public static void main(String[] args) {
        ListLRU listLRU = new ListLRU();
        System.out.println("LIST LRU...");
        listLRU.get(6);
    }

    private int get(int k) {
        ListNode i = head;
        ListNode p = new ListNode();
        while (head != null && head.getV() != k) {
            p = head;
            head = head.next;
        }
        if (head != null) {
            p.next = head.next;
            head.next = i;
            i = head;
            System.out.println("cache get:" + k);
        } else {
            System.out.println(k + " absent...");
            p.next = new ListNode(k);
        }
        ListNode.printList(i);
        return k;
    }
}