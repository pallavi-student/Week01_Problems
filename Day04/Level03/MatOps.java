import java.util.Random;

public class MatOps {
    public static void main(String[] args) {
        int[][] a = genMat(3, 3); // gen mat A
        int[][] b = genMat(3, 3); // gen mat B

   System.out.println("Mat A:");
        show(a); // print mat A
        System.out.println("Mat B:");
        show(b); // print mat B

        System.out.println("Add:");
        show(add(a, b)); // add two mats

        System.out.println("Sub:");
        show(sub(a, b)); // subtract mats

       System.out.println("Mul:");
        show(mul(a, b)); // multiply mats

        System.out.println("Trans A:");
        show(trans(a)); // transpose A

        System.out.println("Det 2x2 A:");
        System.out.println(det2(new int[][]{{a[0][0], a[0][1]}, {a[1][0], a[1][1]}})); // det of 2x2

      System.out.println("Det 3x3 A:");
        System.out.println(det3(a)); // det of 3x3

        System.out.println("Inv 2x2 A:");
        show(inv2(new int[][]{{a[0][0], a[0][1]}, {a[1][0], a[1][1]}})); // inverse of 2x2
    }

    // gen random mat
    public static int[][] genMat(int r, int c) {
        Random rand = new Random();
        int[][] mat = new int[r][c];
      for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                mat[i][j] = rand.nextInt(10); // random val 0-9
            }
        }
        return mat;
    }
    // add mats
    public static int[][] add(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        return res;
    }
    // sub mats
    public static int[][] sub(int[][] a, int[][] b) {
        int r = a.length, c = a[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = a[i][j] - b[i][j];
            }
        }
        return res;
    }
    // mul mats
    public static int[][] mul(int[][] a, int[][] b) {
        int r = a.length, c = b[0].length;
        int[][] res = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    res[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return res;
    }
    // trans mat
    public static int[][] trans(int[][] mat) {
        int r = mat.length, c = mat[0].length;
        int[][] t = new int[c][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                t[j][i] = mat[i][j];
            }
        }
        return t;
    }
    // det of 2x2
    public static int det2(int[][] mat) {
        return mat[0][0] * mat[1][1] - mat[0][1] * mat[1][0];
    }
    // det of 3x3
    public static int det3(int[][] mat) {
        int a = mat[0][0], b = mat[0][1], c = mat[0][2];
        int d = mat[1][0], e = mat[1][1], f = mat[1][2];
        int g = mat[2][0], h = mat[2][1], i = mat[2][2];
        return a * (e * i - f * h) - b * (d * i - f * g) + c * (d * h - e * g);
    }
    // inv of 2x2
    public static double[][] inv2(int[][] mat) {
        int det = det2(mat);
        if (det == 0) throw new ArithmeticException("No inverse"); // check singular
        double[][] inv = new double[2][2];
        inv[0][0] = mat[1][1] / (double) det;
        inv[0][1] = -mat[0][1] / (double) det;
        inv[1][0] = -mat[1][0] / (double) det;
        inv[1][1] = mat[0][0] / (double) det;
        return inv;
    }
    // print mat
    public static void show(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    // print mat (double)
    public static void show(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
