public class SliderGame {

   public void aStarSolve(Board initialBoard){
       AVLTree<Board> priorityQ = new AVLTree<>();
        Board copyBoard = new Board(initialBoard);
        System.out.println("AStarSolve (Uses Priority Queue to solve the board)");
        System.out.println("Initial Board: ");
        System.out.println(initialBoard);

        priorityQ.insert(initialBoard);
        priorityQ.solveBoard(priorityQ, copyBoard);


   }


    public static void main(String[] args) {
        SliderGame game = new SliderGame();

        //Example set to test solver
        int[] values1 = {  4, 0, 1, 3, 5, 2, 6, 8, 7 };
        int[] values2 = {  1, 3, 8, 6, 2, 0, 5, 4, 7 };
        int[] values3 = {  1, 3, 2, 4, 5, 6, 8, 7, 0 };
        int[] values4 = {  1, 2, 3, 7, 4, 0, 6, 5, 8 };



        System.out.println("Board 1: ");
        Board board1 = new Board();
        board1.makeBoard(values1);
        game.aStarSolve(board1);
        game.bruteForceSolve(board1);

        System.out.println("Board 2: ");
        Board board2 = new Board();
        board2.makeBoard(values2);
        game.aStarSolve(board2);
        game.bruteForceSolve(board2);

        System.out.println("Board 3: ");
        Board board3 = new Board();
        board3.makeBoard(values3);
        game.aStarSolve(board3);
        game.bruteForceSolve(board3);

        System.out.println("Board 4: ");
        Board board4 = new Board();
        board4.makeBoard(values4);
        game.aStarSolve(board4);
        game.bruteForceSolve(board4);

    }
}
