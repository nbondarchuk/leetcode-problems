package graphs.NumberOfIslands_200;

import java.util.HashMap;
import java.util.Map;

public class UnionFind {

    private int count;

    private final int[] id;

    public UnionFind(int n) {
        count = n;
        id = new int[count];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }

    }

    void union(int p, int q) {
        int pRoot = find(p);
        int qRoot = find(q);
        if (pRoot == qRoot) return;
        id[pRoot] = qRoot;
    }

    int count() {
        int c = 0;
        Map<Integer, Integer> sz = new HashMap<>();
        for (int i = 0; i < id.length; i++) {
            int root = find(i);
            sz.merge(root, 1, Integer::sum);
        }

        for (Integer i : sz.values()) {
            if (i > 1) {
                c++;
            }
        }

        return c;
    }

    private int find(int p) {  // Find component name.
        while (p != id[p]) p = id[p];
        return p;
    }
}
