package HashMaps;

import java.util.LinkedList;

public class HashMapImplementation {
    public static class hashMap<K,V>{
        static final int  Default_Capacity = 4;
        static final float  Load_Factor = 0.75f;

        private class Node{
            K key;
            V value;
            Node(K key , V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private LinkedList<Node>[] buckets;

        private static initBucket(int N){
            buckets = new LinkedList[N];
            for(int i = 0 ;i<buckets.length;i++){
                buckets[i] = new LinkedList<>();
            }

        }

        public MyHashMap(){
            initBucket(Default_Capacity);

        }
        public int size(){
            return n;
        }

        public void put(K key , V value){

        }

        public V get(K key){

        }

        public V remove(K key){

        }

    }
    public static void main(String[] args) {
        
    }
}
