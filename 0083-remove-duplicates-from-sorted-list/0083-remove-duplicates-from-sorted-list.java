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
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> hash = new HashSet<>();
        ListNode temp = head;
        ListNode c1 = temp;
        while(temp!=null){
            if(hash.contains(temp.val)==false){
                hash.add(temp.val);
                c1 = temp;
            }
            else{
                c1.next = temp.next;
            }
            temp = temp.next;
        }
        return head;
    }
}