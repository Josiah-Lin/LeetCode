package leetcode;

public class IsPalindromeList {

    public static boolean isPalindromeList(ListNode head){

        if (head == null || head.next == null)
            return true;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode fastHead = slow.next;
        slow.next = null;

        ListNode pre = null;
        ListNode cur = fastHead;
        while (cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        ListNode head1 = dummy.next;
        ListNode head2 = pre;

        while (head2 != null){
            if (head1.val != head2.val)
                return false;

            head1 = head1.next;
            head2 = head2.next;
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 2, 1};
        ListNode head = ReverseList.createLinkedList(nums);
        System.out.println(isPalindromeList(head));
    }
}
