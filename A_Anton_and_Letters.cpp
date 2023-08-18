#include<bits/stdc++.h>
using namespace std;
int main(){
    vector<int> v;
    char a;
    int count = 0;

    while(a!='}'){
        cin>>a;
        if(a>=97 && a<=122){
            v.push_back(a);
        }
    }
    sort(v.begin(), v.end());
    int sz= unique(v.begin(), v.end()) - v.begin();
    
    cout<<sz;
}