package strings.DesignAddAndSearchWordsDataStructure_211;

class WordDictionary {

    private static final Object VALUE_MARKER = new Object();

    private Node root;

    public WordDictionary() {
    }

    public void addWord(String word) {
        root = put(root, word, 0);
    }

    public boolean search(String word) {
        Node node = get(root, word, 0);
        return node != null && node.value == VALUE_MARKER;
    }

    private Node get(Node x, String key, int d) {
        if (x == null) return x;
        if (d == key.length()) {
            return x;
        }

        char c = key.charAt(d);
        if (c != '.') {
            return get(x.next[c - 'a'], key, d + 1);
        } else {
            for (int i = 0; i < 26; i++) {
                if (x.next[i] != null) {
                    Node node = get(x.next[i], key, d + 1);
                    if (node != null && node.value == VALUE_MARKER) {
                        return node;
                    }
                }
            }
            return null;
        }
    }

    private Node put(Node x, String key, int d) {
        if (x == null) x = new Node();
        if (d == key.length()) {
            x.value = VALUE_MARKER;
            return x;
        }
        char ch = key.charAt(d);
        x.next[ch - 'a'] = put(x.next[ch - 'a'], key, d + 1);
        return x;
    }

    private static class Node {

        private Object value;

        private final Node[] next = new Node[26];
    }
}