package graph;
public class UndirectedEdge extends Edge {

  
	public UndirectedEdge(String color,Vertex[] ends,double value){
		super();
		this.color=color;
		this.ends=ends;
		this.value=value;
	}
	public Vertex[] getEnds(){
		return this.ends;
	}

  
  
}

  