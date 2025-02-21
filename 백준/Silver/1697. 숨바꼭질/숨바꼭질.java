import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int N=sc.nextInt(); //수빈
		int K=sc.nextInt(); //동생
		sc.nextLine();

		int maxN = 100000;
		int cnt = 0; //시간 카운팅
		boolean[] visited = new boolean[maxN + 1];
		
		q.add(N);
		visited[N]=true;
		
		while(!q.isEmpty()) {
			int qsize = q.size();
			for(int i = 0; i < qsize; i++) {
				int x = q.poll();
				
				if(x==K) {
					System.out.println(cnt);
					return;
				}
				
				if(2*x<=maxN && !visited[2*x]) {
					q.add(2*x);
					visited[2*x]=true;
				}
				if(x+1<=maxN && !visited[x+1]) {
					q.add(x+1);
					visited[x+1]=true;
				}
				if(x-1>=0 && !visited[x-1]) {
					q.add(x-1);
					visited[x-1]=true;
				}
			}
			cnt++;
		}

	}
}