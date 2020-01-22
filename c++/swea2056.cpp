#include<cstdio>

int main()
{
	int tc;
	scanf("%d", &tc);
	for(int t = 1 ; t <= tc ; t++)
	{
		int input;
		scanf("%d", &input);
		int y = input / 10000;
		input %= 10000;
		int m = input / 100, d = input % 100;
		int day[] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
		if (m > 12)
			printf("#%d -1\n",t);
		else if (d > day[m])
			printf("#%d -1\n",t);
		else
			printf("#%d %04d/%02d/%02d\n", t, y, m, d);
	}
}