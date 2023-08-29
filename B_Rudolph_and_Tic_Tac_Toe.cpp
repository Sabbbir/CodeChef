//    
//    B_Rudolph_and_Tic_Tac_Toe.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int t, count = 0;
    string ans = "DRAW";
    vector<string> v(3);
    for(int i=0; i<3; i++){
        cin>>v[i];
    }
    for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
            if(v[i][0]==v[i][1] && v[i][1] == v[i][2] && v[i][0] != '.'){
                ans = v[i][0];
            }
        }
        for(int j=0; j<3; j++){
            if(v[0][i]==v[1][i] && v[1][i] == v[2][i] && v[0][i] != '.'){
                ans = v[0][i];
            }
        }
        if(v[0][0]==v[1][1] && v[1][1] == v[2][2] && v[0][0] != '.'){
            ans = v[0][0];
        }
        if(v[0][2]==v[1][1] && v[1][1]==v[2][0] && v[0][2]!='.'){
            ans = v[0][2];
        }
    }
    cout<<ans<<nl;
    v.clear();
}


int main() {
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
}