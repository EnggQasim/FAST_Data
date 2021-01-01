#include <iostream>
using namespace std;

struct student{
    char name[30];
    float marks;
};

main (){
    struct student *s1;
    struct student s2;

    s1 = &s2;

    cin>>s1->name; // cin(*s1).name
    cin>>s2.marks;

    cout<<(*s1).name<<" : "<<s2.marks;
    
}