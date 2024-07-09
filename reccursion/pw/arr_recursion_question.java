import java.util.ArrayList;

public class arr_recursion_question {
    public static void main(String args[]){
    //  array recurssion question 
    int arr[]={1,2,3,5,5};

    // isSorted array  
    // System.out.println(isSorted(arr,1));
    // System.out.println(isSorted1(arr, 0)); // fails for arr like [1 ,1,3 ,4]
    
    // is key/item present in arr 
    // System.out.println(isPresent(arr,5,0));
    // System.out.println(findItem(arr,5, 0));
   
    // find all index of given key
    // FindAllIndex(arr,5,0);
    // System.out.println(ans);

    // find the key and add there index to the arraylist and return  the arraylist 
    // System.out.println(FindAllindex1(arr,5,0,new ArrayList<>()));
    
    // define arraylist inside the body of function , and return the list 
    // System.out.println(FindAllindex2(arr,5,0));
    

    // Search in a rotated array using binary search approach 
    int rotateArr[]={5,6,7,8,9,1,2,3,4};
    System.out.println(searchInRotatedArr(rotateArr,1,0,rotateArr.length-1));
    }


// 09/07/2024
 
    // isSorted array 
    static int isSorted(int arr[],int i){
        if(i==arr.length) return 1;
        if(arr[i-1] >arr[i]) return -1;
        return isSorted(arr, i+1);
    }
    static  boolean isSorted1(int arr[],int i){
        if(i==arr.length-1) return true;
        return arr[i]<arr[i+1] && isSorted1(arr, i+1);
    }
  
    // ----Is key present in arr---
    
    static int isPresent(int arr[],int key,int i){
        if(i==arr.length) return -1; // not present 
        if(arr[i]==key) return i;
        return isPresent(arr, key, i+1);
    }
    // or
    static boolean findItem(int arr[],int target,int index){
        if(index==arr.length) return false;
        return arr[index]==target || findItem(arr,target,index+1);
    }
    //  Find all index 
    static ArrayList<Integer>ans=new ArrayList<Integer>();
    void FindAllIndex(int arr[],int k,int i){
        if(i==arr.length){
            return;
        }
        if(arr[i]==k)ans.add(i);
        FindAllIndex(arr, k, i+1);
    }
   
    // add all index , return the arralyList 
    static ArrayList<Integer>FindAllindex1(int arr[],int target,int index,ArrayList<Integer>list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return FindAllindex1(arr,target,index+1,list);
    }
    //  Make arraylist inside the body ,return arralyList 
    static ArrayList<Integer>FindAllindex2(int arr[],int target,int index){
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer>ansFromBelowCalls= FindAllindex2(arr,target,index+1);
        list.addAll(ansFromBelowCalls); 
        return list;
    } 

    // -------Roated Binary Search , given a rotated arr search a key------
    static int searchInRotatedArr(int arr[],int target,int s,int e){
    if(s>e) return -1;
    int m=s+(e-s)/2;
    if(arr[m]==target) return m;
    
    if(arr[s]<=arr[m]){
        if(target>=arr[s]&& target<=arr[m]){
            return searchInRotatedArr(arr, target, s, m-1);
        }
        else{
            return searchInRotatedArr(arr, target, m-1, e);
        }
    }
    if(target>=arr[m]&& target<=arr[e]){
        return searchInRotatedArr(arr, target, m+1, e);
    }
    return searchInRotatedArr(arr, target, s, m-1);
}

}


