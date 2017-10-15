public class TreePopulator{
  public static int counter = 0;
  
  public static void populateTree(Node head, int numChildren, TicTacToe board, int depth){
    counter++;
        
    if(board.hasWon() != 0) {
      return;
    }
    
    for(int i = 0; i < numChildren; i++){
      if(!board.add(depth%2+1, i)){
        continue;
      }
      Node next = new Node(i);
      
      head.children.add(next);
      
      TicTacToe newBoard = board.copy();
      
      populateTree(next, numChildren, newBoard, depth+1);
      
      board.board[i] = 0;
    }
  }
}
