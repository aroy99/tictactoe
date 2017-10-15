import java.util.ArrayList;

public class Node{
  int position; 
  public ArrayList<Node> children = new ArrayList<Node>();
    
  public Node(int position){
    this.position = position;
  }
}
