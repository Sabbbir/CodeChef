//
//    A_Hit_the_Lottery.cpp
//
#include <iostream>
#include <vector>
using namespace std;
int main()
{
    int count = 0, t, inp, reminder = 0, store;
    cin >> t;
    int arr[] = {100, 20, 10, 5, 1};
    for (int i = 0; i < t; i++)
    {
            store = t / arr[i];
            reminder = t % arr[i];
            t = reminder;
            count = count + store;
    }
    cout << count+t;
}