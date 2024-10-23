package Searching;

public class DistributrChocolate {

    static boolean isDivisionpossible(int a[] , int m  , int maxChocAllow){
        int numberofstudent = 1;
        int choc = 0; // chocolate at starting 

        for(int i = 0; i<a.length;i++){
            if(a[i] > maxChocAllow) return false;
            if(choc + a[i] <= maxChocAllow){
                choc +=a[i];

            }
            else{
                numberofstudent++;
                choc = a[i];
            }
        }
        if(numberofstudent > m) return false;
        return true;

    }
    static int distributechocolate(int a[] , int m){
        if(a.length<m) return -1;
        int ans =0, st =0 , end = (int)1e9;
        while(st<end){
            int mid  = st+ (end - st )/2;

            if(isDivisionpossible(a,m,mid)){
                ans = mid;
                end = mid-1;

            }else{
                st = mid+1;

            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int a[] = {5 ,3 ,1 ,4 ,2};
        int m =3;
        System.out.println(distributechocolate(a ,m));
        
    }
}
