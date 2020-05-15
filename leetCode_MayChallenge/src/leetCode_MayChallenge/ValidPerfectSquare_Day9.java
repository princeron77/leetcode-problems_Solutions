package leetCode_MayChallenge;

import java.util.Scanner;

public class ValidPerfectSquare_Day9 {
	public static int valPerfect(int n) {
		for(int i=0;i<n;i++) {
				if(i*i==n) {
					return 1;
				}
		}
		return 0;
		}
	public static void  main(String[] args) {
		Scanner z=new Scanner(System.in);
		int n=z.nextInt();
		int a=valPerfect(n);
		System.out.println(a);
	}
}
