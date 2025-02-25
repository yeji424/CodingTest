import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		List<List<Integer>> graph = new ArrayList<>();
		
		for(int i = 0; i <= N; i++) {
			graph.add(new ArrayList());
		}
		
		int[] inDegree = new int[N + 1]; // 진입차수 배열
		
		for(int i = 0; i < M; i++) {
			int a = sc.nextInt(); // 먼저 풀 문항
			int b = sc.nextInt(); // 나중 풀 문항
			graph.get(a).add(b); // 방향 그래프 : 먼저 풀 문항에 후에 풀 문항 넣어주기
			inDegree[b]++;
		}
		
		// 원래는 q linkedList로 만들면 되는데 3번 조건을 pq로 해야 함
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
        //PriorityQueue<Integer> pq = new PriorityQueue<>();
		//List<List<Integer>> pq = new ArrayList<>();
		// PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		// 진입차수 0인 문항 큐에 추가
        for (int i = 1; i <= N; i++) {
            if (inDegree[i] == 0) {
            	pq.offer(i);
            }
        }
		
		List<Integer> result = new ArrayList();
		
		while(!pq.isEmpty()) {
			int current = pq.poll();
			// System.out.println(current + " ");
			result.add(current);
			
			// 현재 정점으로부터 다르문제에 대해
			for(int next : graph.get(current)) {
				inDegree[next]--;
				if(inDegree[next] == 0) {
					pq.offer(next);
				}
			}
		}
		
		for(int problem : result) {
			System.out.print(problem + " ");
		}
		
		sc.close();
	}
}
