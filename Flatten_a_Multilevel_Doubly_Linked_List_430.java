package DSA.HackWithInfy.Linked_List;

import java.util.Stack;
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node(int val){
        this.val = val;
    }
};

public class Flatten_a_Multilevel_Doubly_Linked_List_430 {


    public Node flatten(Node head) {
        

        if(head==null){
            return head;
        }
        Node dummy = new Node(0);
        Stack<Node> st = new Stack<>();
        Node curr = head;
        dummy.next = head;
        Node prev = dummy;

        st.add(head);
        while(!st.isEmpty()){

            curr = st.pop();

            if(curr.next !=null){
                st.add(curr.next);
            }

            if(curr.child!=null){
                st.add(curr.child);
            }

            curr.child = null;
            curr.prev = prev;
            prev.next =curr;
            prev = curr;
            
        }
        Node left = dummy.next;
        left.prev = null;

        return dummy.next;
    }
}
