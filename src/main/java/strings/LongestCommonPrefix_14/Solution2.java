package strings.LongestCommonPrefix_14;

class Solution2 {

    private static class Node {

        private String value;

        private final Node[] children = new Node[26];

        public int numChildren() {
            int c = 0;
            for (int i = 0; i < children.length; i++) {
                if (children[i] != null) {
                    c++;
                }
            }
            return c;
        }
    }

    private static class Trie {

        private Node root;

        public void insert(String word) {
            root = put(root, word, 0);
        }

        private Node put(Node x, String word, int d) {
            if (x == null) x = new Node();
            if (word.length() == d) {
                x.value = word;
                return x;
            }

            char ch = word.charAt(d);
            x.children[ch-'a'] = put(x.children[ch-'a'], word, d+1);
            return x;
        }
    }

    public String longestCommonPrefix(String[] strs) {
        Trie t = new Trie();
        for (String str: strs) {
            t.insert(str);
        }

        Node n = t.root;
        StringBuilder sb = new StringBuilder();
        while (n.numChildren() == 1 && n.value == null) {
            for (int i = 0; i < n.children.length; i++) {
                if (n.children[i] != null) {
                    n = n.children[i];
                    sb.append((char) (i+'a'));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
