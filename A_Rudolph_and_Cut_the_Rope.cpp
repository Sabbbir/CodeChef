//
//    A_Rudolph_and_Cut_the_Rope.cpp
//
#include <bits/stdc++.h>
const char nl = '\n';
using namespace std;

void solve()
{
    int t, t1, inp, count = 0;
    cin >> inp;
    for (int i = 0; i < inp; i++)
    {
        cin >> t >> t1;
        if (t > t1)
        {
            count++;
        }
    }
    cout << count << nl;
}

int main()
{
    int T;
    cin >> T;
    while (T--)
    {
        solve();
    }
}