package adventurer;

import java.util.Objects;

public class AdventurerOrientation {
    public static final String NORTH = "N";
    public static final String EAST = "E";
    public static final String SOUTH = "S";
    public static final String WEST = "W";

    public final String orientation;
    private final String left;
    private final String right;

    private AdventurerOrientation(String orientation, String left, String right) {
        this.orientation = orientation;
        this.left = left;
        this.right = right;
    }

    public static AdventurerOrientation with(String orientation) {

        String left = "";
        String right = "";
        if(NORTH.equals(orientation)) {
            left = WEST;
            right = EAST;
        }
        if(SOUTH.equals(orientation)) {
            left = EAST;
            right = WEST;
        }
        if(WEST.equals(orientation)) {
            left = SOUTH;
            right = NORTH;
        }
        if(EAST.equals(orientation)) {
            left = NORTH;
            right = SOUTH;
        }

        return new AdventurerOrientation(orientation, left, right);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdventurerOrientation that = (AdventurerOrientation) o;
        return Objects.equals(orientation, that.orientation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation);
    }

    @Override
    public String toString() {
        return "AdventurerOrientation{" +
                "orientation='" + orientation + '\'' +
                '}';
    }

    public boolean isEqualTo(String orientation) {
        return this.orientation.equals(orientation);
    }

    public AdventurerOrientation changeDirection(String direction) {
        if ("D".equals(direction)) {
            return this.with(this.right);
        }
        return this.with(this.left);
    }
}
