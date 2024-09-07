#include<iostream>
#include<stack>
using namespace std;
void reverstack(stack<int>&s){
    if(s.empty()) return;
    int temp = s.top();
    s.pop();
    reverstack(s);
    s.push(temp);
}

int main(){
    stack<int>s;
    s.push(10);
    s.push(20);
    s.push(30);
    cout<<"Original Stack: ";
    while(!s.empty()){
        cout<<s.top()<<endl;
        s.pop(); 
    }
    reverstack(s);
   cout<<"after "<<endl;
      while(!s.empty()){
        cout<<s.top()<<endl;
        s.pop();
    }

return 0;
}