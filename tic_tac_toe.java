import java.util.Scanner;

public class tic_tac_toe {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);

        char[][] board = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }

        char CurrentPlayer = 'X';
        DisplayBoard(board);

        while (true) {

            System.out.println("\nplayer" + CurrentPlayer + "enter the position");
            int position = ss.nextInt();

            if (position < 1 || position > 9) {
                System.out.println("invalid input");
                continue;

            }
            int row = (position - 1) / 3;
            int column = (position - 1) % 3;

            if (board[row][column] != ' ') {
                System.out.println("position already occupied");
                continue;
            }

            board[row][column] = CurrentPlayer;

            DisplayBoard(board);
            if (checkWinner(board, CurrentPlayer)) {
                System.out.println("Player " + CurrentPlayer + " wins!");
                break;
            }
            if(isBoardFull(board)){
                System.out.println("The match is a Draw!!");
                break;
            }

            if (CurrentPlayer == 'X') {
                CurrentPlayer = 'O';
            } else {
                CurrentPlayer = 'X';
            }

        }

        ss.close();
    }

    public static void DisplayBoard(char[][] board) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + board[i][j] + " ");
                if (j < 2) {
                    System.out.print("|");
                }

            }
            System.out.println();
            if (i < 2)
                System.out.println("___________");
        }

    }

    public static boolean checkWinner(char[][] board, char CurrentPlayer) {
        if (board[0][0] == CurrentPlayer && board[0][1] == CurrentPlayer && board[0][2] == CurrentPlayer) {
            return true;
        } else if (board[1][0] == CurrentPlayer && board[1][1] == CurrentPlayer && board[1][2] == CurrentPlayer) {
            return true;
        } else if (board[2][0] == CurrentPlayer && board[2][1] == CurrentPlayer && board[2][2] == CurrentPlayer) {
            return true;

        } else if (board[0][0] == CurrentPlayer && board[1][0] == CurrentPlayer && board[2][0] == CurrentPlayer) {
            return true;
        } else if (board[0][1] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][1] == CurrentPlayer) {
            return true;
        } else if (board[0][2] == CurrentPlayer && board[1][2] == CurrentPlayer && board[2][2] == CurrentPlayer) {
            return true;
        } else if (board[0][0] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][2] == CurrentPlayer) {
            return true;
        } else if (board[0][2] == CurrentPlayer && board[1][1] == CurrentPlayer && board[2][0] == CurrentPlayer) {
            return true;
        }

        else {
            return false;

        }

    }

    public static boolean isBoardFull(char[][] board){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(board[i][j]==' ')
                {
                    return false;
                }
                
            }
        }
        return true;
    }
}
