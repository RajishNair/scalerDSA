package com.scaler.advaceDSA3.linkedlist1.session;
/*
*  Insert the given value in a sorted Linked List
* */
public class InsertNodeInSortedLL {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(4);
        ListNode listNode1 = new ListNode(10);
        ListNode listNode2 = new ListNode(20);
        ListNode listNode3 = new ListNode(40);
        ListNode listNode4 = new ListNode(50);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        //InsertNodeInSortedLL obj = new InsertNodeInSortedLL();
        ListNode newNode = InsertNodeInSortedLL.insertNode(listNode,1);
        while(newNode!=null){

            System.out.print(newNode.val+"->");
            newNode= newNode.next;

        }


    }

    public static ListNode insertNode(ListNode node, int value){
        ListNode temp = node;
        ListNode newNode = new ListNode(value);

        if( node ==null || value<node.val){
            newNode.next = node;
            node = newNode;
            return node;
        }

        while(temp.next!=null && temp.next.val<value){
            temp = temp.next;

        }
        newNode.next = temp.next;
        temp.next = newNode;
        return node;
    }

    static class ListNode {
      public int val;
      public ListNode next;
      ListNode(int x) { val = x; next = null; } }
}
