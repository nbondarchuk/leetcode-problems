package search.GuessNumberHigherOrLower_374;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SolutionTest {

    @Test
    void guessNumber() {
        assertThat(new Solution(1).guessNumber(1)).isEqualTo(1);
        assertThat(new Solution(6).guessNumber(10)).isEqualTo(6);
    }
}
