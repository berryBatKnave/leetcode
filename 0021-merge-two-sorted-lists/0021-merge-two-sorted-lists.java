/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
// [1,2,3]
// [1,3,4]
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode current_node = temp;
        while(l1!=null && l2!=null){
            if(l1.val < l2.val){
                current_node.next = l1;
                l1 = l1.next;
            }
            else{
                current_node.next = l2;
                l2 = l2.next;
            }
            current_node = current_node.next;
        }
        if(l1!=null){
            current_node.next = l1;
        }
        else{
            current_node.next = l2;
        }
        return temp.next;
    }
}