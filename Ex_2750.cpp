#include <iostream>

using namespace std;

int main(void){
	int i, arr[1000] = {0}, n, temp, j;

	cin >> n;

	for (i = 0; i < n; i++)
	{
		cin >> arr[i];
	}

	for (i = 0; i < n; i++)
	{
		for (j = 0; j < n; j++)
		{
			if(arr[j] > arr[i])
			{
				temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
	}

	for(i = 0; i < n; i++)
	{
		cout << arr[i] << endl;
	}
}
