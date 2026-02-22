// Package: game.states
// Purpose: `GameState` shown when the player has lost or the game ends.
// Usage: Presents end-of-game logic, cleanup, and any scoring or restart flows.
package game.states;

import engine.state.GameState;

public class GameOverState implements GameState {
    @Override public void enter() {}
    @Override public void update(float delta) {}
    @Override public void exit() {}

    @Override
    public void render() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void pause() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void resume() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
