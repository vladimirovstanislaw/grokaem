package ch6.graphs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<GraphNode> myChilds = new ArrayList<>();
        myChilds.add(new GraphNode("alice"));
        myChilds.add(new GraphNode("bob"));
        myChilds.add(new GraphNode("claire"));
        GraphNode you = new GraphNode("you", myChilds);

    }
}
