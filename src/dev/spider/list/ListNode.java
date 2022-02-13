package dev.spider.list;

public class ListNode {
    private int v;
    private ListNode next;
    private ListNode pre;

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
        String out = "" + head.getV();
        while (head.next != null) {
            ListNode cur = head.next;
            out += "->" + cur.getV();
            head = cur;
        }
        out += "->nil.";
        System.out.println("current list is: " + out);


    }
}
