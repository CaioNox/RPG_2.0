// Package: game.map
// Purpose: Container for `Tile` instances that form the game's level or world layout.
// Usage: Stores and provides access to tiles; map creation and pathfinding systems will interact with this class.
package game.map;

import java.util.ArrayList;
import java.util.List;

public class GameMap {
    private final List<Tile> tiles = new ArrayList<>();
    public void addTile(Tile t) { tiles.add(t); }
    public List<Tile> getTiles() { return tiles; }
}
