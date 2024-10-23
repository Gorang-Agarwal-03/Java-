package Queue;

public class LinkedListImplementation {

    private static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    private static class queueLL{
        Node head = null;
        Node tail = null;
        int size = 0;

        private void add(int x){
            Node temp = new Node(x);
            if(size ==0){
                head = tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        private int remove(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            int top = head.val;
            head = head.next;
            size--;
            return top;
           
        }
        private int peek(){
            if(size == 0){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.val;
        }
        private void display(){
            if(size == 0){
                System.out.println("Queue is empty!!");
            }
            Node temp = head;
            while(temp !=null){
                System.out.print(temp.val +" ");
                temp = temp.next;
            }
            System.out.println();

        }
        private boolean isEmpty(){
            if(size == 0) return true;
            return false;
        }
    }

     public static void main(String[] args) {
        queueLL q =new queueLL();
        q.display();
        q.isEmpty();
         q.add(17);
        q.add(27);
        q.add(37);
        q.add(47);
        q.remove();
        q.display();
        q.add(32);
        System.out.println(q.peek());
        q.display();
        q.add(100);
        q.isEmpty();
        
     }
}
