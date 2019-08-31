package Players;

import Utilities.Move;
import Utilities.StateTree;

public class Player_samg extends Player {


    public Player_samg(String n, int t, int l) {
        super(n, t, l);
    }

    public Move getMove(StateTree state) {
        // minimax will eventually return the column that your player wants to touch and whether they wanna pop a piece or not?
        return new Move(false, 5);
    }

    public int minimax() {
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
