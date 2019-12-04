import java.util.*;

public class DiGraphTest
{
	public static void main(String[] args)
	{
 		// create graph
		DiGraph graph = new DiGraph();
 		// add a bunch of edges
		graph.add("A", "B", 5);
		graph.add("A", "F", 3);
		graph.add("A", "G", 4);
		graph.add("B", "C", 7);
		graph.add("C", "D", 2);
		graph.add("D", "E", 5);
		graph.add("D", "I", 3);
		graph.add("E", "K", 12);
		graph.add("F", "J", 6);
		graph.add("G", "E", 2);
		graph.add("G","H", 1);
		graph.add("G", "K", 8);


		System.out.println();


		System.out.println("A --> B");
		List<String> AB = graph.getPath("A", "B");
		for (String each : AB){
			System.out.println(each);
		}
System.out.println();
		System.out.println("A --> C");
		List<String> AC = graph.getPath("A", "C");
			for (String each : AC){
				System.out.println(each);
			}
System.out.println();
			System.out.println("A --> D");
			List<String> AD = graph.getPath("A", "D");
			for (String each : AD){
				System.out.println(each);
			}
System.out.println();
			System.out.println("A --> E");
			List<String> AE = graph.getPath("A", "E");
				for (String each : AE){
					System.out.println(each);
				}
System.out.println();


System.out.println("A --> F");
List<String> AF = graph.getPath("A", "F");
for (String each : AF){
	System.out.println(each);
}
System.out.println();
System.out.println("A --> G");
List<String> AG = graph.getPath("A", "G");
	for (String each : AG){
		System.out.println(each);
	}
System.out.println();
	System.out.println("A --> H");
	List<String> AH = graph.getPath("A", "H");
	for (String each : AH){
		System.out.println(each);
	}
System.out.println();
	System.out.println("A --> I");
	List<String> AI = graph.getPath("A", "I");
		for (String each : AI){
			System.out.println(each);
		}
System.out.println();
		System.out.println("A --> J");
		List<String> AJ = graph.getPath("A", "J");
		for (String each : AJ){
			System.out.println(each);
		}
System.out.println();
		System.out.println("A --> K");
		List<String> AK = graph.getPath("A", "K");
			for (String each : AK){
				System.out.println(each);
			}
System.out.println();

		System.out.println("Breadth First Search");
		graph.BFS();
		System.out.println();
		System.out.println("Depth First Search");
		graph.DFS();

	}
}
