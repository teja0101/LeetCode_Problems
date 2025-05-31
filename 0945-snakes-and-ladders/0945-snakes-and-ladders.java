class Solution {
    public int snakesAndLadders(int[][] board) {
        /*
        // [[-1,-1,-1,-1,-1,-1],
        //  [-1,-1,-1,-1,-1,-1],
        //  [-1,-1,-1,-1,-1,-1],
        //  [-1,35,-1,-1,13,-1],
        //  [-1,-1,-1,-1,-1,-1],
        //  [-1,15,-1,-1,-1,-1]]

        // q{15, -1, -1, -1, -1, -1}   // m = 1
           q{-1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1 } m = 2
           q{-1, -1, -1, -1,  }
        */
        int n = board.length;
        int[] min_rolls = new int[n * n + 1];
        Arrays.fill(min_rolls, -1);
        Queue<Integer> q = new LinkedList<>();
        min_rolls[1] = 0;
        q.add(1);

        while (!q.isEmpty()) {
            int x = q.poll();
            for (int i = 1; (i <= 6 && x + i <= n * n); i++) {
                int t = x + i;
                int row = (t - 1) / n;
                int col = (t - 1) % n;
                int v = board[n - 1 - row][(row % 2 == 1) ? (n - 1 - col) : col];
                int y = (v > 0 ? v : t);
                if (y == n * n) return min_rolls[x] + 1;
                if (min_rolls[y] == -1) {
                    min_rolls[y] = min_rolls[x] + 1;
                    q.add(y);
                }
            }
        }
        return -1;
    }
}
