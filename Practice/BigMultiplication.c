#include <stdio.h>
int main()
{
	int t;
	scanf("%d", &t);
	int a[t][2];
	for(int i=0;i<t;i++){
		for(int j=0;j<2;j++){
			scanf("%d",a[i][j]);
		}
	}

	for(int i=0;i<t;i++){
		printf((a[i][0]*a[i][1])%3);
	}
	return 0;
}