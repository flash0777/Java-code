#include <iostream>
using namespace std;

// classes are extension of structure
class Employee
{
    private:
       int a,b,c;
    public:
       int d,e;
       void setData(int a, int b, int c);
       void getData(){
        cout<<"the value of a is "<<a<<endl;
        cout<<"the value of b is "<<b<<endl;
        cout<<"the value of c is "<<c<<endl;
        cout<<"the value of d is "<<d<<endl;
        cout<<"the value of e is "<<e<<endl;
       }
};

void Employee :: setData (int a1, int b1, int c1){
    a=a1;
    b=b1;
    c=c1;
}
int main(){
    Employee harry;
    //harry.a = 34;
    harry.d = 34;
    harry.e = 89;
    harry.setData(1,3,4);
    harry.getData();
    return 0;
    
   
}