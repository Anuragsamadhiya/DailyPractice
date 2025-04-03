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
             ListNode curr=null;

    public ListNode reverseKGroup(ListNode head, int k) {
      ListNode dummy=new ListNode(0);
      ListNode ret=dummy;
      ListNode track=head;
      while(track!=null){
        int count = 0;
            ListNode temp = track;
        while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }
            if (count < k) {dummy.next=track;break;}
        curr=null;
        dummy.next=reverse(track,k);
        dummy=track;
        track=curr;
      }
      return ret.next;
    }
       
       

    ListNode reverse(ListNode start,int k){
        curr=start;
        ListNode prev=null;
        ListNode nextrack=null;
        for(int i=0;i<k;i++){
            // if(curr==null)return start;

nextrack=curr.next;

curr.next=prev;
prev=curr;

curr=nextrack;

        }
        return prev;
    }
}