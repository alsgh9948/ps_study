package p0127;

import java.util.Scanner;

public class swea1974 {

	static int calc_idx(int i, int j)
	{
		return (3 * (i / 3) + j / 3);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++)
		{
			boolean[][] row, col, squ;
			boolean flag = false;
			row = new boolean[9][10];
			col = new boolean[9][10];
			squ = new boolean[9][10];
			int[][] map = new int[9][9];
			for (int i = 0; i < 9; i++)
				for (int j = 0; j < 9; j++)
					map[i][j] = sc.nextInt();
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
				System.out.printf("#%d 1\n",t);
			else
				System.out.printf("#%d 0\n", t);
		}
	}

}
