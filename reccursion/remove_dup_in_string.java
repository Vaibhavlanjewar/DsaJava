
public class remove_dup_in_string {
    public static void removedup(String str, int indx,StringBuilder newstr,boolean []map){
       if(indx==str.length()) {
        System.out.println(newstr); 
        return ;
       }
       // task
       char currChar=str.charAt(indx);
       if(map[currChar-'a']==true){
        removedup(str, indx+1, newstr, map);
       }
       else{
        map[currChar-'a']=true;
        removedup(str,indx+1, newstr.append(currChar), map);
       }
    }

public static void main(String [] args){
    String str="vaibhavlanjewaraaaa";
    removedup(str,0,new StringBuilder(""),new boolean[26]);
     
}    
}
