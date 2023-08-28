//    
//    C_Word_on_the_Paper.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int t, count = 0;
    vector<string> v(8);
    for(int i=0 ; i<8 ; i++){
        cin>>v[i];
    }
    for(int i=0 ; i<8 ; i++){
        // cout<<v[i];
        if(v[i] != "........"){
            string s = v[i];
            // cout<<s<<nl;
            string ss = "";
            for(int j=0 ; j<s.size() ; j++){
                if(s[j] != '.'){
                    ss += s[j]; 
                }
            }   
            cout<<ss;         
        }
    }
            cout<<nl;

    v.clear();
}


int main() {
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
}