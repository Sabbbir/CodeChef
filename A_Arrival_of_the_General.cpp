//
//    A_Arrival_of_the_General.cpp
//
#include <bits/stdc++.h>
using namespace std;
int main()
{
    int inp;
    vector<int> v;

    cin>>inp;

    for(int i=0; i<inp; i++){
        int ttt;
        cin>>ttt;
        v.push_back(ttt);
    }
int mox = -1 ;
int max = -200;
for(int i = 0;i<v.size();i++){
    if(v[i] > max){
        max = v[i];
        mox = i;
    }
}
int aaa = -1;
int min = 200;
for(int i = 0;i<v.size();i++){
    if(v[i] <= min){
        min = v[i];
        aaa = i;
    }
}

if(aaa>mox){
    cout<<mox+(inp-1)-aaa<<endl;
}
else{
    cout<<mox+(inp-1)-aaa - 1 <<endl;
}
}