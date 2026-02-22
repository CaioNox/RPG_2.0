// Package: engine.state
// Purpose: Defines the lifecycle contract for a game state (menu, gameplay, battle, etc.).
// Usage: Implementations manage their own resources and behavior during `enter`, `update`, and `exit` transitions.
// Relationships: Managed by `StateManager` which pushes/pops states and calls lifecycle methods.
package engine.state;

public interface GameState {
    void enter();
    void update(float delta);
    void exit();
    void render();
    void pause();
    void resume();
}

