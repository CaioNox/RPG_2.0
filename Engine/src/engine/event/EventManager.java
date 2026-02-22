// Package: engine.event
// Purpose: Simple event bus to publish and collect events during a frame or tick.
// Usage: Systems publish `Event` instances with `publish(...)` and consumers call `pollAll()` to retrieve and clear the queue.
// Relationships: Works with concrete `Event` implementations and game systems that produce/consume events.
package engine.event;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<Event> events = new ArrayList<>();

    public void publish(Event e) { events.add(e); }
    public List<Event> pollAll() {
        List<Event> copy = new ArrayList<>(events);
        events.clear();
        return copy;
    }
}
