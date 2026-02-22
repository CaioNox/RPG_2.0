// Package: game.logic
// Purpose: Provides the deterministic calculation for damage given attacker and defender stats.
// Usage: Called by battle logic to compute damage inflicted on a target.
// Relationships: Stateless utility used by `BattleSystem` and other combat systems.
package game.logic;

public class DamageCalculator {
    public int calculate(int attack, int defense) { return Math.max(0, attack - defense); }
}
