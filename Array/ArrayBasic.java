public class ArrayBasic{

    public static void update(int marks[],int nc){
        nc=10; // only update in given function not in main function 
        System.out.println("nonchangeable  in update function "+ nc);
        for(int i=0;i<marks.length;i++){
            marks[i]+=1;
        }
    }
    public static void main(String args[]){
        int marks[]={97,98,99};
        int nonchangeable=1;
        update(marks, nonchangeable);
        
        System.out.println("nc=1 original,Value of Non changeable in main function after passing to the update function is:"+ nonchangeable+"\n");
        // print marks 

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]+  " ");
        }
        System.out.println();
    }
}