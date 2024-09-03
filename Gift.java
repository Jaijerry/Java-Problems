import java.util.*;

public class Gift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] rel = new int[m][2];
        for(int i=0;i<m;i++) {
            rel[i][0] = sc.nextInt();
            rel[i][1] = sc.nextInt();
        }
        int john = sc.nextInt();
        int dave = sc.nextInt();
        sc.close();
        int result = -1;
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(int i=1;i<=n;i++) {
            adjList.put(i, new ArrayList<>());
        }
        for(int i=0;i<m;i++) {
            int u = rel[i][0];
            int v = rel[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        Map<Integer, Integer> dist = new HashMap<>();
        queue.add(john);
        visited.add(john);
        dist.put(john, 0);
        while(!queue.isEmpty()) {
            int curr = queue.poll();
            for(int near : adjList.get(curr)) {
                if(!visited.contains(near)) {
                    queue.add(near);
                    visited.add(near);
                    dist.put(near, dist.get(curr)+1);

                    if(near == dave){
                        result = dist.get(near)-1;
                    }
                }
            }
        }
        System.out.println(result);
    }
}
