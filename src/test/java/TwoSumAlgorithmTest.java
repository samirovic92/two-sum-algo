import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumAlgorithmTest {

    TwoSumAlgorithm twoSumAlgorithm;

    @BeforeEach
    public void setup() {
        twoSumAlgorithm = new TwoSumAlgorithm();
    }

    @Test
    public void case_1() {
        // Given
        int nums[] = {2,7,11,15};
        int target = 9;

        // When
        int indexes[] = twoSumAlgorithm.getTwoSum(nums, target);

        // Then
        assertEquals(indexes[0], 0);
        assertEquals(indexes[1], 1);
    }

    @Test
    public void case_2() {
        // Given
        int nums[] = {3,2,4};
        int target = 6;

        // When
        int indexes[] = twoSumAlgorithm.getTwoSum(nums, target);

        // Then
        assertEquals(indexes[0], 1);
        assertEquals(indexes[1], 2);
    }

    @Test
    public void case_3() {
        // Given
        int nums[] = {3, 3};
        int target = 6;

        // When
        int indexes[] = twoSumAlgorithm.getTwoSum(nums, target);

        // Then
        assertEquals(indexes[0], 0);
        assertEquals(indexes[1], 1);
    }

    @Test
    public void case_4() {
        // Given
        int nums[] = {-3,4,3,90};
        int target = 0;

        // When
        int indexes[] = twoSumAlgorithm.getTwoSum(nums, target);

        // Then
        assertEquals(indexes[0], 0);
        assertEquals(indexes[1], 2);
    }
}