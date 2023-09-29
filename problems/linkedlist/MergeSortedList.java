package linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeSortedList {
    static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode(0);
        ListNode temp = result;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 != null) {
            temp.next = list1;
        } else if (list2 != null) {
            temp.next = list2;
        }

        return result.next;
    }

    public static void main(String[] args) {
        ListNode tail1 = new ListNode(4, null);
        ListNode next1 = new ListNode(2, tail1);
        ListNode head1 = new ListNode(1, next1);

        ListNode tail2 = new ListNode(4, null);
        ListNode next2 = new ListNode(3, tail2);
        ListNode head2 = new ListNode(1, next2);

        ListNode temp = mergeTwoLists(head1, head2);
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }

        // LinkedList list1 = new LinkedList(1);
        // list1.append(2);
        // list1.append(4);

        // LinkedList list2 = new LinkedList(1);
        // list2.append(3);
        // list2.append(4);

        // mergeTwoLists(list1, list2);
    }
}
