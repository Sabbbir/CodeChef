//    
//    A_Array_Coloring.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int t;
    cin >> t;
    vector<int> v(t);
    for(int i=0; i<t;i++){
        cin>>v[i];
    }
    int countOdd = 0, countEven = 0;
    for(int i=0; i<t;i++){
        if(v[i]%2==0){
            countOdd+=v[i];
        }
        else{
            countEven+=v[i];
        }
    }
     if(countOdd%2==0 && countEven%2==0){
            cout<<"YES"<<nl;
        }
        else{
            cout<<"NO"<<nl;
        }
}



int main() {
    int T;
    cin >> T;
    
    while (T--) {
        solve();
    }
    
}



