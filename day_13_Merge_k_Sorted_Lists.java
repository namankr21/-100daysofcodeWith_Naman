public class day_13_Merge_k_Sorted_Lists {
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

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        ListNode list1 = lists[0];
        ListNode ans = list1;

        for (int i = 1; i < lists.length; i++) {
            ans = mergeTwoLists(ans, lists[i]);
        }

        System.out.println(lists.length);
        return ans;

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode temp = ans;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                temp.next = list2;
                list2 = list2.next;

            } else {
                temp.next = list1;
                list1 = list1.next;
            }
            temp = temp.next;
        }
        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while (list2 != null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }
        temp.next = null;
        return ans.next;
    }
}
