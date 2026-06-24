class Solution {
    private static final long MOD = 1_000_000_007L;

    private long[] matVecMul(long[][] A, long[] v) {
        int m = A.length;
        long[] res = new long[m];

        for (int i = 0; i < m; i++) {
            long cur = 0;
            for (int j = 0; j < m; j++) {
                cur = (cur + A[i][j] * v[j]) % MOD;
            }
            res[i] = cur;
        }
        return res;
    }

    private long[][] matMul(long[][] A, long[][] B) {
        int m = A.length;
        long[][] C = new long[m][m];

        for (int i = 0; i < m; i++) {
            for (int k = 0; k < m; k++) {
                if (A[i][k] == 0) continue;

                long aik = A[i][k];
                for (int j = 0; j < m; j++) {
                    C[i][j] = (C[i][j] + aik * B[k][j]) % MOD;
                }
            }
        }
        return C;
    }

    private long[] applyPower(long[][] M, long exp, long[] vec) {
        while (exp > 0) {
            if ((exp & 1) == 1) {
                vec = matVecMul(M, vec);
            }

            exp >>= 1;

            if (exp > 0) {
                M = matMul(M, M);
            }
        }
        return vec;
    }

    public int zigZagArrays(int n, int l, int r) {
        int m = r - l + 1;

        long[][] M = new long[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                M[i][j] = Math.min(i, j);
            }
        }

        long[] base;
        long power;

        if ((n & 1) == 0) {
            base = new long[m];
            for (int i = 0; i < m; i++) {
                base[i] = i;
            }
            power = (n - 2L) / 2;
        } else {
            base = new long[m];
            for (int w = 0; w < m; w++) {
                long k = w;
                base[w] = (k * m - k * (k + 1) / 2) % MOD;
            }
            power = (n - 3L) / 2;
        }

        long[] u = applyPower(M, power, base);

        long sum = 0;
        for (long x : u) {
            sum = (sum + x) % MOD;
        }

        return (int) ((2 * sum) % MOD);
    }
}