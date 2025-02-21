import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int maxFly = 0;
			
			// 영역행렬 선언, 입력받기
			int[][] arr = new int[N][N];
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					arr[i][j] = sc.nextInt();
				}
			}

			
			for(int i = 0; i < N - M + 1; i++) {
				for(int j = 0; j < N - M + 1; j++) {
					int fly = 0;
					
					for(int a = 0; a < M; a++) {
						for(int b = 0; b < M; b++ ) {
							fly += arr[i + a][j + b];
						}
					}
					
					if(maxFly < fly) {
						maxFly = fly;
					}
				}
			}
		
		System.out.println("#" + tc + " " + maxFly);
		}
		
		sc.close();
	}

}
