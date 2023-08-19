//    
//    A_Dalton_the_Teacher.cpp
//    
#include<iostream>
#include<vector>
using namespace std;
int main() {
    int t, inp, arinp, count = 0;
    vector<int> v;
    
    cin >> t;
    
    while (t--) {
        cin>>inp;
                count=0;
        for(int i=0; i<inp; i++) {
            cin>>arinp;
            v.push_back(arinp);
            if(v[i]==i+1){
                count++;
            }
        }
        v.clear();
        if(count==0){
        cout<<0<<" ";
        }
        else if(count==1){
            cout<<1<<" ";
        }
        else if(count%2==0){
            cout<<count/2;

        }
        else{
            cout<<(count/2)+1;
        }
        
        cout<<endl;
    }
    
}