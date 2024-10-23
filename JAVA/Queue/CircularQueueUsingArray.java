package Queue;

public class CircularQueueUsingArray {
    private static class circularArr{
        int[] arr = new int[10];
        int r =-1;
        int f = -1;
        int size = 0;

        private void add(int val) throws Exception{
            if(size == arr.length){
                throw new Exception("Queue is full!!");
            }
            else if(size == 0){
                f = r = 0;
                arr[0] = val;
            }
            else if(r < arr.length-1){
                arr[++r] = val;
            }
            else if ( r == arr.length){
                r = 0;
                arr[r] = val;
            }
            size++;
        }

        private int remove() throws Exception{
            if(size == 0){
                throw new Exception("Queue is empty!!");
            }
            else{
                int top = arr[f]; 
                if(f == arr.length-1){
                    f = 0;
                }
                else{
                    f++;
                }
                size--;
                return top;
            }
        }
        private int peek() throws Exception{
            if(size == 0){
                throw new Exception("Queue is Empty!!");
            }else{
                return arr[f];
            }
        }
        private void display(){
            if(size == 0){
                System.out.println("Queue is Empty!!");
            }
            else if(f <=r ){
                for(int i = f;i<=r ; i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{
                for(int i=f ; i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
                for(int i=0;i<=r;i++){
                    System.out.println(arr[i]+" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) throws Exception {
        circularArr qa = new circularArr();
        qa.display();
        qa.add(10);
        qa.add(9);
        qa.add(8);
        qa.add(7);
        qa.add(6);
        qa.remove();
        qa.display();
        qa.add(5);
        qa.add(4);
        qa.add(3);
        qa.add(2);
        qa.add(1);
        qa.display();
        System.out.println("Peek = "+qa.peek());
        
    }
}
