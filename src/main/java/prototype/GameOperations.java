package prototype;

public class GameOperations {

    public void move(Gamer gamer, ChessBoard chessBoard) {
        try {
            ChessBoard beforeMove = (ChessBoard) chessBoard.clone();
            GameFlow.getMoveList().add(beforeMove);
            chessBoard.setState(gamer.getName() + " has changed state");
        } catch (CloneNotSupportedException ignore) {
        }
    }

}
