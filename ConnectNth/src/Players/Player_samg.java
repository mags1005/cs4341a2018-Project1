package Players;

import Utilities.Move;
import Utilities.StateTree;

public class Player_samg extends Player {

    static int MAX=1000;
    static int MIN=-1000;
    public Player_samg(String n, int t, int l) {
        super(n, t, l);
    }


    public Move getMove(StateTree state) {
        /* MAGGIE STUFF
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
*/



        return new Move(false, 0);
    }

    public int minimax(int node, int depth, boolean maxp, int values[], int alpha, int beta) { // row <==> depth? No, I don't think so
        //CHANGE TO X-1
        if(depth == 3){
            return values[node];
        }
        if (maxp == true){
            int best = MIN;
            for (int i =0; i<2; i++){
                int val = minimax(node * 2 + i,depth + 1,
                        false, values, alpha, beta);
                best = Math.max(best, val);
                alpha = Math.max(alpha, best);
                //alpha beta pruning
                if (beta <= alpha){
                    break;
                }
            }
            return best;
        }
        else{
            int best = MAX;
            for (int i =0; i<2; i++){
                int val = minimax(node*2+i, depth +1, true, values, alpha, beta);
                best = Math.min(best, val);
                beta = Math.min(beta, best);
                //alpha beta pruning
                if (beta<=alpha){
                    break;
                }
            }
            return best;
        }
    }
}
