#import<bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    string inp, ans = ""; cin >> inp;

    for(int i = 0; i < inp.length(); i++){
        if (isupper(inp.at(i))){
            ans += inp.at(i);
        } 
    }
    cout << ans << "\n";
    return 0;
}
