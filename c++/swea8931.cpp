#include<cstdio>
#include<stack>
using namespace std;

int main()
{
	int tc;
	scanf("%d", &tc);
	for (int t = 1; t <= tc; t++)
	{
		int k, sum = 0;
		scanf("%d", &k);
		stack<int> s;
		while (k--)
		{
			int x;
			scanf("%d", &x);
			if (x != 0)
			{
				s.push(x);
				sum += x;
			}
			else
			{
				sum -= s.top();
				s.pop();

			}
		}
	}
}