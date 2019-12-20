package wormgame.domain;

import java.util.ArrayList;
import java.util.List;
import wormgame.Direction;

public class Worm {

    private Direction direction;
    private List<Piece> pieces;
    private Piece newPiece;

    public Worm(int originalX, int originalY, Direction originalDirection) {
        pieces = new ArrayList<Piece>();
        newPiece = new Piece(originalX, originalY);
        pieces.add(newPiece);
        direction = originalDirection;

    }

    public void move() {

        Piece piece = pieces.get(pieces.size() - 1);
        switch (getDirection()) {

            case RIGHT:
                pieces.add(new Piece(piece.getX() + 1, piece.getY()));
                break;
            case DOWN:
                pieces.add(new Piece(piece.getX(), piece.getY() + 1));
                break;
            case LEFT:
                pieces.add(new Piece(piece.getX() - 1, piece.getY()));
                break;
            case UP:
                pieces.add(new Piece(piece.getX(), piece.getY() - 1));
                break;
            default:
                break;
        }

        if (!(newPiece == null)) {

            switch (getDirection()) {

                case RIGHT:
                    pieces.add(newPiece);
                    break;
                case DOWN:
                    pieces.add(newPiece);
                    break;
                case LEFT:
                    pieces.add(newPiece);
                    break;
                case UP:
                    pieces.add(newPiece);
                    break;
                default:
                    break;
            }
            pieces.remove(pieces.size() - 1);
            newPiece = null;
        } else if (getLength() > 3) {
            pieces.remove(0);
        }

    }

    public boolean runsInto(Piece piece) {
        for (Piece oPiece : pieces) {
            if (piece.getX() == oPiece.getX() && piece.getY() == oPiece.getY()) {
                return true;
            }
        }
        return false;
    }

    public boolean runsIntoItself() {
        for (Piece piece : pieces) {
            if (!(piece == pieces.get(pieces.size() - 1)) && pieces.get(pieces.size() - 1).runsInto(piece)) {
                return true;
            }
        }
        return false;
    }

    public void grow() {
        int[] xyDirection = getDirectionXY();
        Piece headPiece = pieces.get(pieces.size() - 1);
        newPiece = new Piece(headPiece.getX() + xyDirection[0], headPiece.getY() + xyDirection[1]);
    }

    private int[] getDirectionXY() {
        // x is Index 0, y in Index 1
        int[] xyDirection = {0, 0};
        if (null != direction) {
            switch (direction) {
                case UP: {
                    xyDirection[1] = -1;
                    break;
                }
                case RIGHT: {
                    xyDirection[0] = 1;
                    break;
                }
                case DOWN: {
                    xyDirection[1] = 1;
                    break;
                }
                case LEFT: {
                    xyDirection[0] = -1;
                    break;
                }
                default:
                    break;
            }
        }
        return xyDirection;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction dir) {
        direction = dir;
    }

    public int getLength() {
        return pieces.size();
    }

    public List<Piece> getPieces() {
        return pieces;
    }

}
