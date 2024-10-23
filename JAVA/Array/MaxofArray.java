package Array;

public class MaxofArray {
    public static void main(String[] args) {
        int[] arr = {5 , 4 , 3 , 6 , 9 , 8}; //Ans = 9
        int ans = 0;
    
        for(int i=0 ;i<arr.length ;i++){
            if(arr[i]>ans){
                ans=arr[i];
            }
            
        }
        System.out.println(ans);
        
    }
    
    
}
