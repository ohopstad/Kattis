#import<bits/stdc++.h>
using namespace std;

int main(void){
    int mod = 42, num = 0, c = 0; 
    vector<int> nums;

    for(int i = 0; i < 10; i++){
        cin >> num;
        num %= mod;
        if(find(nums.begin(), nums.end(), num) != nums.end()){
            //do nothing
        }
        else{
            c++;
            nums.push_back(num);
        }
    }
    cout << c << "\n";
}