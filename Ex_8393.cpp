#include <iostream>

using namespace std;

int main(void){
	int n, i, sum = 0;
	cin >> n;
	for(i = 1; i <= n; i++)
	{
		sum += i;
	}
	cout << sum << endl;
}
