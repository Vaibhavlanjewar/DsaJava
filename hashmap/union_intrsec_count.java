package hashmap;

import java.util.HashSet;

public class union_intrsec_count {
    public static void main(String[] args) {
        int arr1[]={7,3,1};
        int arr2[]={6,3,9,2,9,4};

        HashSet<Integer>set=new HashSet<>();
        for (int i:arr1) set.add(i);
        for(int i:arr2) set.add(i);
        System.out.println("count of elements in union set: "+set.size());
        set.clear();

        for(int i : arr1) set.add(i);
        int cnt=0;
        for(int i:arr2){
            if(set.contains(i)) {
                cnt++;
                set.remove(i);
            }
        }
        System.out.println("count of common/intersection set el:"+cnt);
    
    }
}
