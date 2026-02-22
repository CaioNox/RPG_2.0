// Package: game.map
// Purpose: Represents a single tile on the game map, holding properties like walkability.
// Usage: Tiles are composed into `GameMap` to represent the level layout and collision.
package game.map;

public class Tile {
    private boolean walkable = true;
    public Tile() {}
    public Tile(boolean walkable) { this.walkable = walkable; }
    public boolean isWalkable() { return walkable; }
}
