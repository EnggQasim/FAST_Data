#include <iostream>
using namespace std;

void printarr_usingpointer(int a[]){
    int *pi;
    for (int i=0;i<5;i++){
        cout<<"Value array:"<<*pi<<"address:"<<pi <<endl;
        pi++;
    }
}

void printdetail(int a[]){
    for(int i=0; i<5;i++){
        cout<<"Value in array "<<a[i]<<"at address: "<<&a[i]<<endl;
    }
}


int main(){
    int a[5];

    for (int i=0; i<5;i++){
        {a[i]=i;}
    }

   // printdetail(a);
    printarr_usingpointer(a);

}


