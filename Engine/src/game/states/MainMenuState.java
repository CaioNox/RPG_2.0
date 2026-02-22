// Package: game.states
// Purpose: `GameState` that represents the main menu UI and navigation.
// Usage: Entry point for the game; offers options like start, settings, and exit.
package game.states;

import engine.state.GameState;

public class MainMenuState implements GameState {
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
