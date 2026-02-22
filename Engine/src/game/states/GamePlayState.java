// Package: game.states
// Purpose: Main gameplay state where player movement, map updates, and world simulation occur.
// Usage: Hosts the primary game loop logic for playing; transitions to other states (battle, pause) as needed.
package game.states;

import engine.state.GameState;

public class GamePlayState implements GameState {
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
