package Sorting;

public class QuickSort {
    static void swap(int arr[],int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y] = temp;
      }
      static void quickSort(int arr[], int low, int high)
        {
            if(low>=high){
              return;
            }
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
        static int partition(int arr[], int low, int high)
        {
            int pivot=arr[low];
            int count = 0;
    
            for(int i=low+1;i<=high;i++){
              if(arr[i]<=pivot){
                count++;
              }
            }
              int pvtindx = low+count;
              swap(arr, low, pvtindx);
    
              int x = low;
              int y = high;
    
              while(x<pvtindx && y>pvtindx){
                while(arr[x]<=pivot){
                  x++;
                }
                while(arr[y]>pivot){
                  y--;
                }
                if(x<pvtindx && y>pvtindx){
                  swap(arr, x, y);
                  x++;
                  y--;
                }
    
              }
    
    
            
            return pvtindx;
            
    
    
        } 
        public static void main(String[] args) {
            int arr[] = {42,1,13,7,2,9,0};
            int n=arr.length;
            for(int i:arr){
              System.out.print(i+" ");
            }
            quickSort(arr, 0, n-1);
            System.out.println();
      
            for(int val:arr){
              System.out.print(val+" ");
            }
            
          }
    
}
