public class TicTacToe{
  //Create an array of all the positons of the board
  int[] board = new int[9];
  
  public boolean add(int num, int pos){
    if(board[pos] == 0){
      board[pos] = num;
      return true;
    }
    else{
      System.out.println("Space already full at " + pos);
      return false;
    }
  }
  
  public int hasWon(){
    int[] results =  {isVertical(), isHorizontal(), isDiagonal()}; 
    
    for(int i = 0; i < results.length; i++){
      if(results[i] != 0){
        return results[i];
      }
    }
    
    return 0;
  }
       
  private int isVertical(){
    for(int i = 0; i <= 2;i++) {
      if(board[0] != 0 && board[i] == board[i+3] && board[i+6] == board[i]) {
        return board[i];
      }
    }
    return 0;
  }
       
  private int isHorizontal(){
    for(int i = 0; i<3; i++){
      if(board[0] != 0 && board[i] == board[i+1] && board[i] == board[i+2]){
        return board[i];
      }
    }
    return 0;
  }
   
  private int isDiagonal(){
    if ((board[0] != 0 && board [0] == board[4] && board[4] == board[8]) || 
        (board[0] != 0 && board [2] == board[4] && board[4] == board[6]))
      return board[4];
    
    return 0;
  }
}
