package Players;

import Utilities.Move;
import Utilities.StateTree;

public class Player_samg extends Player {


    public Player_samg(String n, int t, int l) {
        super(n, t, l);
    }

    public Move getMove(StateTree state) {
        return new Move(false, 5);
    }

}
