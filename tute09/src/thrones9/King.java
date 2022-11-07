package thrones9;

/**
 * A king can move one square in any direction (including diagonally), and
 * always causes 8 points of damage when attacking.
 *
 * @author Robert Clifton-Everest
 *
 */
public class King extends Character {

    public King(int x, int y) {
        super(x, y);
    }

    /**
    * This character attacks the given victim, causing them damage according to
    * their rules. Hooks
    *
    * @param victim
    */
    public void attack(Character victim) {
        victim.damage(8);
    }

    /**
     * Can this character move by the given amount along the x and y axes.
     * Hook
     *
     * @param x
     * @param y
     * @return True if they can move by that amount, false otherwise
     */
    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return (dx == 1 && dy <= 1 || dx <= 1 && dy == 1);
    }

}
