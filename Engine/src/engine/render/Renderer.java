// Package: engine.render
// Purpose: Responsible for drawing a `GameState` to the screen (or other output).
// Usage: The engine calls `render(...)` with the active `GameState` to present visuals.
// Relationships: Uses `GameState` to obtain rendering information; may depend on assets and render backends.
package engine.render;

import engine.state.GameState;

public class Renderer {
    public void render(GameState state) {
        // placeholder render
    }
}
