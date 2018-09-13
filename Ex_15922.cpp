#include <iostream>
using namespace std;

int main() {

	int n, a, b, index = -1000000000, i, sum = 0;

	cin >> n;

	for (i = 0; i < n; i++)
	{
		cin >> a >> b;

		if (index <= a)
		{
			sum += (b - a);
			index = b;
		}
		else if (index <= b)
		{
			sum += (b - index);
			index = b;
		}
	}

	cout << sum;

	return 0;
}
