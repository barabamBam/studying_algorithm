#include<iostream>
#include<stack>
#include<string>
using namespace std;
stack<int>st;

int main(void) {
	int n = 0, num;
	char order[15];

	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%s", order);
		string s = order;
		if (s == "pop") {
			if (!st.empty()) {
				printf("%d\n", st.top());
				st.pop();
			}
			else
				printf("-1\n");
		}
		else if (s == "empty") {
			printf("%d\n", st.empty());
		}
		else if (s == "top") {
			if (!st.empty()) {
				printf("%d\n", st.top());
			}
			else
				printf("-1\n");
		}
		else if (s == "size") {
			printf("%d\n", st.size());
		}
		else {
			scanf("%d", &num);
			st.push(num);
		}
	}

	return 0;
}