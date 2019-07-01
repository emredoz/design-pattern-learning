package emre.prototype;

import java.util.ArrayList;
import java.util.List;

public class GameFlow {

    private static final List<ChessBoard> moveList = new ArrayList<>();

    public static List<ChessBoard> getMoveList() {
        return moveList;
    }
}
