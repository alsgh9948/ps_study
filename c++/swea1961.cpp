#include<cstdio>

int main()
{

	int tc;
	scanf("%d", &tc);
	for (int t = 1; t <= tc; t++)
	{
		int n, map[7][7];
		scanf("%d", &n);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				scanf("%d", &map[i][j]);
		printf("#%d\n", t);
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++) printf("%d", map[n - 1 - j][i]);
			printf(" ");
			for (int j = 0; j < n; j++) printf("%d", map[n - 1 - i][n - 1 - j]);
			printf(" ");
			for (int j = 0; j < n; j++) printf("%d", map[j][n - 1 - i]);
			printf("\n");
		}
	}
}