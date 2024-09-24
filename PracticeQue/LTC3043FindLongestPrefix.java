import java.util.HashSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LTC3043FindLongestPrefix {
// https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/submissions/1400943910/?envType=daily-question&envId=2024-09-24
    public static int longestCommonPrefix(int[] arr1, int[] arr2) {
        HashSet<String> pref = new HashSet<>();

        for (int num:arr1 ) {
            String numStr=String.valueOf(num);
          
            for(int j=1;j<=numStr.length();j++) {
                pref.add(numStr.substring(0,j));

            }
        }
        // HashSet<Integer>pref1=new HashSet<>();
     
        int maxval =0;
        for (int i = 0; i < arr2.length; i++) {
            int num = arr2[i];
            String prefix=String.valueOf(num);
            for(int j=1;j<=prefix.length();j++){
             String r=prefix.substring(0,j);
             if(pref.contains(r)){
              maxval=Math.max(maxval,j);
             }
             else{
                break;
             }
            }
        }

        return maxval;

    }


    public static void main(String[] args) {
        int arr1[] = { 1, 10, 100 };
        int arr2[] = { 1000 };
        System.out.println(longestCommonPrefix(arr1, arr2));

    }
}
