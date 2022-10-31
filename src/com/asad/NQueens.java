package com.asad;

class Solution {
    boolean[] col;
    boolean[] pd;
    boolean[] nd;
    List < List < String >> ans = new ArrayList < > ();
    public List < List < String >> solveNQueens(int n) {
        col = new boolean[n];
        pd = new boolean[n + n - 1];
        nd = new boolean[n + n - 1];
        String rowStr = ".".repeat(n);
        List < String > list = new ArrayList < > (n);
        for (int i = 0; i < n; i++) list.add(rowStr);
        helper(0, 0, n, list);
        return ans;
    }
    void helper(int k, int row, int n, List < String > list) {
        if (k == n) {
            List < String > list2 = new ArrayList < String > ();
            list2.addAll(list);
            ans.add(list2);
            return;
        }
        if (row >= n) return;
        for (int i = 0; i < n; i++) {
            if (!(col[i] || pd[row + i] || nd[row - i + n - 1])) {
                col[i] = true;
                pd[row + i] = true;
                nd[row - i + n - 1] = true;
                String rowStr = list.get(row),
                    newStr = rowStr.substring(0, i) + 'Q' + rowStr.substring(i + 1);
                list.set(row, newStr);

                helper(k + 1, row + 1, n, list);

                col[i] = false;
                pd[row + i] = false;
                nd[row - i + n - 1] = false;
                list.set(row, rowStr);
            }
        }
        return;
    }
}
