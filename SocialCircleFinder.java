package dsa;

import java.util.*;

public class SocialCircleFinder {

    // Recursive DFS
    public static void dfsRecursive(
            String person,
            Map<String, List<String>> graph,
            Set<String> visited,
            List<String> circle
    ) {
        visited.add(person);
        circle.add(person);
        for (String friend : graph.getOrDefault(person, new ArrayList<>())) {
            if (!visited.contains(friend)) {
                dfsRecursive(friend, graph, visited, circle);
            }
        }
    }

    // Iterative DFS
    public static List<String> dfsIterative(String start, Map<String, List<String>> graph) {
        Set<String> visited = new HashSet<>();
        List<String> circle = new ArrayList<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);

        while (!stack.isEmpty()) {
            String person = stack.pop();
            if (!visited.contains(person)) {
                visited.add(person);
                circle.add(person);
                List<String> friends = new ArrayList<>(graph.getOrDefault(person, new ArrayList<>()));
                Collections.reverse(friends); // Optional: to match recursive order
                for (String friend : friends) {
                    if (!visited.contains(friend)) {
                        stack.push(friend);
                    }
                }
            }
        }
        return circle;
    }

    // Build graph from connection pairs
    public static Map<String, List<String>> buildGraph(List<String[]> connections) {
        Map<String, List<String>> graph = new HashMap<>();
        for (String[] pair : connections) {
            String a = pair[0];
            String b = pair[1];
            graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
        }
        return graph;
    }

    public static void main(String[] args) {
        // Sample connections (undirected)
        List<String[]> connections = Arrays.asList(
                new String[]{"Alice", "Bob"},
                new String[]{"Alice", "Charlie"},
                new String[]{"Bob", "David"},
                new String[]{"Eve", "Frank"},
                new String[]{"George", "Helen"}
        );

        Map<String, List<String>> graph = buildGraph(connections);

        String startPerson = "Alice";

        // Recursive DFS
        Set<String> visitedRecursive = new HashSet<>();
        List<String> recursiveResult = new ArrayList<>();
        dfsRecursive(startPerson, graph, visitedRecursive, recursiveResult);
        System.out.println("Recursive DFS - Social Circle of " + startPerson + ": " + recursiveResult);

        // Iterative DFS
        List<String> iterativeResult = dfsIterative(startPerson, graph);
        System.out.println("Iterative DFS - Social Circle of " + startPerson + ": " + iterativeResult);
    }
}
