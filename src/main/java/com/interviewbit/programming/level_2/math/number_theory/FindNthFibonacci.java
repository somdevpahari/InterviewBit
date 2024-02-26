package com.interviewbit.programming.level_2.math.number_theory;

public class FindNthFibonacci {
    public final int MOD = 1000000007;

    public int getNthFib(int A) {
        // T. C. -> O(N)
        if (A <= 2) {
            return 1;
        }
        int prev = 1;
        int curr = 1;
        int temp;
        for (int i = 3; i <= A; i++) {
            temp = curr;
            curr = (prev + curr) % MOD;
            prev = temp;
        }
        return curr;
    }

    public long[][] matrixMultiply(long[][] A, long[][] B) {
        long[][] result = new long[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    result[i][j] += ((A[i][k] % MOD) * (B[k][j] % MOD)) % MOD;
                    result[i][j] %= MOD;
                }
            }
        }
        return result;
    }

    public long[][] matrixPower(long[][] matrix, long power) {
        long[][] result = {{1, 0}, {0, 1}};
        while (power > 0) {
            if (power % 2 == 1) {
                result = matrixMultiply(result, matrix);
            }
            matrix = matrixMultiply(matrix, matrix);
            power /= 2;
        }
        return result;
    }

    public int nthFibonacciModuloA(int A) {
        // T. C. -> O(log(N))
        if (A <= 2) {
            return 1;
        }
        long[][] baseMatrix = {{1, 1}, {1, 0}};
        long[][] resultMatrix = matrixPower(baseMatrix, A - 1);
        return (int) resultMatrix[0][0];
    }
}
