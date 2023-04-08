public class day_8_Delete_Node_in_a_Linked_List
{
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x)
        { 
            val = x; 
        }
    }
    public void deleteNode(ListNode node) {
        //making the next node value to current node value
        node.val = node.next.val; 
        //making the next node to next to next node so that the current node can be skipped!
        node.next = node.next.next; 
        
    }
    
}
