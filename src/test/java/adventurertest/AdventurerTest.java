package adventurertest;

import adventurer.Adventurer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AdventurerTest {

    @Nested
    @DisplayName("Function goForward should")
    class GoForwardShould {

        @Test
        void return_adventurer_with_position_1_2_when_given_A_to_Adventurer_with_S_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"S");
            Adventurer adventurerToCompare = new Adventurer(1,2,"S");

            adventurer = adventurer.goForward("A");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_1_3_when_given_AA_to_Adventurer_with_S_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"S");
            Adventurer adventurerToCompare = new Adventurer(1,3,"S");

            adventurer = adventurer.goForward("AA");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_1_4_when_given_AAA_to_Adventurer_with_S_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"S");
            Adventurer adventurerToCompare = new Adventurer(1,4,"S");

            adventurer = adventurer.goForward("AAA");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_1_0_when_given_A_to_Adventurer_with_N_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"N");
            Adventurer adventurerToCompare = new Adventurer(1,0,"N");

            adventurer = adventurer.goForward("A");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_1_minus_1_when_given_A_A_to_Adventurer_with_N_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"N");
            Adventurer adventurerToCompare = new Adventurer(1,-1,"N");

            adventurer = adventurer.goForward("AA");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_2_1_when_given_A_to_Adventurer_with_E_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"E");
            Adventurer adventurerToCompare = new Adventurer(2,1,"E");

            adventurer = adventurer.goForward("A");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_3_1_when_given_AA_to_Adventurer_with_E_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"E");
            Adventurer adventurerToCompare = new Adventurer(3,1,"E");

            adventurer = adventurer.goForward("AA");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_adventurer_with_position_0_1_when_given_A_to_Adventurer_with_W_orientation() {

            Adventurer adventurer = new Adventurer(1,1,"W");
            Adventurer adventurerToCompare = new Adventurer(0,1,"W");

            adventurer = adventurer.goForward("A");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

    }

    @Nested
    @DisplayName("Function changeDirection should")
    class ChangeDirectionShould {

        @Test
        void return_Adventurer_with_orientation_W_when_given_G_to_Adventurer_with_orientation_N() {
            Adventurer adventurer = new Adventurer(1,1,"N");
            Adventurer adventurerToCompare = new Adventurer(1,1,"W");

            adventurer = adventurer.changeDirection("G");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_E_when_given_D_to_Adventurer_with_orientation_N() {
            Adventurer adventurer = new Adventurer(1,1,"N");
            Adventurer adventurerToCompare = new Adventurer(1,1,"E");

            adventurer = adventurer.changeDirection("D");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_E_when_given_G_to_Adventurer_with_orientation_S() {
            Adventurer adventurer = new Adventurer(1,1,"S");
            Adventurer adventurerToCompare = new Adventurer(1,1,"E");

            adventurer = adventurer.changeDirection("G");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_W_when_given_D_to_Adventurer_with_orientation_S() {
            Adventurer adventurer = new Adventurer(1,1,"S");
            Adventurer adventurerToCompare = new Adventurer(1,1,"W");

            adventurer = adventurer.changeDirection("D");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_N_when_given_D_to_Adventurer_with_orientation_W() {
            Adventurer adventurer = new Adventurer(1,1,"W");
            Adventurer adventurerToCompare = new Adventurer(1,1,"N");

            adventurer = adventurer.changeDirection("D");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_S_when_given_G_to_Adventurer_with_orientation_W() {
            Adventurer adventurer = new Adventurer(1,1,"W");
            Adventurer adventurerToCompare = new Adventurer(1,1,"S");

            adventurer = adventurer.changeDirection("G");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_S_when_given_D_to_Adventurer_with_orientation_E() {
            Adventurer adventurer = new Adventurer(1,1,"E");
            Adventurer adventurerToCompare = new Adventurer(1,1,"S");

            adventurer = adventurer.changeDirection("D");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }

        @Test
        void return_Adventurer_with_orientation_N_when_given_G_to_Adventurer_with_orientation_E() {
            Adventurer adventurer = new Adventurer(1,1,"E");
            Adventurer adventurerToCompare = new Adventurer(1,1,"N");

            adventurer = adventurer.changeDirection("G");

            assertThat(adventurer).isEqualTo(adventurerToCompare);
        }


    }



}
