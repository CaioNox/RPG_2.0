// Package: game.entities
// Purpose: Represents a treasure chest entity placed on the game map.
// Usage: Tracks whether the chest has been opened; can be manipulated by game systems or player.
// Relationships: Extends `Entity` to inherit position and basic entity behavior.
package game.entities;

public class Chest extends Entity {
    private boolean opened;
    public boolean isOpened() { return opened; }
    public void open() { opened = true; }
}
