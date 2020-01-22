package p0127;

import java.util.Scanner;

public class swea1961 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++)
		{
			int n = sc.nextInt();
			int[][] map = new int[n][n];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					map[i][j] = sc.nextInt();
			System.out.printf("#%d\n", t);
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++) System.out.printf("%d", map[n - 1 - j][i]);
				System.out.print(" ");
				for (int j = 0; j < n; j++) System.out.printf("%d", map[n - 1 - i][n - 1 - j]);
				System.out.print(" ");
				for (int j = 0; j < n; j++) System.out.printf("%d", map[j][n - 1 - i]);
				System.out.println();
			}
		}
	}

}
