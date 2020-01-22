#include<cstdio>
#include<queue>
using namespace std;
int main()
{
	int tc;
	scanf("%d", &tc);
	for (int t = 1; t <= tc; t++)
	{
		int n, m, p[101] = { 0 }, w[2001] = { 0 };
		scanf("%d %d", &n, &m);
		for (int i = 1; i <= n; i++)
			scanf("%d", &p[i]);
		for (int i = 1; i <= m; i++)
			scanf("%d", &w[i]);

		bool pc[101] = { false };
		int cnt = 0, pn[2001] = { 0 }, ans = 0;
		queue<int> q;
		for (int i = 1; i <= 2 * m; i++)
		{
			int now;
			scanf("%d", &now);
			if (now > 0)
			{
				if (cnt < n)
				{
					for (int j = 1; j <= n; j++)
					{
						if (!pc[j])
						{
							pc[j] = true;
							pn[now] = j;
							cnt++;
							break;
						}
					}
				}
				else
					q.push(now);
			}
			else
			{
				if (pn[-now] == 0)
					q.push(now);
				else
				{
					pc[pn[-now]] = false;
					cnt--;
					ans += w[-now] * p[pn[-now]];
					int qsize = q.size();
					for (int j = 0; j < qsize; j++)
					{
						int nnow = q.front();
						q.pop();
						if (nnow > 0)
						{
							if (cnt < n)
							{
								for (int k = 1; k <= n; k++)
								{
									if (!pc[k])
									{
										pc[k] = true;
										pn[nnow] = k;
										cnt++;
										break;
									}
								}
							}
							else
								q.push(nnow);
						}
						else
						{
							if (pn[-nnow] == 0)
								q.push(nnow);
							else
							{
								pc[pn[-nnow]] = false;
								cnt--;
								ans += w[-nnow] * p[-nnow];
							}
						}
					}
				}
			}
		}
		printf("#%d %d\n", t, ans);
	}
}