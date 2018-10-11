#import<bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    int lowBound, highBound, sumAns, min = 0, max = 0, sum = 0, temp;
    cin >> lowBound >> highBound >> sumAns;
    
    for (int i = lowBound; i <= highBound; i++){
        temp = i;
        sum = 0;
        while (temp > 0){
            sum += temp % 10;
            temp /= 10;
        }
        if (sum == sumAns){
            max = i; 
            if (min == 0){
                min = i;
            }
        }
    }
    cout << min << "\n" << max << "\n";
    return 0;
}
