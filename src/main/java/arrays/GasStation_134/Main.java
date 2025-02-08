package arrays.GasStation_134;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().canCompleteCircuit(new int[]{1, 2, 3, 4, 5}, new int[]{3, 4, 5, 1, 2})).isEqualTo(3);
    }
}
