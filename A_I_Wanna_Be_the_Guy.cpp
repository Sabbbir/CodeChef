#include<bits/stdc++.h>
using namespace std;
int main(){
    int tc;
    cin >> tc;

    vector<int> vx;
    vector<int> vy;
    vector<int> vz;

    int lix, liy;
    cin>>lix;
    for(int i = 0; i < lix; i++){
        int x;
        cin>>x;
        vx.push_back(x);
        vz.push_back(x);
    }

    cin>>liy;
    for(int i = 0; i < liy;i++){
        int y ;
        cin>>y;
        vy.push_back(y);
        vz.push_back(y);
    }

    sort(vz.begin(),vz.end());
    int sz = unique(vz.begin(),vz.end())-vz.begin();

    // cout<<sz<<endl;

    if(sz>=tc){
        cout<<"I become the guy."<<endl;
    }
    else{
        cout<<"Oh, my keyboard!"<<endl;
    }
}