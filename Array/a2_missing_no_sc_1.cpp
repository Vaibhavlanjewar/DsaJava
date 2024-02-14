#include<iostream>
#include<vector>
using namespace std;

void missing_no(vector<int>&a,int n){
int sum=0;
for(int i=0;i<n;i++){
    sum+=a[i];

}
int dif= n*(n+1)/2;
cout<<"Missing NO is"<<dif-sum;
}

int main(){
    int n=7 ;
   
    vector<int>a={2,3,4,1,6, 7};
   
missing_no(a,n);
return 0;

}
