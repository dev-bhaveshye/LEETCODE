package DSA.HackWithInfy.Linked_List;

public class Design_Linked_List_707 {
    class ListNode{
    int val ;
    ListNode next;
    ListNode(int x ){
        val = x;
    }
}
class MyLinkedList {
    ListNode head ; 
    int size;

    public MyLinkedList() {
        head = new ListNode(0);
        size = 0; 
        
    }
    
    public int get(int index) {
        if(index<0) return -1;
        if(index>=size) return -1;

        ListNode curr = head ; 

        for(int i = 0 ; i <=index ; i++){
            curr = curr.next;
        }
        return curr.val;
        
    }
    
    public void addAtHead(int val) {
        addAtIndex(0,val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size,val);
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 ) return ;
        if(index>size ) return ; 
        ListNode curr = head ; 

        size++;

        for(int i = 0 ; i< index ; i++){
            curr = curr.next;
        }
        ListNode newadd = new ListNode(val);
        newadd.next = curr.next;
        curr.next = newadd;



    }
    
    public void deleteAtIndex(int index) {
        if(index < 0 ) return ;
        if(index>=size ) return ; 

        ListNode curr = head ; 
        for(int i = 0 ; i< index ; i++){
            curr = curr.next;
        }
        size--;
        curr.next = curr.next.next;
    }
}

public static void main(String[] args){
    Design_Linked_List_707 outer = new Design_Linked_List_707();
    MyLinkedList myLinkedList = outer.new MyLinkedList();
    myLinkedList.addAtHead(1);
    myLinkedList.addAtTail(3);
    myLinkedList.addAtIndex(1, 2);    // linked list becomes 1->2->3
    System.out.println(myLinkedList.get(1));              // return 2
    myLinkedList.deleteAtIndex(1);    // now the linked list is 1->3
    System.out.println(myLinkedList.get(1));            // return 3
    }
}
