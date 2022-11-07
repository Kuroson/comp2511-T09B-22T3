package thrones9;

/**
 * A dragon can only move up, down, left or right, and has a 1 in 6 chance of
 * inflicting 20 points of damage.
 *
 * @author Robert Clifton-Everest
 *
 */
public class Dragon extends Character {
    public Dragon(int x, int y) {
        super(x, y);
    }

    public void attack(Character victim) {
        victim.damage((Math.random() <= 0.16) ? 20 : 0);
    }

    @Override
    public boolean canMove(int dx, int dy) {
        dx = Math.abs(dx);
        dy = Math.abs(dy);
        return ((dx == 0 && dy == 1) || (dx == 1 && dy == 0));
    }

}
