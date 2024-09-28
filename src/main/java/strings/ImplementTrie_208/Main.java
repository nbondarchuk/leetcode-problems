package strings.ImplementTrie_208;

import common.Difficulty;

import static common.DifficultyLevel.MEDIUM;
import static org.assertj.core.api.Assertions.assertThat;

/**
 * <a href="https://leetcode.com/problems/implement-trie-prefix-tree">Implement Trie (Prefix Tree)</a>
 */
@Difficulty(MEDIUM)
class Main {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");

        assertThat(trie.search("apple")).isTrue();
        assertThat(trie.search("app")).isFalse();
        assertThat(trie.startsWith("app")).isTrue();

        trie.insert("app");
        assertThat(trie.search("app")).isTrue();
    }
}
