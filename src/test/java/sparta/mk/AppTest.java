package sparta.mk;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.Arrays;


public class AppTest{
        @Test
        @DisplayName("Does it arrange in Ascendig order Positive and Negative")
        void checkThatItArrangesInAscendingOrder() {
            int[] inputData = {10,-8, 0, 81, 26, 45};
            int[] expected = {-8, 0, 10, 26, 45, 81};
            App.bubbleSort(inputData);
            Assertions.assertArrayEquals( expected, inputData);
        }

        @Test
        @DisplayName("Does it arrange in Ascendig order Only Negatives")
        void checkThatItArrangesInAscendingOrderNegative() {
            int[] inputData = {-10, -6, -1, -2, -26, -45};
            int[] expected = {-45,-26, -10,-6,-2,-1};
            App.bubbleSort(inputData);
            System.out.print(Arrays.toString(inputData));
            Assertions.assertArrayEquals(expected, inputData);
        }

        @Test
        @DisplayName("check For Null array")
        void checkForNull() {
            int[] inputData = {10,-8, 0, 81, 26, 45};
            App.bubbleSort(inputData);
            Assertions.assertNotNull(inputData);
        }
}
