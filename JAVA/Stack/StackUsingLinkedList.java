package Stacks;

public class StackUsingLinkedList {

    private static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack{
       private Node head = null;
        private int size = 0;

        private void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }

        private int pop(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            int top = head.val;
            head = head.next;
            return top;

        }

        private void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");

        }

        private void display(){
            displayRec(head);
            System.out.println();
        }

        private void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
            System.out.println();
        }

        private int peek(){
            if(head == null){
                System.out.println("Stack is Empty!");
                return -1;
            }
            return head.val;
        }

        private int size(){
            return size;
        }

        private boolean isEmpty(){
            if(size==0){
                return true;
            }
            return false;
        }
    }

    
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(2);
        st.push(4);
        st.push(9);
        st.push(1);
        st.push(3);
        st.push(5);
        st.push(6);
        st.push(8);
        st.push(7);
        st.display();
        st.pop();
        st.display();
        st.push(91);
        st.push(49);
        st.push(30);
        st.display();
        System.out.println("Peek element= "+ st.peek());
        System.out.println("Size of stack is= "+ st.size());
    }
}
