public class day_7_Remove_Nth_Node_From_End_of_List {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        // nth node from last means (size-n)th indexed list is to be removed
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        if (size == 1)
            return null;
        if (size == 2)
            if (n == 1) {
                head.next = null;
                return head;
            } else
                return head.next;
        if (size > 2) {
            int k = size - n;
            if (size == n)
                return head.next;
            ListNode k_1th = GetNode(k - 1, head);
            ListNode kth = k_1th.next;
            k_1th.next = kth.next;
            kth.next = null;
            size--;
            return head;
        }

        return head;

    }

    public ListNode GetNode(int k, ListNode head) {

        ListNode temp = head;
        for (int i = 1; i <= k; i++)
            temp = temp.next;

        return temp;
    }
}
