#include<iostream>
#include<vector>
using namespace std;

void misNo(vector<int>&arr,int n){

vector<int>temp;
for(int i=0;i<n;i++){
temp.push_back(i+1);

}
for(int i=0;i<n-1;i++){
    if(temp[i]!=arr[i]){
        cout<<"Mismatch No is "<<i+1<<endl;
        break;
    }
}

}
      

int main()
{
vector<int>arr={1,3,4,5};
int n=5;

misNo(arr,n);

return 0;
}