#include<iostream>
using namespace std;
// lower_triangle OF MATRIX
class lower_triangle
 {
    private:
    int n;
    int  *a;
    public:
    lower_triangle()
    {
       n=2;
        a=new int[n];
    }
    lower_triangle(int n)
    {
       this->n=n;
       a=new int [n];

    }
    ~lower_triangle()
    {
        delete []a;

    }


void set (int i,int j,int x);

int get(int i, int j);
void display();


};

void lower_triangle ::set(int i,int j,int x)
{
    if(i==j)
    {

        a[i-1]=x;
    }

}

int lower_triangle :: get(int i,int j)
{
    if(i==j){
        return a[i-1];
    }
    else{
        return 0;
    
}
}

void lower_triangle :: display(){
    int i=0,j=0;
    for(i;i<n;i++)
    {
        for(j;j<n;j++)
        {
            if(i==j)
            {
                cout<<a[i-1];
                
            }
            else{
                cout<<"0 "; 
            }
            cout<<endl;
        }
    }
}

int main(){
  /* int d;
   cout<<"Enter Dimentions";
   cin>>d;
   lower_triangle dm(d);
   int x;
   cout<<"Enter all elements";
   for(int i=1;i<=d;i++){
    for(int j=1;j<=d;j++){
        cin>>x;
        dm.set(i,j,x);
    }

   }
   dm.display();
   */
  lower_triangle d(4);
  d.set(1,1,5);
  d.set(2,2,8);
  d.set(3,3,9);
  d.set(4,4,12);
 d.display();
    return 0;
}