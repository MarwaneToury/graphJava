package graph;
public class Vertex  {
	protected static int count=0;


	public Vertex(Object info, String color) {
		this.id=count;
    NV();
		this.info=info;
		this.color=color;
	}

	public static void NV(){
		count+=1;
	}

  /*
  public int nbOfVertices(){
    return this.count;
	}

	public int nbOfEdges(){
	}

  public void addVertex(Vertex v){
  }

 	public void addEdge(Vertex v1,Vertex v2,EdgeKind ek) {

 	}

 	public boolean isConnected(Vertex v1,Vertex v2){

 	}

	public boolean isConnected(){
	}

 	public Edge[] getEdges(Vertex v2, Vertex v1){
 	}

 	public Edge[] getEdges(){

 	}  

 	public Vertex[] getVertices(){
 	}

	public Edge[] getNeighborEdges(Vertex v){
	}
  */
}
/*
@startuml

class vertex {
  #id: int 
  #info: Object
  #color: String 
  }



abstract class Edge {
  #id: int
  #color: String
  #ends: Vertex[2]
  #value: double
  }

UndirectedEdge --> Edge
DirectedEdge --> Edge

class DirectedEdge {
  #source: int
  public getSource(): vertex
  public getSink(): vertex
  }

class UndirectedEdge {
  public getEnds(): Vertex[]
  }

interface Graph {
  public nbOfVertices():int
  public nbOfEdges():int
  public addVertex(Vertex)
  public addEdge(Vertex,Vertex,EdgeKind) 
  public isConnected(Vertex,Vertex):boolean 
  public isConnected(): boolean 
  public getEdges(Vertex, Vertex): Edge[] 
  public getEdges(): Edge []  
  public getVertices(): Vertex []
  public getNeighborEdges(Vertex): Edge []
  }


class TestGraph {
  v: Vertex
  e: Edge
  }

enum EdgeKind {
  directed
  undirected
  }


@enduml
*/