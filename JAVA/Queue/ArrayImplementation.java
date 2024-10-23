package Queue;

public class ArrayImplementation {
    public static class queueArray{
        int f = -1;
        int r = -1;
        int[] arr = new int[5];

        private void add(int val){
            if(r == arr.length-1){
                System.out.println("Queue is full!!");
                return;
            }
            if(f == -1){
                f=r=0;
                arr[r] = val;
            }
            else{
                arr[++r] = val;
            }
        }

        private int remove(){
            int v = arr[f];
            f++;
            return v;
        }

        private int peek(){
            if(f == -1){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[f];
        }
        private boolean isEmpty(){
            if(r == -1){
                return true;
            }
            return false;
        }
        private void display(){
            if(f == -1){
                System.out.println("queue is Empty!!");
            }
            else{
                for(int i = f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        queueArray q = new queueArray();
        q.display();
       
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

    }
}
