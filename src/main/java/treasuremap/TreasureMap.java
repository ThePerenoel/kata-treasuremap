package treasuremap;

import java.util.Objects;

public class TreasureMap {

    private final int columns;
    private final int lines;

    public TreasureMap(int columns, int lines) {

        this.columns = columns;
        this.lines = lines;
    }

    public static TreasureMap of(String input) {
        return new TreasureMap(0,0);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreasureMap that = (TreasureMap) o;
        return columns == that.columns &&
                lines == that.lines;
    }

    @Override
    public int hashCode() {
        return Objects.hash(columns, lines);
    }

    @Override
    public String toString() {
        return "TreasureMap{" +
                "columns=" + columns +
                ", lines=" + lines +
                '}';
    }
}
