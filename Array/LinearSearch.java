public class LinearSearch {
    public static int Linear_Search(int num[],int key){
         
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int StringSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
           if(menu[i].equalsIgnoreCase(key)){
            return i;
           }
        }
        return -1;
    }
    public static void main(String[] args) {
         int num[]={2,4,6,8,10,12,14,16};
         int key=8;

         int index=Linear_Search(num,key);
         if(index==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Key: "+key+  " is at index : "+index);
        }

        String menu[]={"dosa","idli","paratha","maggi"};
        String key1="idli";

        int indx=StringSearch(menu,key1);

         if(indx==-1){
            System.out.println("Not found ");
        }
        else{
            System.out.println("Key : " +key1+ " is at index : "+indx);
        }
    }
}
