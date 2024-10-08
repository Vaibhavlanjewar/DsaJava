/*Q2. Given an array Arr[] of size T, contains binary digits. 
Where 
0 represents a biker running to the north. 
1 represents a biker running to the south. 
The task is to count crossing bikers in such a way that each pair of crossing bikers (N, S), where 0<=N<S<T, 
is passing when N is running to the north and S is running to the south. 

 Constraints: 
<=N<S<T 
Example -1: 
Input: 
5.-> Number of elements i.e. T
 0.-> Value of 1st element
 1.-> Value of 2nd element
 0.-> Value of 3rd element
 1.-> Value of 4th element
 1.-> Value of 5th element
 Output: 
5 
Explanation: 
The 5 pairs are (Arr[0], Arr[1]), (Arr[0], Arr[3]), (Arr[0], Arr[4]), (Arr[2], Arr[3]) and (Arr[2], Arr[4]). 
Note that in all pairs first element is 0, second element is 1 and index of first element is smaller than index 
of second element.

The Input format for testing: 
First input line: Accept a single positive integer value for T representing the size of Arr[]. 
Second input line:: Accept N number of integer values (0 or 1) separated by a new line. 
Output Format for Testing: 
The output must be a non-negative integer number only (See the output format in example). 
Additional messages in the output will result in the failure of test cases.

Code Solution 
#include <iostream> 
using namespace std; 
int main() 
{ 
int n, count=0; 
25
 cin>>n; 
int B[n]; 
for(int i=0; i<n; i++) 
cin>>B[i]; 
for(int i=0; i<n; i++) 
{ 
if(B[i]==0) 
{ 
for(int k=i+1; k<n; k++) 
{ 
if(B[k]==1) 
count++; 
} 
} 
} 
cout<<count; 
} 
*/


// my solution 
import java.util.*;

public class q12_01_ns_pair {

    public static int pair(int[] dir) {
        int n = dir.length;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (dir[i] == 0 && dir[j] == 1 && i < j) {
                    cnt++;
                }
            }

        }
        return cnt;

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dir[] = new int[n];

        for (int i = 0; i < n; i++) {
            dir[i] = sc.nextInt();
        }
        System.out.println(pair(dir));

    }

}
