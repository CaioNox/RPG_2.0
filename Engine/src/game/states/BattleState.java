// Package: game.states
// Purpose: `GameState` implementation representing a battle scene.
// Usage: Encapsulates battle-specific update and rendering logic; lifecycle managed by `StateManager`.
// Relationships: Works with `BattleSystem`, `TurnManager`, and game entities involved in combat.
package game.states;

import engine.state.GameState;

public class BattleState implements GameState {
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
