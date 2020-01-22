#include<cstdio>


int calc_idx(int i, int j)
{
	return (3 * (i / 3) + j / 3);
}
int main()
{
	int tc;
	scanf("%d", &tc);
	for (int t = 1; t <= tc; t++)
	{
		bool row[9][10] = { 0, }, col[9][10] = { 0, }, squ[9][10] = { 0, };
		bool flag = false;
		int map[9][9];
		for (int i = 0; i < 9; i++)
			for (int j = 0; j < 9; j++)
				scanf("%d", &map[i][j]);
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				if (row[i][map[i][j]] || col[j][map[i][j]] || squ[calc_idx(i, j)][map[i][j]])
				{
					flag = true;
					break;
				}
				row[i][map[i][j]] = col[j][map[i][j]] = squ[calc_idx(i, j)][map[i][j]] = true;
			}
			if (flag)
				break;
		}
		if (!flag)
			printf("#%d 1\n",t);
		else
			printf("#%d 0\n", t);
	}
}