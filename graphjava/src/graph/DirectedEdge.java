package graph;
public class DirectedEdge extends Edge {
  // fields

  protected static int count=0;
	protected int source;

  // constructor

	public DirectedEdge(int source,String color,Vertex[] ends,double value) {
    super();
		this.source=source;
		this.color=color;
		this.ends=ends;
		this.value=value;
	}

  // methods

  
	public Vertex getSource(){
		return this.ends[0];
	}

	public Vertex getSink(){
		return this.ends[1];
	}

  


}