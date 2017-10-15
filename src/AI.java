import java.util.ArrayList;

public class AI {
  public static int determineNextMove(Tree tree, TicTacToe board) {
    ArrayList<Move> possibleMoves = new ArrayList<>();
    
    for(int i = 0; i < tree.head.children.size(); i++) {
      possibleMoves.add(findNextMove(0, tree.head.children.get(i).position, board));
    }
    
    return bestMove(possibleMoves).firstMove;
  }
  
  public static Move findNextMove(int depth, int firstMove, TicTacToe board) {
    if(board.hasWon() != 0 || board.isFull()) {
      Move move = new Move(depth, firstMove, board.hasWon());
      return move;
    }
    
    ArrayList<Move> possibleMoves = new ArrayList<>();
    
    for(int i = 0; i < board.board.length; i++) {
      
      TicTacToe newBoard = board.copy();
      if(newBoard.add((depth+1)%2 + 1, i)) {
        possibleMoves.add(findNextMove(depth+1, firstMove, newBoard));
      }
    }
        
    return bestMove(possibleMoves);
  }
  
  private static Move bestMove(ArrayList<Move> possibleMoves) {
    Move bestMove = possibleMoves.get(0);
    int maxDepth = bestMove.countDepth * (bestMove.winCondition == 0?0:bestMove.winCondition == 1?-1:1);
    
    for(Move move: possibleMoves) {
      int depth = move.countDepth * move.winCondition == 0?0:move.winCondition == 1?-1:1;
      
      if(depth > maxDepth) {
        bestMove = move;
        maxDepth = move.countDepth;
      }
    }

    return bestMove;
  }
  
  private static class Move{
    int countDepth;
    int firstMove;
    int winCondition;

    public Move(int countDepth, int firstMove, int winCondition) {
      this.countDepth = countDepth;
      this.firstMove = firstMove;
      this.winCondition = winCondition;
    }
    
    
  }
}