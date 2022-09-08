package addTwoNumbers;

public class Solution_addTwoNumbers {


    public static void main(String[] args) {
        System.out.println("ss");
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4,listNode3);
        ListNode listNode2 = new ListNode(2,listNode4);
        System.out.println(getValue(listNode2));

        System.out.println(listNode2);
        System.out.println(addTwoNumbers(listNode2,listNode2));


        ListNode t0 = new ListNode(0);
        System.out.println(addTwoNumbers(t0,t0));


    }

    public static int getValue(ListNode listNode){
        int result = 0;
        int power = 0;
        while (listNode!=null){
            result+= listNode.val*Math.pow(10,power);
            power++;
            listNode = listNode.next;
        }
        return result;
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)


    // Add Two Numbers (Java improved)
    //sample solution
    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }
        return dummyHead.next;
    }
}




