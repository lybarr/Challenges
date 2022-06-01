package Level2.TicTacToe;
/*
task: tell if a player has one a game of tic-tac-toe. see test cases for formatting.
 */

public class TicTacToe {

    public char validateWin(char[][] board) {
        boolean X_wins = false;
        boolean O_wins = false;
        char currentChar = 'A';
        char prevChar = 'A';
        char nextChar = 'A';
        char charOnTop = 'A';
        char charBelow = 'A';
        int length = board.length-1;

        System.out.println("\n---------------------------------------------\n");

        for(int i = 0; i < board.length; i++){

            for(int n = 0; n < board.length; n++){

                System.out.print(board[i][n] + "   ");
                if(n == board.length - 1){
                    System.out.println("\n");
                }
            }
        }

        for(int i = 0; i < board.length; i++){ // Row

            for(int n = 0; n < board.length; n++){ // Column
                currentChar = board[i][n];
                System.out.println("\n---------------------------------------------");
                System.out.println("Char at [" + i + "][" + n + "] = " + currentChar);

                if(n < length && n > 0){
                    nextChar = board[i][n+1];
                    prevChar = board[i][n-1];
                    if(currentChar == 'X' && nextChar == 'X' && prevChar == 'X'){
                        System.out.println("X wins horizontally.");
                        X_wins = true;
                    }
                    if(currentChar == 'O' && nextChar == 'O' && prevChar == 'O'){
                        System.out.println("O wins horizontally.");
                        O_wins = true;
                    }
                    if(i < length && i > 0){ //currentChar is at the center - check diagonal win
                        if(currentChar == 'X' && board[i+1][n-1] == 'X' && board[i-1][n+1] == 'X'){
                            System.out.println("X wins diagonally (from top left).");
                            X_wins = true;
                        }
                        if(currentChar == 'O' && board[i+1][n-1] == 'O' && board[i-1][n+1] == 'O'){
                            System.out.println("O wins diagonally (from top left).");
                            O_wins = true;
                        }
                        if(currentChar == 'X' && board[i+1][n+1] == 'X' && board[i-1][n-1] == 'X'){
                            System.out.println("X wins diagonally (from top right).");
                            X_wins = true;
                        }
                        if(currentChar == 'O' && board[i+1][n+1] == 'O' && board[i-1][n-1] == 'O'){
                            System.out.println("O wins diagonally (from top right).");
                            O_wins = true;
                        }
                    }
                }
                if(i < length && i > 0){
                    charOnTop = board[i -1][n];
                    charBelow = board[i+1][n];
                    if(currentChar == 'X' && charOnTop == 'X' && charBelow == 'X'){
                        System.out.println("X wins vertically.");
                        X_wins = true;
                    }
                    if(currentChar == 'O' && charOnTop == 'O' && charBelow == 'O'){
                        System.out.println("O wins vertically.");
                        O_wins = true;
                    }
                }
            }
        }

        // The results are in...
        if(X_wins){
            return 'X';
        } else if (O_wins){
            return 'O';
        } else {
            return 'T';
        }
    }
}
