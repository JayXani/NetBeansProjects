package testedecódigos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author Danilo
 */
public class TesteDeCódigos {

        public static void breadthFirstSearch(Graph graph, int startVertex) {
            boolean[] visited = new boolean[graph.getNumVertices()];
            Queue<Integer> queue = new LinkedList<>();

            visited[startVertex] = true;
            queue.add(startVertex);

            while (!queue.isEmpty()) {
                int currentVertex = queue.poll();
                System.out.print(currentVertex + " ");

                List<Integer> adjacentVertices = graph.getAdjacentVertices(currentVertex);
                for (int vertex : adjacentVertices) {
                    if (!visited[vertex]) {
                        visited[vertex] = true;
                        queue.add(vertex);
                    }
                }
            }
        }

        public static void main(String[] args) {
            Graph graph = new Graph(6);
            graph.addEdge(0, 1);
            graph.addEdge(0, 2);
            graph.addEdge(1, 3);
            graph.addEdge(2, 4);
            graph.addEdge(2, 5);

            System.out.println("Breadth-First Search traversal:");
            breadthFirstSearch(graph, 0);
        }
    
}

class Graph {

    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>();

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }

    public List<Integer> getAdjacentVertices(int vertex) {
        return adjacencyList.get(vertex);
    }

    public int getNumVertices() {
        return numVertices;
    }
}
