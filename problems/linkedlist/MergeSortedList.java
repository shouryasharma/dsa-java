package linkedlist;

import datastructures.LinkedList;

public class MergeSortedList {
    static LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
        LinkedList.Node pointer1 = list1.getHead();
        LinkedList.Node pointer2 = list2.getHead();
        LinkedList result = new LinkedList(999999);

        while (pointer1 != null && pointer2 != null) {
            if (pointer1.value < pointer2.value) {
                if (result.head.value == 999999)
                    result.head.value = pointer1.value;
                else
                    result.append(pointer1.value);
                pointer1 = pointer1.next;
            } else {
                if (result.head.value == 999999)
                    result.head.value = pointer2.value;
                else
                    result.append(pointer2.value);
                pointer2 = pointer2.next;
            }
        }
        if (pointer1 != null) {
            result.tail.next = pointer1;
        } else {
            result.tail.next = pointer2;
        }

        return result;
    }

    public static void main(String[] args) {
        LinkedList list1 = new LinkedList(1);
        list1.append(2);
        list1.append(4);

        LinkedList list2 = new LinkedList(1);
        list2.append(3);
        list2.append(4);

        mergeTwoLists(list1, list2).printList();

        // LinkedList list1 = new LinkedList(1);
        // list1.append(2);
        // list1.append(4);

        // LinkedList list2 = new LinkedList(1);
        // list2.append(3);
        // list2.append(4);

        // mergeTwoLists(list1, list2).printList();
    }
}
