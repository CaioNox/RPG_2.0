// Package: game.entities
// Purpose: Represents hostile or neutral NPCs that can engage the player.
// Usage: Stores enemy-specific attributes (here `type`) and uses position from `Entity`.
// Relationships: Used by battle logic and map spawning systems.
package game.entities;

public class Enemy extends Entity {
    private String type;
    public Enemy(String type) { this.type = type; }
    public String getType() { return type; }
}
