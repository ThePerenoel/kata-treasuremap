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
            TreasureMap treasureMap = TreasureMap.of("C-0-0");

            assertThat(treasureMap).isEqualTo(new TreasureMap(0,0));
        }

        @Test
        void return_TreasureMap_with_no_line_and_1_column_when_given_1_and_0() {
            TreasureMap treasureMap = TreasureMap.of("C-1-0");

            assertThat(treasureMap).isEqualTo(new TreasureMap(1,0));
        }

        @Test
        void return_TreasureMap_with_1_line_and_no_column_when_given_0_and_1() {
            TreasureMap treasureMap = TreasureMap.of("C-0-1");

            assertThat(treasureMap).isEqualTo(new TreasureMap(0,1));
        }


        @Test
        void return_TreasureMap_with_4_line_and_3_column_when_given_3_and_4() {
            TreasureMap treasureMap = TreasureMap.of("C-3-4");

            assertThat(treasureMap).isEqualTo(new TreasureMap(3,4));
        }


        @Test
        void return_TreasureMap_with_10_line_and_3_column_when_given_3_and_10() {
            TreasureMap treasureMap = TreasureMap.of("C-3-10");

            assertThat(treasureMap).isEqualTo(new TreasureMap(3,10));
        }


    }


}
