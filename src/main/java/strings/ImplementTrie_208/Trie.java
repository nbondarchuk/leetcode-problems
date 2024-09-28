package strings.ImplementTrie_208;

class Trie {

    private static final Object VALUE_MARKER = new Object();

    private Node root;

    public Trie() {
    }

    public void insert(String word) {
        root = put(root, word, 0);
    }

    public boolean search(String word) {
        Node node = get(root, word, 0);
        return node != null && node.value == VALUE_MARKER;
    }

    public boolean startsWith(String prefix) {
        Node node = get(root, prefix, 0);
        return node != null;
    }

    private Node get(Node x, String key, int d) {
        if (x == null) return null;
        if (d == key.length()) {
            return x;
        }
        char ch = key.charAt(d);
        return get(x.next[ch], key, d + 1);
    }

    private Node put(Node x, String key, int d) {
        if (x == null) x = new Node();
        if (d == key.length()) {
            x.value = VALUE_MARKER;
            return x;
        }
        char ch = key.charAt(d);
        x.next[ch] = put(x.next[ch], key, d + 1);
        return x;
    }

    private static class Node {

        private Object value;

        private final Node[] next = new Node[256];
    }
}