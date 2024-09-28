package linkedlist;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        this.val = x;
    }

    public ListNode(int x, ListNode next) {
        this.val = x;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ListNode node = this;
        while (node != null) {
            sb.append(node.val);
            if (node.next != null) {
                sb.append(", ");
            }
            node = node.next;
        }

        return sb.toString();
    }

    public static boolean equals(ListNode list1, ListNode list2) {
        while (list1 != null && list2 != null) {
            if (list1.val != list2.val) {
                return false;
            }
            list1 = list1.next;
            list2 = list2.next;
        }

        return list1 == null && list2 == null;
    }
}
