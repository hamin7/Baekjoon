#include <iostream>

using namespace std;

int main(void){
	int n,i;
	cin >> n;

	for(i = 1; i <= n; ++i){
		for(int j = n-i; j >= 0; --j)
		{
			cout << "*";
		}
		cout << endl;
	}
}
