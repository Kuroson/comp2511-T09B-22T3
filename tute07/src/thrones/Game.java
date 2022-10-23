package thrones;

public class Game {
    public static void main(String[] args) {
        King king = new King(0, 0);
        Queen queen = new Queen(0, 1);
        Knight knight = new Knight(0, 2);
        Dragon dragon = new Dragon(-1, 0);

        knight.attack(dragon);
    }

}