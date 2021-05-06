package graph;
public abstract class Edge {
  // fields
  protected static int count=0;

	protected int id;
	protected String color;
	protected Vertex[] ends = new Vertex[2];
	protected double value;

  public Edge(){
    this.id=count;
    NV();
  }

  // methods

  public static void NV(){
		count+=1;
	}

  /*
  public int nbOfVertices(){
    return this.ends[0].nbOfVertices();
  };

	public int nbOfEdges(){
    return this.count;
  };

  public void addVertex(Vertex v){

  };

 	public void addEdge(Vertex v1,Vertex v2,Edge EdgeKind){

  };

 	public boolean isConnected(Vertex v1,Vertex v2){};

	public boolean isConnected(){};

 	public Edge[] getEdges(Vertex v1, Vertex v2){};

 	public Edge[] getEdges(){};

 	public Vertex[] getVertices(){};

	public Edge[] getNeighborEdges(Vertex v){};
*/

}