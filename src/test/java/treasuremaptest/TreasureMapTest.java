package treasuremaptest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import treasuremap.TreasureMap;

import static org.assertj.core.api.Assertions.assertThat;

public class TreasureMapTest {

    @Nested
    @DisplayName("CreateMap should")
    class CreateMapTest {

        @Test
        void return_TreasureMap_with_no_line_and_no_column_when_given_0_and_0() {
            TreasureMap treasureMap = TreasureMap.of("C - 0 - 0");

            assertThat(treasureMap).isEqualTo(new TreasureMap(0,0));
        }


        

    }


}
