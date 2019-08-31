package Players;

import Utilities.Move;
import Utilities.StateTree;

public class Player_samg extends Player {


    public Player_samg(String n, int t, int l) {
        super(n, t, l);
    }

    public Move getMove(StateTree state) {
        // minimax will eventually return the column that your player wants to touch and whether they wanna pop a piece or not?
        int col = state.columns;
        int row = state.rows;
        int turn = state.turn; // this stores whose turn it is (1 for p1 and 2 for p2)
        int winNum = state.winNumber; // I think this stores the number of spaces they need in a row to win

        // TODO: right now I'm just doing everything in getMove, we can move to minimax() later i guess
        if (turn == 1) { // if its player 1s turn
            // find the max of the min values
            for (int currCol = 0; currCol < col; col++) { // starting at the far left column, look at each one?

            }
        } else if (turn == 2) { // if its player 2s turn
            // find the min of the max values
        } else {
            System.out.println("Player # is invalid. 2 players only");
        }

        // first check if board is full
        // then check if someone has won?
        // THEN choose where to place the piece



        return new Move(false, 0);
    }

    public int minimax(int turn, int row, int col) { // row <==> depth? No, I don't think so
        //our initial theory:
        //// So the max player will look at the board and say, what moves could the next player make if i put my piece here
        //// we choose the column based on which move leads to the least advantaged StateTree of the other player
        //// but when you "place a piece" you then evaluate the resulting state from the perspective of the other player and
        //// store the minimum-valued state (you are creating a new node that then might become parent to multiple children)
        //// do that for each possible move you could make (sounds like average of n branches per tree based on width of board)
        //// choose the maximum value of the minimums in the children ArrayList?
        return -1;
    }

}
