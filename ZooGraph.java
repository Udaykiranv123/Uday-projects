import java.util.*;

package xyz;

public class ZooGraph {
	private Map<String, List<String>> graph;
	
	public ZooGraph() {
		graph = new HashMap<>();
		
		graph.put("Entrance",Arrays.asList("Reptile House", "Bird Sanctuary", "Mammal Zone"));
		graph.put("Reptile House", Collections.singletonList("Snake Pit"));
		graph.put("Bird Snactuary", Collections.singletonList("Parrort Pavillion"));
		graph.put("Mammal Zone", Arrays.asList("Lion Den", "Elephant Enclousure"));
		
		
		graph.put("Snake Pit", Collections.emptyList());
		graph.put("Parrot Pavillion", Collections.emptyList());
		graph.put("Lion Den", Collections.emptyList());
		graph.put("Elephant Enclosure", Collections.emptyList());
	}
	
	public void printGraph() {
		for (String zonne : graph.keySet()) {
			List<String> connections = graph.get(zone);
			if(connections.isEmpty()) {
				System.out.println(zone + "has no further zones.");
			} else {
				System.out.println(zonr + "connects to:" + String.join(", ",  connections));
			}
		}
	}
	public static void main(String[] args) {
		ZooGraph zoo = new ZooGraph();
		zoo.printGraph();
	}
}
