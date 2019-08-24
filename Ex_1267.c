#include<stdio.h>

int main(){
	int i, y = 0, m = 0, q, n, s[20];
	scanf("%d", &n);
	for ( i = 0; i < n; i++)
		scanf("%d", &s[i]);
	for ( i = 0; i < n; i++){
		q = s[i] / 30;
		if (s[i] % 30 >= 0)
			y += 10;
		y += q * 10;
		q = s[i] / 60;
		if (s[i] % 60 >= 0)
			m += 15;
		m += q * 15;
	}
	if(y == m)
		printf("Y ");
	printf("%c %d", y < m ? 'Y' : 'M', y < m ? y : m);
}
