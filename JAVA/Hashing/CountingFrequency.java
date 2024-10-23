package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class CountingFrequency {
    public static void main(String[] args) {
        int[]arr = {1 ,4 ,3 ,5 ,7 ,5 ,6 ,8 ,4 ,2 ,3, 4, 8 ,4 ,4};
        Map<Integer , Integer> mp = new HashMap<>();
        for(int e : arr){
            if(!mp.containsKey(e)){
                mp.put(e, 1);
            }else{
                mp.put(e, mp.get(e)+1);
            }
        }
        System.out.println(mp);
        int maxfeq = 0 , ansKey = -1;

        for(var g : mp.entrySet()){
            if(g.getValue() > maxfeq){
                maxfeq = g.getValue();
                ansKey = g.getKey();
            }
        }
        System.out.printf("%d has Max frequency which is %d times ",ansKey , maxfeq);
    }
}
