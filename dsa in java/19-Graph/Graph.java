import java.util.HashMap;

public class Graph {

    public static void main(String[] args) {

        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addEdge("A", "B", 2);
        graph.addEdge("A", "D", 10);
        graph.addEdge("B", "C", 3);
        graph.addEdge("C", "D", 1);
        graph.addEdge("D", "E", 8);
        graph.addEdge("E", "F", 5);
        graph.addEdge("E", "G", 6);
        graph.addEdge("F", "G", 4);

        graph.display();

        System.out.println(GrnumVetex());
    }

    private class Vertex {
        HashMap<String, Integer> nbrs = new HashMap<>();
    }

    HashMap<String, Vertex> vtces = new HashMap<>();

    public int numVertex() {
        return this.vtces.size();
    }

    public void addVertex(String vname) {
        Vertex vtx = new Vertex();
        vtces.put(vname, vtx);
    }

    public void addEdge(String vname1, String vname2, int cost) {

        Vertex vtx1 = vtces.get(vname1); // 2k
        Vertex vtx2 = vtces.get(vname2); // 4k

        if (vtx1 == null || vtx2 == null || vtx1.nbrs.containsKey(vname2)) {
            return;
        }

        vtx1.nbrs.put(vname2, cost);
        vtx2.nbrs.put(vname1, cost);
    }

    public void display() {

        System.out.println("------------------");
        ArrayList<String> vnames = new ArrayList<>(vtces.keySet());

        for (String vname : vnames) {

            String str = vname + " => ";

            Vertex vtx = vtces.get(vname);
            str += vtx.nbrs;

            System.out.println(str);
        }
        System.out.println("------------------");

    }

}