
public class MethodApplication {

    public void shuffle(int[] d) {
        for (int i = 0; i < d.length; i++) {
            int swap = d[i];
            int random = (int) (Math.random() * d.length);
            d[i] = d[random];
            d[random] = swap;
        }
    }

    public void remove(int[] d, int i) {
        if (i < 0 || i > d.length - 1) {
            return;
        }
        for (int j = i; j < d.length - 1; j++) {
            d[j] = d[j + 1];
        }
        d[d.length - 1] = 0;
    }

    public void insert(int d[], int i, int x) {
        if (i < 0 || i > d.length - 1) {
            return;
        }
        for (int j = d.length - 1; j > i; j--) {
            d[j] = d[j - 1];
        }
        d[i] = x;
    }

    public boolean isLowerTriangular(double[][] d) {
        if (isSymmetric(d)) {
            for (int i = 0; i < d.length - 1; i++) {
                int count = 0;
                for (int j = i + 1; j < d[i].length; j++) {
                    if (d[i][j] == 0) {
                        count++;
                    }
                }
                if (count != d.length - 1 - i) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isSymmetric(double[][] d) {
        for (int i = 0; i < d.length; i++) {
            if (d.length != d[i].length) {
                return false;
            }
        }
        return true;
    }

    public int[] maxmin(int[] d) {
        int result[] = {Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < d.length; i++) {
            if (d[i] > result[0]) {
                result[0] = d[i];
            }
            if (d[i] < result[1]) {
                result[1] = d[i];
            }
        }
        return result;
    }

    public int sumOfColumn(int[][] d, int col) {
        int sum = 0;
        for (int i = 0; i < d.length; i++) {
            sum += d[i][col];
        }
        return sum;
    }

    public int rowOfMax(int[][] d) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] >= max) {
                    max = d[i][j];
                    index = i;
                }
            }
        }
        return index;
    }

}
