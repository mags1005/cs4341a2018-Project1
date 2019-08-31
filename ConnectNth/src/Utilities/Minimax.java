package Utilities;

public class Minimax {
    //our initial theory:
    //// So the max player will look at the board and say, what moves could the next player make if i put my piece here
    //// we choose the column based on which move leads to the least advantaged StateTree of the other player
    //// but when you "place a piece" you then evaluate the resulting state from the perspective of the other player and
    //// store the minimum-valued state (you are creating a new node that then might become parent to multiple children)
    //// do that for each possible move you could make (sounds like average of n branches per tree based on width of board)
    //// choose the maximum values of the minimums in the children ArrayList?
}
