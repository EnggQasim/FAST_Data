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

void printatt(int *a[]){
    printf("Address1\tAddress2\tValue\n");
   for (int j=0; j<5;j++){
       cout<<*a[j]<<"\t"<<a[j]<<"\t"<<&a[j]<<endl;
   }
}

int *a[5];

int main(){
    int i1=4,i2=3,i3=5,i4=7,i5=20;
    a[0]=&i1;
    a[1]=&i2;
    a[2]=&i3;
    a[3]=&i4;
    a[4]=&i5;
   // printdetail(a);
   //printarr_usingpointer(a);
   printatt(a);

   

}


