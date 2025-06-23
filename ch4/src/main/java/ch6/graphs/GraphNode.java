package ch6.graphs;

import java.util.ArrayList;
import java.util.List;

public class GraphNode {
    private String nodeName;
    private List<GraphNode> children;

    public GraphNode(String nodeName) {
        this.nodeName = nodeName;
        children = new ArrayList<GraphNode>();
    }

    public GraphNode(String nodeName, List<GraphNode> children) {
        this.nodeName = nodeName;
        this.children = children;
    }

    public String getNodeName() {
        return nodeName;
    }

    public List<GraphNode> getChildren() {
        return children;
    }

    public void setChildren(List<GraphNode> children) {
        this.children = children;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public void addChild(GraphNode child) {
        children.add(child);
    }


}
