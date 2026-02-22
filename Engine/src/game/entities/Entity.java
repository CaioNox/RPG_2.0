// Package: game.entities
// Purpose: Base abstract class for all in-game entities that occupy positions on the map.
// Usage: Provides common position fields and accessors used by concrete entities.
// Subclasses: `Player`, `Enemy`, `Chest`, etc. inherit position behavior from this class.
package game.entities;

public abstract class Entity {
    protected int x, y;

    public int getX() { return x; }
    public int getY() { return y; }
    public void setPosition(int x, int y) { this.x = x; this.y = y; }
}
