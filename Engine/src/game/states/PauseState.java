// Package: game.states
// Purpose: `GameState` used to pause the game and display pause menu or HUD.
// Usage: Freezes or suspends gameplay updates while active; allows resume or quit actions.
package game.states;

import engine.state.GameState;

public class PauseState implements GameState {
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
