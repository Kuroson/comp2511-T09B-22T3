package thrones;

import java.util.Random;

public class CharacterFactory {
    private static Random r = new Random();

    private static int getRandomPos() {
        return r.nextInt(5);
    }

    public static King createKing() {
        return new King(CharacterFactory.getRandomPos(), getRandomPos(), 6);
    }

    public static Queen createQueen() {
        return new Queen(CharacterFactory.getRandomPos(), getRandomPos());
    }
}
