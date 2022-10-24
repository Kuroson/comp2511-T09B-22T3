package thrones;

public class Game {
    public static void main(String[] args) {
        King king = CharacterFactory.createKing();
        Queen queen = CharacterFactory.createQueen();
        Knight knight = new Knight(0, 2);
        Dragon dragon = new Dragon(-1, 0);

        knight.attack(dragon);
    }

}