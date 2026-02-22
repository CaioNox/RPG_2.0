// Package: engine.state
// Purpose: Manages active `GameState` instances using a stack (push/pop behavior).
// Usage: Push a new state to suspend the previous one; pop to return. Calls lifecycle methods appropriately.
// Relationships: Interacts with classes implementing `GameState` such as menu and gameplay states.
package engine.state;

import java.util.ArrayDeque;
import java.util.Deque;

public class StateManager {
    private final Deque<GameState> states = new ArrayDeque<>();

    public void pushState(GameState state) {
        if (!states.isEmpty()) states.peek().exit();
        states.push(state);
        state.enter();
    }

    public void popState() {
        if (states.isEmpty()) return;
        GameState top = states.pop();
        top.exit();
        if (!states.isEmpty()) states.peek().enter();
    }

    public GameState getCurrent() { return states.peek(); }
}
