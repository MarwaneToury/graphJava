package graph;
public interface Graph {
	
	public int nbOfVertices(){};

	public int nbOfEdges(){};

  public void addVertex(Vertex v){};

 	public void addEdge(Vertex v1,Vertex v2,EdgeKind ek) {}; // EdgeKind: 'directed' or 'undirected' 

 	public boolean isConnected(Vertex v1,Vertex v2){};

	public boolean isConnected(){};  // says whether all verticles are interconnected

 	public Edge[] getEdges(Vertex v2, Vertex v1){}; // give edge(s) connecting these verticles

 	public Edge[] getEdges(){}; // give all the edges of the graph

 	public Vertex[] getVertices(){}; // give all verticles of the graph

	public Edge[] getNeighborEdges(Vertex v){}; // give edges connected to this vertex
	
}