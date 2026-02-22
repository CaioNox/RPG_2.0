// Package: game.logic
// Purpose: Tracks and advances turn count for turn-based systems.
// Usage: `nextTurn()` advances the turn; other systems may query `getTurn()` to decide behavior.
package game.logic;

public class TurnManager {
    private int turn = 0;
    public void nextTurn() { turn++; }
    public int getTurn() { return turn; }
}
