// Package: game.entities
// Purpose: Represents the player-controlled character in the game.
// Usage: Stores player-specific data such as `name`; extends `Entity` for position.
// Relationships: Interacts with game logic, battle systems, and input handling.
package game.entities;

public class Player extends Entity {
    private String name;
    public Player(String name) { this.name = name; }
    public String getName() { return name; }
}
