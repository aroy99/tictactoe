/**
 * TreeTester.java	   Oct 14, 2017, 5:45:19 PM
 */

public class TreeTester {

  public static void main(String[] args) {
    Tree tree = new Tree();
    
    TreePopulator.populateTree(tree.head, 9, new TicTacToe(), 1);
    
    System.out.println("Counter: " + TreePopulator.counter);
   
//    tree.print(tree.head, 0);
  }

}
