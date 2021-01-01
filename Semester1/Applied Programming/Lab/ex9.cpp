#include <iostream>
using namespace std;

struct student{
    char name[30];
    float marks;
};

main (){
    student s1;
    cin>>s1.name;
    cin>>s1.marks;

    cout<<"Name is: "<<s1.name;
    cout<<"Marks are:"<<s1.marks;
}