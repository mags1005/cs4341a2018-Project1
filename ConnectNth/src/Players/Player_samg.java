package Players;

import Utilities.Move;
import Utilities.StateTree;

public class Player_samg extends Player {


    public Player_samg(String n, int t, int l) {
        super(n, t, l);
    }

    public Move getMove(StateTree state) {
        // minimax will eventually return the column that your player wants to touch and whether they wanna pop a piece or not
        return new Move(false, 5);
    }

}
