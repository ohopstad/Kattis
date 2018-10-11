#import<bits/stdc++.h>
using namespace std;

int main(int argc, char const *argv[])
{
    int ans = 0, card[3] = {0, 0, 0}, pairs = -1;
    string inp;
    cin >> inp;
    for (int i = 0; i < inp.length(); i++){
        switch(inp.at(i)){
            case 'T': 
                card[0]++;
                break;
            case 'C': 
                card[1]++;
                break;
            case 'G': 
                card[2]++;
                break;
        }
    }
    for (int i = 0; i < 3; i++){
        ans += pow(card[i], 2);
        if (card[i] < pairs || pairs == -1){
            pairs = card[i];
        }
    }
    ans += pairs * 7;
    cout << ans << "\n";
    return 0;
}
