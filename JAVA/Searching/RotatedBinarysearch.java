package Searching;

 /* *************************************Find the minimum********************************************************** */
public class RotatedBinarysearch{

    static int findminimum(int arr[]){
        int n = arr.length;
        int st = 0,end = n-1;
        int ans = -1;
        while(st<=end){
            int mid =st + (end-st)/2;
            if(arr[mid]<=arr[n-1]){
                ans = mid;
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return ans;
    }
    /* ****************************************Finding Target***************************************************** */
    static int search(int arr,int taget){
        int n = arr.length;
        int st =0,end=n-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            if(mid==target){
                return mid;
            }
            else if(arr[mid]<arr[end]){
                if(target >arr[mid] && target <= arr[end]){
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
                else{
                    if(target>=arr[st] && target<=arr[mid]){
                        end = mid-1;
                    }
                    else{
                        st = mid+1;
                    }
                }

            }
        }
        return -1;

    }

    public static void main(String[]  args){
        int arr[] = {3,4,5,1,2};
        int target = 4;
         System.out.println("index :"+search(arr,target));
        // System.out.println("index :"+findminimum(arr));
        }

    }
