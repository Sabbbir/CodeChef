//    
//    A_Escalator_Conversations.cpp
//    
#include<bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve(){
    int nPeople, nStep, hDiff, vHeight,  count = 0;    
    cin >> nPeople>>nStep>>hDiff>>vHeight;

    vector<int> peopleHeight(nPeople);
    vector<int> vladHeightonStep(nStep);
    vector<int> peopleHeightonStep(nStep);
    for(int i = 0; i < nPeople;i++){
        cin>>peopleHeight[i];
    }
    for(int i = 0; i < nStep;i++){
        vladHeightonStep[i] = vHeight + hDiff*(i+1);
        // cout<<vladHeightonStep[i]<<" ";
    }
    // cout<<nl;
    // cout<<nl;

    for(int i = 0; i < nPeople;i++){
        for(int j = 0; j <nStep;j++){
            peopleHeightonStep[j] = peopleHeight[i] + hDiff*(j+1);
            // cout<<peopleHeightonStep[j]<< " ";
            if(vladHeightonStep[j]==peopleHeightonStep[j]){
                count++;
            }
        }
        
    
        // cout<<nl;

// cout<<count<<nl;
}
cout<<count<<nl;

}
int main() {
    int T;
    cin >> T;
    while (T--) {
        solve();
    }
}