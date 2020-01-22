#include<cstdio>
#include<algorithm>
using namespace std;

int main()
{
	int tc;
	scanf("%d", &tc);
	for (int t = 1; t <= tc; t++)
	{
		int n, m, w[1001];
		scanf("%d %d", &n, &m);
		for (int i = 0; i < n; i++)
			scanf("%d", &w[i]);

		int ans = -1;
		for (int i = 0; i < n - 1; i++)
			for (int j = i + 1; j < n; j++)
				if(w[i] + w[j] <= m)
					ans = max(ans, w[i] + w[j]);
		printf("#%d %d\n", t, ans);
	}
}