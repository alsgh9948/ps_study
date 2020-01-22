package p0127;

import java.util.Scanner;
import java.util.Stack;

public class swea8931 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for (int t = 1; t <= tc; t++)
		{
			int k =sc.nextInt(),sum = 0;
			Stack<Integer> s = new Stack<>();
			for(int i = 0 ; i < k ; i++)
			{
				int x = sc.nextInt();
				if(x != 0)
				{
					s.push(x);
					sum +=x;
				}
				else
					sum -= s.pop();
			}
			System.out.println("#"+t+" "+sum);
		}
		
	}
}
