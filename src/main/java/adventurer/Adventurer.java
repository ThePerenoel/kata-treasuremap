package adventurer;

import java.util.Objects;

import static adventurer.AdventurerOrientation.*;

public class Adventurer {
    private final int easting;
    private final int northing;
    private final AdventurerOrientation adventurerOrientation;

    public Adventurer(int easting, int northing, String orientation) {
        this.easting = easting;
        this.northing = northing;
        adventurerOrientation = AdventurerOrientation.with(orientation);
    }

    public Adventurer(int easting, int northing, AdventurerOrientation adventurerOrientation) {
        this.easting = easting;
        this.northing = northing;
        this.adventurerOrientation = adventurerOrientation;
    }

    public Adventurer goForward(String move) {
        int numberOfSquaresToGo = getNumberOfSquaresToGo(move);
        int newNorthing = goForwardVertically(numberOfSquaresToGo);
        int newEasting = moveForwardHorizontally(numberOfSquaresToGo);
        return new Adventurer(newEasting, newNorthing, adventurerOrientation);
    }

    private int moveForwardHorizontally(int numberOfSquaresToGo) {
        if(this.adventurerOrientation.isEqualTo(EAST) ||
                this.adventurerOrientation.isEqualTo(WEST)) {
            return this.easting + numberOfSquaresToGo;
        }
        return this.easting;
    }

    private int goForwardVertically(int numberOfSquaresToGo) {
        if(this.adventurerOrientation.isEqualTo(NORTH) ||
                this.adventurerOrientation.isEqualTo(SOUTH)) {
            return this.northing + numberOfSquaresToGo;
        }
        return this.northing;
    }

    private int getNumberOfSquaresToGo(String move) {
        if(this.adventurerOrientation.isEqualTo(NORTH) ||
                this.adventurerOrientation.isEqualTo(WEST)) {
            return move.length() * (-1);
        }
        return move.length();
    }

    public Adventurer changeDirection(String direction) {
        AdventurerOrientation newAdventurerOrientation = getNewOrientation(direction);
        return new Adventurer(this.easting, this.northing, newAdventurerOrientation);
    }

    private AdventurerOrientation getNewOrientation(String direction) {
        return adventurerOrientation.changeDirection(direction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Adventurer that = (Adventurer) o;
        return easting == that.easting &&
                northing == that.northing &&
                Objects.equals(adventurerOrientation, that.adventurerOrientation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(easting, northing, adventurerOrientation);
    }

    @Override
    public String toString() {
        return "Adventurer{" +
                "easting=" + easting +
                ", northing=" + northing +
                ", adventurerOrientation=" + adventurerOrientation +
                '}';
    }

}
