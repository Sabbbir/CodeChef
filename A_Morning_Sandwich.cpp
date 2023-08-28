//    
//    A_Morning_Sandwich.cpp
//   
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int b,c,h, t1, count = 0;
    cin >> b>>c>>h;
    int la = c+h;
    if(b>la){
        cout<<(la*2+1)<<nl;
    }
    else if(la>b){
        cout<<((b-1)*2)+1<<nl;
    }
    else{
        cout<<b+(la-1)<<nl;
    }


}


int main() {
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
}
