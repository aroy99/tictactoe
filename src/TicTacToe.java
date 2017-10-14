public class TicTacToe{
  //Create an array of all the positons of the board
  int[] board = new int[9];
  
  public boolean add(int num, int pos){
    if(board[pos] == 0){
      board[pos] = num;
      
      System.out.println(board[pos]);
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
      if(board[i] != 0 && board[i] == board[i+3] && board[i+6] == board[i]) {
        return board[i];
      }
    }
    return 0;
  }
       
  private int isHorizontal(){
    for(int i = 0; i<9; i+=3){
      if(board[i] != 0 && board[i] == board[i+1] && board[i] == board[i+2]){
        return board[i];
      }
    }
    return 0;
  }
   
  private int isDiagonal(){
    if ((board[4] != 0 && board [0] == board[4] && board[4] == board[8]) || 
        (board[4] != 0 && board [2] == board[4] && board[4] == board[6]))
      return board[4];
    
    return 0;
  }
  
  public boolean isFull() {
    for(int i = 0; i<board.length; i++) {
      if(board[i] == 0) {
        return false;
      }
    }
    return true;
  }
  
  public String toString() {
    String returnee = new String();
    
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 3; j++) {
        returnee += board[i*3+j];
      }
      returnee += "\n";
    }
    
    return returnee;
  }

}
