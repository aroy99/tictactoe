import java.util.Scanner;
  
public class Main {

  public static void main(String[] args) {
  	Scanner scan = new Scanner(System.in);
    TicTacToe board = new TicTacToe();
    int player1Input, player2Input;
    boolean temp;
    
    while(board.hasWon() != 0 && !board.isFull()){
      temp = false;
      
      while(temp == false) {
      	System.out.println("What position do you want to place your circle?");
      	player1Input = scan.nextInt();
      	temp = board.add(2, player1Input);
      }
      while(temp == false) {
      	System.out.println("What positon do you want to place your x?");
      	player2Input = scan.nextInt();
      	temp = board.add(1,player2Input);
      }
    }
    
    if(board.hasWon() == 1) {
      System.out.println("Player two has won!");
    }
    else {
      System.out.println("Player one has won!");
    }
    
    
  }

}
