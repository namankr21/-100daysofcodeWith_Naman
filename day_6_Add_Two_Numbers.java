public class day_6_Add_Two_Numbers {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(); // a new list to store result
        ListNode temp = l3; // taking reference to traverse to l1&l2 and not leaving the address

        int carry = 0;
        while (l1 != null || l2 != null || carry == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next; // making l1 to point its next node
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next; // making l2 to point its next node
            }
            sum += carry;
            carry = sum / 10;
            sum = sum % 10;
            ListNode nn = new ListNode();
            nn.val = sum;
            temp.next = nn; // temp.next will point nn i.e. pointing the new node
            temp = temp.next; // making temp to point its next node
        }
        return l3.next;
    }

}
