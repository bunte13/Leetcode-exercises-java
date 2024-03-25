package LinkedList;

import java.util.ArrayList;
import java.util.List;



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
public class lists {
    
    public static void main(String[] args) {
        // Example usage:
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(1);
        head.next.next.next.next = new ListNode(1);

        // Delete the node with value 3
        // DeleteNode(head.next.next);
         

        
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println("\n");
        // ListNode vtora_zad = DeleteNthfromEnd(head,1);
        // while (vtora_zad != null) {
        //     System.out.print(vtora_zad.val + " ");
        //     vtora_zad = vtora_zad.next;
        // }
        System.out.println("\n");
        // ListNode treta_zad = ReverseNode(head);
        // while (treta_zad != null) {
        //     System.out.print(treta_zad.val + " ");
        //     treta_zad = treta_zad.next;
        // }
        System.out.println("\n");
        if(isPalindrome2(head)){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }

    //funkcii od leetcode

    public static void DeleteNode(ListNode node){
        
        node.val = node.next.val;
        node.next = node.next.next; 


    }
    public static ListNode DeleteNthfromEnd(ListNode head,int n){
        ListNode pom = new ListNode(0);
        pom.next = head;
        ListNode fast = pom;
        ListNode slow = pom;
        for(int i = 0;i<=n;i++){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return pom.next;

    }
    public static ListNode ReverseNode(ListNode head){
        ListNode prev = null;
        ListNode current = head;
        while(current!= null){
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
         return prev;

    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        while(list1 != null && list2 != null){
            if(list1.val>list2.val){
                curr.next = list2;
                list2 = list2.next;
            }else{
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }
        if(list1 != null){
        while(list1!= null){
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }
         }
         if(list2 != null){
            while(list2!= null){
                curr.next = list2;
                list2 = list2.next;
                curr = curr.next;
            }
             }
        return temp.next;
    }
    public static boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode pom = new ListNode(0);
        pom = head;
        while(pom!= null){
            list.add(pom.val);
            pom = pom.next;
        }
        int i = 0;
        int j = list.size()-1;
        while(i<j){
            if(list.get(i) != list.get(j)){
                System.out.println(list.get(i));
                System.out.println(list.get(j));
            return false;
            }
            
            i++;
            j--;
        }       
                System.out.println(list.get(i));
                System.out.println(list.get(j));
        return true;

    }
    public static boolean isPalindrome2(ListNode head) {
        ListNode pom = new ListNode(0);
        pom.next = head;
        ListNode curr = pom.next;
        ListNode fast = pom;
        ListNode slow = pom;
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast.next!= null){
        slow = slow.next;
        }
        ListNode temp = ReverseNode(slow);
        while(temp.next!= null){
            if(curr.val != temp.val){
                return false;
            }
            temp = temp.next;
            curr = curr.next;
        }
        return true;
         
    }
    public static boolean hasCycle(ListNode head) {
     
         ListNode pom = new ListNode(0);
         pom.next = head;
         ListNode fast = pom.next;
         ListNode slow = pom;
         while(fast != null && fast.next != null){
            if(slow == fast){
            return true;
            }
                slow=slow.next;
            fast = fast.next.next;
            
         }
         return false;
        
    }
    
    
}
