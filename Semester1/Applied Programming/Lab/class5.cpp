#include <iostream>
using namespace std;

void print_usingptr(int a[][2]){
    int *b;
    b=a[0];
    for (int i=0; i<6; i++){
        cout<<"value: "<<*b<<"in address:"<<b<<endl;
        b++;
    }
}

int main(){
    int a[3][2];
    for (int i=0; i<3;i++){
        for (int j =0; i<2; j++){
            a[i][j] = i*j*i*j;
        }
    }
}