import java.util.ArrayList;

public class subset_Subsequence_string {
    public static void main(String args[]) {
        // Remove a's from the string
        // way 1 ans as arg to function
        // skipA("","baccdah");

        // way 2
        // System.out.println(skipA1("baccdah"));

        // Skipp apple
        // System.out.println(skipApple("baabapleappleabc"));

        // skip app if not an apple present
        // System.out.println(skipappNotApple("appapplxyz"));
        // System.out.println(skipappNotApple("appapplexyz"));

        // Sub Sequence , subset in string 
        // subsSeq(" ","abc");

        // subsequence of string return arraylist of string 
        // ArrayList<String>ans=subseq1("","abc");
        // System.out.println(ans);

        // print subseq with ascii value 
        // subseqAscii("","abc");

        // subset of the arr
        int arr[]={1,2,3};
        ArrayList<ArrayList <Integer>>ans=subset(arr);
        System.out.println(ans);
    
    }

    // 10/07/2024

    // Remove a's from the string
    // way 1 ans as arg to function
    static void skipA(String ans, String up) {
        if (up.isEmpty()) {
            System.out.println(ans);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            // skipp a
            skipA(ans, up.substring(1));
        } else {
            // add ans+ch ,
            skipA(ans + ch, up.substring(1));
        }
    }

    // way 2 return string
    static String skipA1(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);
        if (ch == 'a') {
            // skipp a
            return skipA1(up.substring(1));
        }

        // add ans+ch ,
        return ch + skipA1(up.substring(1));

    }

    // -----Skip the apple return the string----
    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            // skipp a
            return skipA1(up.substring(5));
        }

        // add ans+ch ,
        return up.charAt(0) + skipA1(up.substring(1));

    }

    // ----Skipp app if not the apple present ------
    static String skipappNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            // skipp a
            return skipappNotApple(up.substring(3));
        }

        // add ans+ch ,
        return up.charAt(0) + skipappNotApple(up.substring(1));

    }

    // Subsequence , subset in string .
    static void subsSeq(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        subsSeq(ans, str.substring(1));
        subsSeq(ans+ch, str.substring(1));
    }
    
    // Subsequence , subset in string . return arraylist 
    static ArrayList<String>subseq1(String ans,String str){
        if(str.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch=str.charAt(0);

        ArrayList<String>left=subseq1(ans+ch,str.substring(1));
        ArrayList<String>right=subseq1(ans,str.substring(1)); 
        
        left.addAll(right);
        return left;
    }


    // Subseq , subset of string with the ascii value 
    static void subseqAscii(String ans,String str){
        if(str.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch=str.charAt(0);
        subseqAscii(ans+ch,str.substring(1));
        subseqAscii(ans,str.substring(1));
        subseqAscii(ans+(ch+0), str.substring(1)); // ch+0 for ascii value 

    }

    // -------- Subset of array 
    static ArrayList<ArrayList<Integer>>subset(int []arr){
        ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
        
        outer.add(new ArrayList<>());

        for(int num:arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                ArrayList<Integer>internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;

    }

}
