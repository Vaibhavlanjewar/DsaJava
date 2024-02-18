package hashmap;

import java.util.*;
public class majority_el{

    public static void main(String args[]){
        int arr[]={1,2};
        HashMap<Integer,Integer>mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            // if(mp.containsKey(arr[i])){
            //     mp.put(arr[i],mp.get(arr[i])+1);
            // }
            // else mp.put(arr[i],1);
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            
        }
        // Set<Integer>keySet=mp.keySet();
        // for(Integer key:keySet){
        //     if(mp.get(key)>arr.length/3) {
        //         System.out.println("Key is "+key);
        //     }
                
        // }
       
        for(Integer key:mp.keySet()){
            if(mp.get(key)>arr.length/3) {
                System.out.println("Key is "+key);
            }
                
        }
        // time complexity O(N);
         
    }
}