//    
//    B_Parity_Sort.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;


bool solve(){
    int t;
    cin >> t;
    vector<int> v(t);
    vector<int> b(t);

    for (int i = 0; i < t; i++){
        cin>>v[i];
        b[i] = v[i];
    }
    sort(v.begin(), v.end());

    for(int i=0;i<t;i++){

        if((v[i]%2)!=(b[i]%2)){
            return false;
        }
    }
    return true;
}


int main() {
    int T;
    cin >> T;
    while (T--) {
        cout<<(solve() ? "YES" : "NO")<<nl;
    }
    return 0;
}