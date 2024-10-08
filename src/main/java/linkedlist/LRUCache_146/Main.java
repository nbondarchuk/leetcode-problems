package linkedlist.LRUCache_146;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/lru-cache">LRU Cache</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);

        assertThat(cache.get(1)).isEqualTo(1);

        cache.put(3, 3);

        assertThat(cache.get(2)).isEqualTo(-1);

        cache.put(4, 4);

        assertThat(cache.get(1)).isEqualTo(-1);
        assertThat(cache.get(3)).isEqualTo(3);
        assertThat(cache.get(4)).isEqualTo(4);
    }
}
