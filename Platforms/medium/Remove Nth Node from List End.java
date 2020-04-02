/*Given a linked list, remove the nth node from the end of list and return its head.

For example,
Given linked list: 1->2->3->4->5, and n = 2.
After removing the second node from the end, the linked list becomes 1->2->3->5.

 Note:
If n is greater than the size of the list, remove the first node of the list.*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode A, int B) {
        
        int count=0,position=0;
        ListNode P=A;
         ListNode temp=A;
         
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        temp=A;
        position=count-B;
        if(count==1)
        return null;
        if(B>count||position==0){
         A=temp.next;
         return A;
        }
    
    count=0;
         while(temp!=null){
          
            if(count==position){
                P.next=temp.next;
                temp.next=null;
                break;
            }
            P=temp;
            temp=temp.next;
             count+=1;
        }
        return A;
        
    }
}
