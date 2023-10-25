package com.scaler.advaceDSA3.linkedlist1.session;

public class ReverseLinkedList {
    public static void main(String[] args) {
        InsertNodeInSortedLL.ListNode listNode = new InsertNodeInSortedLL.ListNode(4);
        InsertNodeInSortedLL.ListNode listNode1 = new InsertNodeInSortedLL.ListNode(10);
        InsertNodeInSortedLL.ListNode listNode2 = new InsertNodeInSortedLL.ListNode(20);
        InsertNodeInSortedLL.ListNode listNode3 = new InsertNodeInSortedLL.ListNode(40);
        InsertNodeInSortedLL.ListNode listNode4 = new InsertNodeInSortedLL.ListNode(50);
        listNode.next = listNode1;
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        InsertNodeInSortedLL.ListNode reversedList = ReverseLinkedList.reverseLinkedList(listNode);
        while(reversedList!=null){

            System.out.print(reversedList.val);
            if(reversedList.next!=null)
                System.out.print("->");
            reversedList= reversedList.next;

        }
    }
    public static InsertNodeInSortedLL.ListNode reverseLinkedList(InsertNodeInSortedLL.ListNode head){
        InsertNodeInSortedLL.ListNode temp = head;
        InsertNodeInSortedLL.ListNode previous = null;
        while(temp!=null){
            head = temp.next;
            temp.next = previous;
            previous = temp;
            temp = head;
        }
        return previous;
    }
}
