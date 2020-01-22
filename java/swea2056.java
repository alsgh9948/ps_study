package p0127;

import java.util.Scanner;

public class swea2056 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1 ; t <= tc ; t++)
		{
			int input = sc.nextInt();
			int y = input / 10000;
			input %= 10000;
			int m = input / 100, d = input % 100;
			int day[] = { 0,31,28,31,30,31,30,31,31,30,31,30,31 };
			if (m > 12)
				System.out.printf("#%d -1\n",t);
			else if (d > day[m])
				System.out.printf("#%d -1\n",t);
			else
				System.out.printf("#%d %04d/%02d/%02d\n", t, y, m, d);
		}
	}
}
