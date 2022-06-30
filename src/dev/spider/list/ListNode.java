package dev.spider.list;

import org.w3c.dom.Node;

public class ListNode {
    int v;
    ListNode next;
    ListNode pre;

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPre() {
        return pre;
    }

    public void setPre(ListNode pre) {
        this.pre = pre;
    }

    public ListNode(int v) {
        this.v = v;
    }

    public ListNode() {
    }

    public ListNode(int v, ListNode next, ListNode pre) {
        this.v = v;
        this.next = next;
        this.pre = pre;
    }

    public ListNode(int v, ListNode next) {
        this.v = v;
        this.next = next;
    }

    public static ListNode singleInit() {
        ListNode head = new ListNode(1);
        ListNode l0 = new ListNode(8);
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(8);
        ListNode l4 = new ListNode(0);
        ListNode l5 = new ListNode(5);

        head.setNext(l0);
        l0.setNext(l1);
        l1.setNext(l2);
        l2.setNext(l3);
        l3.setNext(l4);
        l4.setNext(l5);
        printList(head);
        return head;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            return;
        }
        StringBuilder out = new StringBuilder("" + head.getV());
        while (head.next != null) {
            ListNode cur = head.next;
            out.append("->").append(cur.getV());
            head = cur;
        }
        out.append("->nil.");
        System.out.println("current list is: " + out);
    }

    public static void printLoopList(ListNode head) {
        if (head == null) {
            return;
        }
        ListNode flag = head;
        StringBuilder out = new StringBuilder("" + head.getV());
        while (head.next != null && head.next != flag) {
            ListNode cur = head.next;
            out.append("->").append(cur.getV());
            head = cur;
        }
        out.append("«");
        System.out.println("current list is: " + out);
    }

    public static ListNode generateLoopList() {

        ListNode head = new ListNode(1);
        ListNode x = head;

        //建立单向链表
        for (int i = 2; i <= 5; i++) {
            x = (x.next = new ListNode(i));
        }

        //最后一个节点的next指向第一个节点，形成循环链表
        x.next = head;
        printLoopList(head);
        return head;
    }
}
