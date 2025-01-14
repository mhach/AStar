/**
 * Document provided with minor edits
 */

public class Node {
	
	private int row, col, f, g, h, type;
	private Node parent;
   
	public Node(int r, int c, int t){
		row = r;
		col = c;
		type = t;
		parent = null;
		//type 0 is traversable
		//type 1 is not traversable
		//type 2 is start node
		//type 3 is goal node
		//type 4 is path node
		//type 5 is visited
	}
	
	//mutator methods to set values
	public void setF(){
		f = g + h;
	}
	public void setG(int value){
		g = value;
	}
	public void setH(int value){
		h = value;
	}
	public void setParent(Node n){
		parent = n;
	}
	public void setType(int value) {
		type = value;
	}
	
	//accessor methods to get values
	public int getF(){
		return f;
	}
	public int getG(){
		return g;
	}
	public int getH(){
		return h;
	}
	public Node getParent(){
		return parent;
	}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	public int getType() {
		return type;
	}
	public boolean equals(Object in){
		//typecast to Node
		Node n = (Node) in;
		
		return row == n.getRow() && col == n.getCol();
	}
   
	public String toString(){
		return "Node: " + row + "_" + col;
	}
	
}