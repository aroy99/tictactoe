public class Tree{
  Node head =  new Node(-1);
      
  public void print(Node head, int level) {
      for (int i = 1; i < level; i++) {
          System.out.print("\t");
      }
      System.out.println(head.position);
      for (Node child : head.children) {
          print(child, level + 1);
      }
  }
  
  public void move(int position) {
    for(Node child: head.children) {
      if(child.position == position) {
        head = child;
      }
    }
  }
  
}
