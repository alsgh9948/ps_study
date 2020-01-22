package ps;

import java.util.Scanner;

public class swea_1954 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int dx[] = {0,1,0,-1};
		int dy[] = {1,0,-1,0};
		for (int t = 1; t <= tc; t++)
		{
			int n =sc.nextInt();
			int x = 0, y = 0,num = 1,d=0;
			int[][] map = new int[n][n];
			while(true)
			{
				map[x][y] = num++;
				if(num > n*n) break;
				x+=dx[d];
				y+=dy[d];
				if((x < 0 || y < 0 || x>= n || y >= n) || (map[x][y] != 0))
				{
					x-=dx[d];
					y-=dy[d];
					d = (d+1)%4;
					x+=dx[d];
					y+=dy[d];
				}
			}
			System.out.println("#"+t);
			for(int i = 0 ; i < n ; i++)
			{
				for(int j = 0 ; j < n ; j++)
					System.out.print(map[i][j]+" ");
				System.out.println();
			}
		}
	}

}
