import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class rslabQ1 {
    /*Question:
Write a function that takes an input parameter as a string. The function should replace the alternate words in it with "abc". Words are separated by dots. (Avoid using inbuilt functions).

Example:

Input: "i.like.this.program.very.much"
Output: "i.abc.this.abc.very.abc"
 */
 
/* Question 2:
Write a function that takes an array of numbers as input parameter and prints the numbers that have a remainder of 4 when divided by 5.

Example:

Input: [19, 10, 44, 3, 11, 129]
Output: 19 44 129

Input: [13, 4]
Output: 4 */

/* Question 3
Write a function that takes an array of integers as input and prints the second-maximum difference between any two elements from an array.

Example:

int arr[] = {14, 12, 70, 15, 95, 65, 22, 30};
First max-difference = 95 - 12 = 83
Second max-difference = 95 - 14 = 81
So the output should be: 81 */

/* 
The question from the image is:

Question 4:
Write a program to print the frequency of these characters: b, f, j, p, v in a given string and also print the total count of these characters. (Ignore the character cases, it can be lower or upper case).

The function will take one parameter which will be a String (you do not have to write code to get the input parameter from the user). You can also choose to take a character array as an input parameter, instead of a string, if you like.

Example:

Input: "rajasoftwarelabs"
Output: b=1, f=1, j=1, Total=3

Input: "Buffet"
Output: b=1, f=2, Total=3 */

 public static void question1(){
    String str = "i.like.this.program.very.much";
    // System.out.println(str);
    String s[]=str.split("\\.");
    int n=s.length;
    for(int i=0;i<n;i++){
        if(i%2==1){
            s[i]="abc";
        }
    }
   
    StringBuilder sb=new StringBuilder();
    for(int i=0;i<n;i++){
        sb.append(s[i]);
        if(i<n-1){
            sb.append(".");
        }
    }
    System.out.println(sb.toString());
   
 }
 public static void question2(int arr[]){
    int cnt=0;
    for(int i :arr){
        if(i%5==4){
            System.out.print(i+" ");
        }
    }
  
 }

//  question3
public static int secondMax_diff(int arr[]) {
    int n=arr.length-1;
    Arrays.sort(arr);
    return arr[n]-arr[1];
}

// Question 4.
public static void question4() {
String str="rajasoftwarelabs";
char s[]=str.toCharArray();
// b, f, j, p, v
int b=0,f=0,j=0,p=0,v=0;
HashMap<Character,Integer>mp=new HashMap<>();
for(char ch:s){
    // if(ch=='b'){
    //  b++;
    // }
    // if(ch=='f'){
    //     f++;
    // }
    // if(ch=='j'){
    //     j++;
    // }
    // if(ch=='p'){
    //   p++;
    // }
    // if(ch=='v'){
    //     v++;
    // }
     if(ch=='b' || ch=='f' ||ch=='p' ||ch=='v' ||ch=='j' ){
     mp.put(ch,mp.getOrDefault(mp, 0)+1);
     }
    

    }
    int sum=0;
    for(char ch:mp.keySet()){
        sum+=mp.get(ch);
        System.out.println(ch+"= " +mp.get(ch));
    }
    System.out.println("total="+sum);
 
}

// ------------------------------
 public static void main(String args[]){
//    question1();

// question 2
  Scanner sc=new Scanner(System.in);
//   int n=sc.nextInt();
//   int arr[]=new int[6];

//   for(int i=0;i<n;i++){
//     arr[i]=sc.nextInt();
//   }

// int arr[]={19,10,44,3,11,29}; 
// question2(arr);
 
//  int[]arr={14, 12, 70, 15, 95, 65, 22, 30};
//   System.out.println(secondMax_diff(arr));

// question4();

// question 5 
int v=sc.nextInt();
System.out.println(question5(v));


 }
}
