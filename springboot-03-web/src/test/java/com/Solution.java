package com;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
         next = null;
      }
 }
public class Solution {
    public static void reorderList(ListNode head) {
        if(head == null || head.next == null || head.next.next == null){
            return;
        }
        ListNode cur1 = head;
        ListNode cur2 = head;
        while(cur2.next != null && cur2.next.next != null){
            cur1 = cur1.next;
            cur2 = cur2.next.next;
        }
        ListNode newHead = reverse(cur1.next);
        cur1.next = null;
        ListNode cur = head;
        ListNode next = null;
        ListNode next1 = null;
        while(newHead != null && cur!= null){
            next = cur.next;
            next1 = newHead.next;
            cur.next = newHead;
            newHead.next = next;
            cur = next;
            newHead = next1;
        }
    }
    public static ListNode reverse(ListNode head){
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode cur = head.next;
        ListNode next = head;
        next.next = null;
        while(cur != null){
            ListNode next1 = cur.next;
            cur.next = null;
            newHead.next = cur;
            cur.next = next;
            next = cur;
            cur = next1;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
       // ListNode listNode5 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
      //  listNode4.next = listNode5;
        reorderList(listNode);
    }
}