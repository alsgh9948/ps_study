package ps;

import java.util.Scanner;

public class swea_1948 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		int day[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
		for (int t = 1; t <= tc; t++)
		{
			 int sm= sc.nextInt(),sd = sc.nextInt(), tm=sc.nextInt(),td=sc.nextInt();
			 int ans = 0;
			 for(int i = sm+1; i < tm ; i++)
				 ans +=day[i];
			 if(sm == tm)
				 ans += (td-sd)+1;
			 else
				 ans += day[sm]-sd+1 + td; 
			 System.out.println("#"+t+" "+ans);
		}
	}
}
