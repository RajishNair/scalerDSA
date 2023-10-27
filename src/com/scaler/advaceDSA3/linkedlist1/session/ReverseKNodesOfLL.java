package com.scaler.advaceDSA3.linkedlist1.session;

public class ReverseKNodesOfLL {
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
        InsertNodeInSortedLL.ListNode reversedList = reverseKGroups(listNode,3);
        while(reversedList!=null){

            System.out.print(reversedList.val);
            if(reversedList.next!=null)
                System.out.print("->");
            reversedList= reversedList.next;

        }

    }

    public static InsertNodeInSortedLL.ListNode reverseKGroups(InsertNodeInSortedLL.ListNode head, int k){
        int count =1;
        if(head ==null)
            return null;
        InsertNodeInSortedLL.ListNode th = head;
        InsertNodeInSortedLL.ListNode temp = head;
        while(count<k && temp.next!=null){
            temp = temp.next;
            count+=1;

        }
        InsertNodeInSortedLL.ListNode t= temp;
        temp = temp.next;
        t.next = null;


        // reverse first k nodes and disconnect
        head =ReverseLinkedList.reverseLinkedList(th);
        //reverse next K nodes
        temp =ReverseKNodesOfLL.reverseKGroups(temp,k);
        t =head;
        // Link all k groups
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
        return head;


    }
}
