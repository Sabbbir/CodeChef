//    
//    A_Buttons.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int a,k,c, cocount;
    cin >> a>>k>>c;
    cocount = c%2;
    if(cocount==1){
        if(a==k){
            cout<<"First"<<nl;
        }
        else if(a>k){
            cout<<"First"<<nl;
        }
        else{
            cout<<"Second"<<nl;
        }
    }
    else if(cocount==0){
        if(a==k){
            cout<<"Second"<<nl;
        }
        else if(a>k){
            cout<<"First"<<nl;
        }
        else{
            cout<<"Second"<<nl;
        }
    }
}


int main() {
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
}