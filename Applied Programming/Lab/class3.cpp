#include <iostream>
using namespace std;

int main(){
    int i;
    int *ia;

    cout << "The address of i "<<&i<<"Value="<<i<<endl;
    cout << "The address of i "<<&i<<"Value="<<i<<endl;

    i = 10;
    ia = &i;

    cout<<"after assigning value"<<endl;
    cout<<"The address of i "<<&i<<"value="<<i<<endl;
    cout<<"The address of ia "<<&ia<<" value="<<&ia<<endl;
}