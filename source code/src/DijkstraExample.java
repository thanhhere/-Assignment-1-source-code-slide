import java.util.*;

public class DijkstraExample {
    static class Edge {
        int destination;
        int weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static void dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] distances = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<int[]> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        minHeap.offer(new int[]{source, 0});

        while (!minHeap.isEmpty()) {
            int[] current = minHeap.poll();
            int node = current[0];

            if (visited[node]) continue;
            visited[node] = true;

            for (Edge edge : graph.get(node)) {
                if (!visited[edge.destination]) {
                    int newDist = distances[node] + edge.weight;
                    if (newDist < distances[edge.destination]) {
                        distances[edge.destination] = newDist;
                        minHeap.offer(new int[]{edge.destination, newDist});
                    }
                }
            }
        }

        System.out.println("Shortest distances from source " + source + ": " + Arrays.toString(distances));
    }

    public static void main(String[] args) {
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges (bi-directional for this example)
        graph.get(0).add(new Edge(1, 10));
        graph.get(0).add(new Edge(2, 3));
        graph.get(1).add(new Edge(2, 1));
        graph.get(1).add(new Edge(3, 2));
        graph.get(2).add(new Edge(1, 4));
        graph.get(2).add(new Edge(3, 8));
        graph.get(2).add(new Edge(4, 2));
        graph.get(3).add(new Edge(4, 7));
        graph.get(4).add(new Edge(3, 9));

        dijkstra(graph, 0);
    }
}
