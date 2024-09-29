package math.HappyNumber_202;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/happy-number">Happy Number</a>
 */
class Main {

    public static void main(String[] args) {
        assertThat(new Solution().isHappy(19)).isTrue();
        assertThat(new Solution().isHappy(2)).isFalse();
    }
}
