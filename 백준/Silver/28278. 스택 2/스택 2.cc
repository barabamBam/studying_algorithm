#include<iostream>
#include<stack>
using namespace std;
stack<int> st;

int main(void) {
    
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int num, order, x = 0;
    cin >> num;

    while (num--) {
        cin >> order;
        switch (order) {
        case 1:
            cin >> x;
            st.push(x);
            break;
        case 2:
            if (st.empty()) cout << "-1"<<"\n";
            else {
                cout << st.top()<<"\n";
                st.pop();
            }
            break;
        case 3:
            cout << st.size()<<"\n";
            break;
        case 4:
            if (st.empty()) cout << "1"<<"\n";
            else cout << "0"<<"\n";
            break;
        case 5:
            if (st.empty()) cout << "-1"<<"\n";
            else cout << st.top()<<"\n";
            break;
        }

    }
    return 0;
}