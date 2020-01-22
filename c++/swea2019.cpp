#include<cstdio>
#include<cmath>
int main()
{
	int n;
	scanf("%d", &n);

	for (int i = 0; i <= n; i++)
		printf("%d ", int(std::pow(2,i)));
}