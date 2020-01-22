package ps;

import java.util.Arrays;
import java.util.Scanner;

public class swea_1210 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dy[] = {1,-1};
		Scanner sc = new Scanner(System.in);
		for(int t = 0 ; t < 10 ; t++)
		{
			int[][] map = new int[100][100];
			boolean[][] visited = new boolean[100][100];
			int tc = sc.nextInt(), y = 0,x=0;
			for(int i = 0 ; i < 100 ;i++)
			{	
				for(int j = 0 ; j < 100 ; j++)
				{
					map[i][j] = sc.nextInt();
					if(map[i][j] == 2)
					{	
						x = i;
						y = j; 
					}
				}
			}
			visited[x][y] = true;
			while(true)
			{
				if(x == 0)
				{
					System.out.println("#"+tc+" "+y);
					break;
				}
				boolean c = false;
				for(int d = 0 ; d < 2 ; d++)
				{
					int ny = y + dy[d];
					if(ny < 0 || ny >= 100) continue;
					if(visited[x][ny] || map[x][ny] == 0) continue;
					visited[x][ny] = true;
					y = ny;
					c = true;
					break;
				}
				if(!c)
				{
					visited[x-1][y] = true;
					x -=1;
				}
			}
		}
	}

}
