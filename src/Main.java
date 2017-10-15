import java.util.Scanner;
  
public class Main {

  public static void main(String[] args) {
  	Scanner scan = new Scanner(System.in);
    TicTacToe board = new TicTacToe();
    int player1Input = 0, player2Input = 0;
    boolean temp;
    
    Tree game = new Tree();
    
    TreePopulator.populateTree(game.head, 9, new TicTacToe(), 1);
    
    System.out.println(board);
    
    while(board.hasWon() == 0 && !board.isFull()){
      temp = false;
      
      while(temp == false) {
      	System.out.println("What position do you want to place your X?");
      	player1Input = scan.nextInt();
      	temp = board.add(1, player1Input);
      }
      
      game.move(player1Input);
      
      System.out.println(board);

      if(board.hasWon() != 0) {
        break;
      }
      
      player2Input = AI.determineNextMove(game, board);
      
      board.add(2,player2Input);
      
      game.move(player2Input);
      
      System.out.println(board);
    }
    
    if(board.hasWon() == 1) {
      System.out.println("Player one has won!");
    }
    else if (board.hasWon() == 2){
      System.out.println("Player two has won!");
    }else {
      System.out.println("It's a tie!");
    }
    
    scan.close();
    
    
  }

}
