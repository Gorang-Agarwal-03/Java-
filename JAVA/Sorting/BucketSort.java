package Sorting;

import java.util.ArrayList;
import java.util.Collections;
public class BucketSort{
    public static void bucketsort(float arr[]){
            int n = arr.length;
            //number of  Buckets 
            ArrayList<Float>[] buckets = new ArrayList[n];

            //creating the empty buckets
            for(int i =0;i<n;i++){
                buckets[i] = new ArrayList<Float>();
            }

            //Add element into buckets
            for(int i=0; i<n; i++){
                int bucketIndx = (int) arr[i]*n; 
                buckets[bucketIndx].add(arr[i]);
            }

            // sort each bucket individually
            for(int i=0;i<buckets.length;i++){
                Collections.sort(buckets[i]);
            }

            //Merge all buckets to get final sorted array
            int index = 0;
            for(int i=0;i<buckets.length;i++){
                ArrayList<Float> currBucket =  buckets[i];
                for(int j=0;j<currBucket.size();j++){
                    arr[index++] = currBucket.get(j);
                }      
            }
    }
        public static void main(String[] args){
            float[] arr = {0.5f , 0.4f , 0.3f , 0.2f , 0.1f} ;
            bucketsort(arr);
            for(float val:arr){
                System.out.print(val+" ");
            }
            System.out.println();

        }
}