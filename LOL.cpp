#include<iostream>
#include<cstdio>
using namespace std;



int main() {
    int nn;
    cin>>nn;
    int const n = nn;
    int const n2 = n*n;

    int c,x,y,z,xy;
    c=n+1;
    x=1;


while(true){
    if (x<n2)
    {
        x += c;
        cout<<x<<endl;
    }
    }
    return 0;
}
