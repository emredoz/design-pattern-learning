package prototype;

import org.junit.Test;

public class PrototypeTest {

    private static GameOperations operations = new GameOperations();

    @Test
    public void test() {
        // Creating
        Gamer gamer1 = new Gamer("Gamer 1");
        Gamer gamer2 = new Gamer("Gamer 2");
        ChessBoard chessBoard = new ChessBoard();
        // Game Play
        operations.move(gamer1, chessBoard);
        operations.move(gamer2, chessBoard);
        operations.move(gamer1, chessBoard);
        operations.move(gamer2, chessBoard);
        operations.move(gamer1, chessBoard);
        operations.move(gamer2, chessBoard);
        operations.move(gamer1, chessBoard);
        // Flow
        GameFlow.getMoveList().forEach(g -> System.out.println(g + " state: " + g.getState()));
    }
}
