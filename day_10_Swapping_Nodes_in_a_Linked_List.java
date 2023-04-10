public class day_10_Swapping_Nodes_in_a_Linked_List {

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

    public ListNode swapNodes(ListNode head, int k) {
        // creating empty nodes
        ListNode ln1 = null; // this will store kth node
        ListNode ln2 = null; // this will store kth from last
        for (ListNode var = head; var != null; var = var.next) {
            ln2 = ln2 == null ? null : ln2.next;
            if (--k == 0) {
                ln1 = var; // when k==0 then it will store kth node
                ln2 = head; // now this is storing head and when the loop ends this will be pointing to the kth from last
            }
        }
        // Swapping values
        int temp = ln1.val;
        ln1.val = ln2.val;
        ln2.val = temp;
        return head;
    }

}
