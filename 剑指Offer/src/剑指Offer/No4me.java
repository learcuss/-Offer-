package 剑指Offer;

import java.util.Scanner;

public class No4me {
	public static void main(String[] args) {
		int[][] arr1 = {
		               {1,   4,  7, 11, 15},
		               {2,   5,  8, 12, 19},
		               {3,   6,  9, 16, 22},
		               {10, 13, 14, 17, 24},
		               {18, 21, 23, 26, 30}
		};
	Scanner sc = new Scanner(System.in);	
		
		System.out.println("请输入要查询的数字:");
		int a = sc.nextInt();
		boolean tem = false;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1.length; j++) {
				if(arr1[i][j]==a){
					tem = true;
				}
			}
		}
		System.out.println(tem);

	}
}
