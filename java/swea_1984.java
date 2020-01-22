package ps;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class swea_1984 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		for(int t = 1 ; t <= tc ; t++)
		{
			int arr[] = new int[10];
			int sum = 0;
			for(int i = 0 ; i < 10 ; i++)
			{
				arr[i] = sc.nextInt();
				sum +=arr[i];
			}
			Arrays.sort(arr);
			sum -= (arr[0]+arr[9]);
			System.out.println("#"+t+" "+(int)Math.round(sum/8.0));
		}
	}

}
