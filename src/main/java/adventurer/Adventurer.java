package adventurer;

import java.util.Objects;

public class Adventurer {
    private final int easting;
    private final int northing;
    private final String orientation;

    public Adventurer(int easting, int northing, String orientation) {
        this.easting = easting;
        this.northing = northing;
        this.orientation = orientation;
    }

    public Adventurer goForward(String move) {
        int numberOfSquaresToGo = getNumberOfSquaresToGo(move);
        int newNorthing = goForwardVertically(numberOfSquaresToGo);
        int newEasting = moveForwardHorizontally(numberOfSquaresToGo);
        return new Adventurer(newEasting, newNorthing, this.orientation);
    }

    private int moveForwardHorizontally(int numberOfSquaresToGo) {
        if(AdventurerOrientation.EAST.equals(this.orientation) ||
                AdventurerOrientation.WEST.equals(this.orientation)) {
            return this.easting + numberOfSquaresToGo;
        }
        return this.easting;
    }

    private int goForwardVertically(int numberOfSquaresToGo) {
        if(AdventurerOrientation.NORTH.equals(this.orientation) ||
                AdventurerOrientation.SOUTH.equals(this.orientation)) {
            return this.northing + numberOfSquaresToGo;
        }
        return this.northing;
    }

    private int getNumberOfSquaresToGo(String move) {
        if("N".equals(this.orientation) || "W".equals(this.orientation)) {
            return move.length() * (-1);
        }
        return move.length();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adventurer that = (Adventurer) o;
        return easting == that.easting &&
                northing == that.northing &&
                Objects.equals(orientation, that.orientation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(easting, northing, orientation);
    }

    @Override
    public String toString() {
        return "Adventurer{" +
                "easting=" + easting +
                ", northing=" + northing +
                ", orientation='" + orientation + '\'' +
                '}';
    }

    public Adventurer changeDirection(String direction) {
        return new Adventurer(this.easting,this.northing,direction);
    }

    public Adventurer move(String moveSequence) {

        Adventurer adventurer = goForward(moveSequence);

        return adventurer;
    }
}
