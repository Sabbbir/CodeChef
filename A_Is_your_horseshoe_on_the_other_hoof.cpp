#include<bits/stdc++.h>
using namespace std;
int main(){
    int a,b,c,d;
    cin >> a >> b >> c >> d;

    vector<int> v;
    v.push_back(a);
    v.push_back(b);
    v.push_back(c);
    v.push_back(d);

    sort(v.begin(), v.end());

int sz = unique(v.begin(), v.end()) - v.begin();

    // for(auto aa: v){
    //     cout<<aa<<endl;
    // }    
    cout<<4-sz<<endl;

}